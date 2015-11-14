module("Leads Domain Test", {
	beforeEach: function() {
		this.leadObj = new Lead();

		this.mockManager = new ManageTestData(); 	
		this.leadData = this.mockManager.getTestLeadData();
		this.actionData = this.mockManager.getTestActionData();
	}
});

test("[String type] use props - create get/set function dynamically", function() {
	var obj = this.leadObj;
	var nId = "12345";
	equal(obj.setnId(nId).getnId(),nId,"get/set");
});


test("[Array type] use props - create get/set function dynamically", function() {
	var obj = this.leadObj;

	// set array
	equal(obj.setactivities(["a1","a2"]).getactivities()[0], "a1", "array get/set[0]");
	equal(obj.setactivities(["a1","a2"]).getactivities()[1], "a2", "array get/set[1]");

	// add array
	equal(obj.setactivities(["a1","a2"]).addactivities("a3").getactivities()[2], "a3", "array add");

	// remove array
	equal(obj.setactivities(["a1","a2","a3", "a4"]).removeactivities("a3").getactivities()[2], 
			"a4", "array remove");
});

test("array operation - remove empty array", function() {
	var obj = this.leadObj;
	equal(obj.setactivities([]).removeactivities("a1").getactivities().length, 0,"remove empty array");
});

test("array operation - add non-exist field", function() {
	var obj = this.leadObj;
	equal(obj.setNotExist("Not Exist"), undefined,"Not Exist field");
});

test("Type checking - prohibit from array to string", function() {
	var obj = this.leadObj;

	raises(function () {
        obj.setactivities(["a1","a2"]).setactivities(1);
    }, "[Type Mismatch] (Default Type : Array) Cannot set string value.", "throws error!");
});

test("use test declaration in the lead test data", function() {
	var arr = this.leadData;
	equal(arr.length, 2, "equal test data length");
	equal(arr[1].nId, "L1511100002", "find test data nId!");
}); 

test("[operation check]create lead", function() {
	var obj = this.leadObj;
	var data = this.leadData;
	
	equal(obj.setnId(data[0].nId).getnId(), data[0].nId, "set lead nId");
	equal(obj.setname(data[0].name).getname(), data[0].name, "set lead name");
	equal(obj.setactivities(data[0].activities).getactivities()[0]["nId"],
			 data[0].activities[0]["nId"], "set activities");
});

test("create from function", function() {
	var obj = this.leadObj;
	var data = this.leadData;

	var oCreatedObj = obj.create(data[0]);
	equal(oCreatedObj.getnId(), data[0].nId, "[nId]create lead through create function!");
	equal(oCreatedObj.getname(), data[0].name, "[name]create lead through create function!");
	equal(oCreatedObj.getactivities()["nId"], data[0]["activities"]["nId"], "[activities nId]create lead through create function!");
});

test("add activities", function() {
	var obj = this.leadObj;
	var leadData = this.leadData;
	var actionData = this.actionData;

	var oAction = new Action();
	var oCreateObj = oAction.create(actionData[0]);

	equal(oCreateObj.getnId(), actionData[0]["nId"], "create action data");
	equal(obj.addActivity(oCreateObj).getactivities()[0]["nId"], 
			actionData[0]["nId"], "[nId] add activity");

	var oNextObj = oAction.create(actionData[1]);
	equal(obj.setactivities(leadData[0].activities)
			 	.addactivities(oCreateObj)
			 		.addactivities(oNextObj)
			 			.getactivities().length
			//, leadData[0].activities.length + actionData.length
			, 4
			, "check activities length");

});
