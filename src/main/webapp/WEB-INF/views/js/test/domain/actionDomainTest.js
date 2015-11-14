module("Action Domain Test", {
	beforeEach: function() {
		this.actionObj = new Action();

		this.mockManager = new ManageTestData(); 	
		this.actionData = this.mockManager.getTestActionData();
	}
});

test("create from function", function() {
	var obj = this.actionObj;
	var data = this.actionData;

	var oCreatedObj = obj.create(data[0]);
	equal(oCreatedObj.getnId(), data[0].nId, "[nId]create action through create function!");
	equal(oCreatedObj.getname(), data[0].name, "[name]create action through create function!");
	equal(oCreatedObj.getleads()["nId"], data[0]["leads"]["nId"], "[leads nId]create action through create function!");
});