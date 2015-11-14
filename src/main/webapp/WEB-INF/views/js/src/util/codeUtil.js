/**
 * @param  {CodeDataSet} codeDataSet
 * @constructor
 */
diCrm.util.CodeUtil  = function(codeDataSet){
    /*this.nId = htDataSet.id;
    this.sName = htDataSet.name;
    this.nParentId = htDataSet.parentId;
    this.nDepth = htDataSet.depth;

    this._aChildren = [];*/
};

diCrm.util.CodeUtil.prototype = {
	_oCodeMap: null,				// key,value pair -> code,value pair

	init: function() {
		this.loadFromDb();
	},
	loadFromDb: function() {
		// TODO : test code, please load from database throw node.js
		this._oCodeMap = [ 			
			{
				"name": "Industry",
				"code": "CNF001",
				"value": {
							"category": "Food",
							"sub_category": "Vietnam Noodle"	
						}
			},
			{
				"name": "Industry",
				"code": "CNF002",
				"value": {
							"category": "Culture",
							"sub_category": "Online Book Store"	
						}
			}
		];
		return this._oCodeMap;
	},
	find: function(sCategory, sName) {
		var result = "";
		if (this._oCodeMap) {
			this._oCodeMap.forEach(function(obj) {
				var code = obj["value"];
				if (code["category"] == sCategory && code["sub_category"] == sName) {
					result = obj["code"];
				}
			});
		}
		return result;

	},
	getCode: function(sCategory, sName) {
		return this.find(sCategory, sName);
	}
};