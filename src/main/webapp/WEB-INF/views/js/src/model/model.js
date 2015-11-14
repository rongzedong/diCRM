
// TODO : getter/setter function 

/**
 * @param  {pipeDataSet} pipeDataSet
 * @constructor
 */
diCrm.model.Pipeline = function(pipeDataSet) {
	this.nId            	= pipeDataSet.nId;
    this.name 				= pipeDataSet.name;
    this.categoryName 		= pipeDataSet.categoryName;
    this._status			= [];
    this._leads 			= [];
    this._actions 			= [];
    this._opportunities 	= [];
    this._accounts			= [];
    this._approvals 		= [];
    this._orders 			= [];
    this._triggerCondition 	= [];
};

diCrm.model.Pipeline.prototype = {




	// TODO : CRUD function in the array property
	/*addLead: function(oLead) {
		return this._leads.push(oLead);
	},
	removeLead: function(oLead) {
		
	},
	updateLead: function(oLead) {

	}*/
};

/**
 * @param  {gradeDataSet} gradeDataSet
 * @constructor
 */
 diCrm.model.Grade = function(gradeDataSet) {
	this.name 			= gradeDataSet.name;
    this.grade 			= gradeDataSet.grade;
    this.histories 		= [];
 };

diCrm.model.Grade.prototype = {
	addGradeHistory: function(oGrade) {

	},
	removeGradeHistory: function(oGrade) {

	}
};


/**
 * @param  {fileDataSet} fileDataSet
 * @constructor
 */
 diCrm.model.File = function(fileDataSet) {
	this.name 			= fileDataSet.name;
    this.path 			= fileDataSet.path;
    this.type 			= fileDataSet.type;
	this.size 			= fileDataSet.size;
	this.created_by 	= fileDataSet.created_by;
	this.created 		= fileDataSet.created;
 };

diCrm.model.File.prototype = {

};

/**
 * @param  {keymanDataSet} keymanDataSet
 * @constructor
 */
diCrm.model.Keyman = function(keymanDataSet) {
	this.name 			= keymanDataSet.name;
    this.account 		= keymanDataSet.account;
    this.status 		= keymanDataSet.status;
	this.grades 		= [];
};


diCrm.model.Keyman.prototype = {

};


/**
 * @param  {contactDataSet} contactDataSet
 * @constructor
 */
diCrm.model.Contact = function(contactDataSet) {
    this.name 			= contactDataSet.name;
	this.business_no 	= contactDataSet.business_no;
	this.phoneNumber	= contactDataSet.phoneNumber;
	this.address		= contactDataSet.address;
};

diCrm.model.Contact.prototype = {

};

/**
 * @param  {activityDataSet} activityDataSet
 * @constructor
 */
diCrm.model.Activity = function(activityDataSet) {
	this.name 			= activityDataSet.name;
	this.description 	= activityDataSet.description;
	this.created_date 	= activityDataSet.created_date;
	this.status 		= activityDataSet.status;
	this.account 		= activityDataSet.account;
	this.lead 			= activityDataSet.lead;
	this.approval 		= activityDataSet.approval;
	this.opportunity 	= activityDataSet.opportunity;
	this.order 			= activityDataSet.order;
	this.files 			= [];
};

diCrm.model.Activity.prototype = {
	
};

/**
 * @param  {accountDataSet} accountDataSet
 * @constructor
 */
diCrm.model.Account = function(accountDataSet) {
	this.nId			= accountDataSet.nId;
	this.name 			= accountDataSet.name;
	this.business_no 	= accountDataSet.business_no;
	this.grade 			= accountDataSet.grade;
	this.keymans 		= [];
	this.files 			= [];
};

diCrm.model.Account.prototype = {

};

/**
 * @param  {apprvDataSet} apprvDataSet
 * @constructor
 */
diCrm.model.Approval = function(apprvDataSet) {
 	this.files 			= [];
 };

diCrm.model.Approval.prototype = {
	"files": null
};

/**
 * @param  {opprtDataSet} opprtDataSet
 * @constructor
 */
diCrm.model.Opportunity = function(opprtDataSet) {
	this.files 			= [];
 }

diCrm.model.Opportunity.prototype = {

};

/**
 * @param  {orderDataSet} orderDataSet
 * @constructor
 */
diCrm.model.Order = function(orderDataSet) {
	this.name 			= accountDataSet.name;
	this.status 		= orderDataSet.status;
	this.actions 		= [];
	this.products 		= [];
	this.accounts 		= [];

};

diCrm.model.Order.prototype = {

};

/**
 * @param  {cmpgDataSet} cmpgDataSet
 * @constructor
 */
diCrm.model.Campaign = function(cmpgDataSet) {

};

diCrm.model.Campaign.prototype = {

};