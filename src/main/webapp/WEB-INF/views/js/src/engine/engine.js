/*var organizationTree = function(htOptions){
    var oOrganizations = new naver.collection.Organizations(htOptions.sApiUrl),
        oOrganizationTree = new naver.view.OrganizationTree(htOptions.sSelector, oOrganizations);

    if(htOptions.useContextMenu){
        oOrganizationTree = new naver.view.OrganizationTreeContextMenu(oOrganizationTree);
    }

    return oOrganizationTree;
};*/

var CrmEngine = {
	oCodeUtil: null,				// have code util object
	oPipeLine: null,

	init: function(obj) {
		initUtil();					// init the various util object

		loadEnv(obj);				// get the industry option, and environment values
		if (checkEnv()) {			// when load successfully
			initEngine(obj);	
		}
	},
	initUtil: function(obj) {		// dependency injection	
		oCodeUtil = obj;
	},
	loadEnv: function(obj) {
		var sIndustryCode = oCodeUtil.getCode(obj.sCategoryName, obj.sIndustryName);

		oPipeLine = this.diCrm.model.Pipeline;
		oPipeLine.init(sIndustrycode);

	},
	initEngine: function(obj) {

	}
};

var CrmEngineCtrl = {
	oCrmEngine: null,

	init: function() {

	},
	manageAction: function(obj) {

	},
	manageLead: function(obj) {

	},
	manageUser: function(obj) {

	},
	managePipeline: function(obj) {
		//diCrm.model.Pipeline
	}
};




