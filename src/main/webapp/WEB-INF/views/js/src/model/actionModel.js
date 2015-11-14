function Action() {
	// domain schema - restrict domain structure
	this._actionSchema = {
			"nId": "",
			"name": "",
			"type": "",
			"description": "",
			"accounts": [],
			"leads": []
		};

	var oDomain = new DomainDiCrm(this._actionSchema);
 	var pObject = this;

 	extend(pObject, oDomain);
 	
    return pObject;
 };

 /**
*	@props : model schema object,
*   @obj   : data object
**/
Action.prototype.create = function(obj) {
	var oAction = new Action();

	// save only schema field
	for(var p in obj) {
		// TODO : check property is existed??
		oAction["set" + p](obj[p]);
	}

	// TODO : save in the db
	return oAction;
};

Action.prototype.read = function(obj) {
	// TODO : add various search condition
	// TODO : retrieve from db
};

Action.prototype.update = function(obj) {
	// TODO : update from db
};

Action.prototype.delete = function(obj) {
	// TODO : delete from db
};