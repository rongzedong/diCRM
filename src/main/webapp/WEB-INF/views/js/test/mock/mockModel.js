function ManageTestData() {
	var _leadList = [
		{
			"nId": "L1511100001",
			"name": "first lead",
			"type": "general info",
			"description": "new plant",
			"accounts": [
				{
					"nId": "A1511100001",
					"name": "Samsung Electronics"
				}	
			],
			"activities": [
				{
					"nId": "AC1511120001",
					"name": "visit Samsung Electronics, Suwon complex"
				}, 
				{
					"nId": "AC1511120002",
					"name": "visit LG Electronics, Yangje Building"
				}
			]
		},
		{
			"nId": "L1511100002",
			"name": "second lead",
			"type": "general info",
			"description": "new customer",
			"accounts": [
				{
					"nId": "A1511100002",
					"name": "LG Electronics"
				}	
			],
			"activities": []
		}
	];

	var _actionList = [
		{
			"nId": "AC1511120001",
			"name": "first lead",
			"type": "general info",
			"description": "new plant",
			"accounts": [
				{
					"nId": "A1511100001",
					"name": "Samsung Electronics"
				}	
			],
			"leads": [
				{
					"nId": "L1511100001",
					"name": "first lead"
				}, 
				{
					"nId": "L1511100002",
					"name": "second lead"
				}
			]
		},
		{
			"nId": "AC1511120002",
			"name": "second action",
			"type": "general info",
			"description": "new customer",
			"accounts": [
				{
					"nId": "A1511100002",
					"name": "LG Electronics"
				}	
			],
			"leads": []
		}
	];

	this.getTestLeadData = function() {
		return _leadList;
	} 

	this.getTestActionData = function() {
		return _actionList;
	}
};
