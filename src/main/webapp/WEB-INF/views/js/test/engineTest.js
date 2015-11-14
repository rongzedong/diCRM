test("init code object", function() {
	var obj = diCrm.util.CodeUtil.prototype;
	obj.init();
	equal(obj.getCode("Food","Vietnam Noodle"), 
		"CNF001",
		"find industry code!!");
});

/*test("create pipeline object", function() {

	// create leads
	//var oLead = diCrm.model.Lead;
	//oLead.create();


	// create actions

	// create opportunities

	// create acccounts

	// create approvals

	// create orders

	// pipeline object
	var pObj = diCrm.model.Pipeline.prototype;	



});*/