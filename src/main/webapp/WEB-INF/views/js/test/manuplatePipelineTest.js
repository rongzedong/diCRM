var obj = diCrm.model.Pipeline.prototype; 

test("create pipeline object", function(input) {
	/*obj.init({
		"nId": "P1511100001",
		"name": "Power Plant Supplier",
		"categoryName": "Power Plant",
	});*/
	obj.init(input);
	equal(obj.find(input["nId"])["name"], 
		input["name"],
		"initialize pipeline");
});

test("add leads in the pipeline", function(input) {
	obj.addLead(input);
	var oLead = obj.getLeads().find(obj.nId);
	equal(oLead["nId"], obj.nId, "add lead in the pipeline"]);
});

// TODO : CRUD test

// define pipeline flow by user

var arrStepEx = [
			"register",
			"confirm",
			"bid",
			"nego",
			"success",		// basic condition
			"fail",			// basic condition
			"cancel",		// basic condition
		];

test("register pipeline step dynamic!!", function() {

	// create get/set function dynamic
	// && make step(ex. 1. register -> 2.confirm -> 3.bid -> 4.nego -> 5. (success/fail or cancel))

	obj.addPipelineStep(arrStepEx);
	equal(obj.getPipelineSteps()[1], arrStepEx[1], "confirm pipeline step");
});

test("confirm next/previous functions", function(input) {
	eqaul(obj.getPipelineStep(1), arrStepEx[1], "get value from index value");

	obj.setPipelineStep(arrStepEx[2]);
	equal(obj.nextStep(), arrStepEx[3], "confirm next step");
	equal(obj.previousStep(), arrStepEx[2], "confirm previous step");

	// end value
	obj.setPipelineStep(arrStepEx[arrStepEx.length - 1]);
	equal(obj.nextStep, "", "confirm out of index[end value]");

	// start value
	obj.setPipelineStep(arrStepEx[0]);
	equal(obj.previousStep(), "", "confirm out ouf index[first value]");
});


test("add trigger point", function() {
	// from/to status && condition
	[{
		"from_status": "",
		"to_status": "",
		"condition": ""
	}, {

	}];
});

// trigger point : setup by administrator, the standards defined by simple condition
test("update pipeline status using trigger point", function(input) {
	if (obj.confirmTriggerCondition(input)) {
		obj.changePipeline(input);
	}
});