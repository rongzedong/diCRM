module("Javascript Default Test", {});

// general prospect test
function Field(val){
    this.value = val;
}

Field.prototype = {
    get value(){
        return this._value;
    },
    set value(val){
        this._value = val;
    }
};

test("get/set test", function() {
	var nId = "201511120001";
	//var obj = new Field(nId);	// nId example
	var obj = new Field("201511120001");	// nId example
	equal(obj.value, nId, "success getValue dynamically");
	
	obj.value = "testnID!!";
	equal(obj.value, "testnID!!", "success setValue!!");
});

var user = function (props) {
    var pObject = {};
    for (p in props) {
    	(function (pc) {
    		pObject['set' + pc] = function (v) {
    			props[pc] = v;
    			return pObject;
    		}
    		pObject['get' + pc] = function () {
    			return props[pc];
    		}
    	})(p);
    }
    return pObject;
}

test("get/set dynamically", function() {
	var john = user({name : 'Andreas', age : 21});
	equal(john.getname(), "Andreas", "user get dynamically");
	equal(john.setage(19).getage(), 19, "user set dynamically");
});

function InheritFunc() {
    // domain schema
    var props = {
            "nId": "",
            "name": "",
            "type": "",
            "description": "",
            "accounts": [],
            "activities": []
        };
    var domain = new DomainDiCrm(props);
    var pObject = this;

    extend(pObject, domain);

    return pObject;
}

test("extends prototype", function() {
    var obj = new InheritFunc();
    equal(obj.setnId("12345").getnId(), "12345", "inherit nid property");
});