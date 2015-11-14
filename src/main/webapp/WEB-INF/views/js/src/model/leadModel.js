function Lead() {
	// domain schema - restrict domain structure
	this._leadSchema = {
			"nId": "",
			"name": "",
			"type": "",
			"description": "",
			"accounts": [],
			"activities": []
		};

	var oDomain = new DomainDiCrm(this._leadSchema);
 	var pObject = this;

 	extend(pObject, oDomain);

    return pObject;
 };

/**
*	@props : model schema object,
*   @obj   : data object
**/
Lead.prototype.create = function(obj) {
	var oLead = new Lead();

	// save only schema field
	for(var p in obj) {
		// TODO : check property is existed??
		oLead["set" + p](obj[p]);
	}

	// TODO : save in the db
	return oLead;
};

Lead.prototype.read = function(obj) {
	// TODO : add various search condition
	// TODO : retrieve from db
};

Lead.prototype.update = function(obj) {
	// TODO : update from db
};

Lead.prototype.delete = function(obj) {
	// TODO : delete from db
};

/**
*	@oAction : action object
**/
Lead.prototype.addActivity = function(oAction) {
	var props = oAction._actionSchema;
	var pObject = {};
	for(var p in props) {
		pObject[p] = oAction["get" + p]();
	}
	return this.addactivities(pObject);
};
