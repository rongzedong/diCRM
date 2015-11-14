/**
* @props : domain schema
**/
function DomainDiCrm(props) {
 	var pObject = this;
    for (p in props) {
    	(function (pc) {
    		function isArray(v) {
    			return (Array.isArray(v));
    		}

    		function isExistArray(o, v) {
				return (o.indexOf(v) < 0) ? false : true;
    		}

			pObject['set' + pc] = function (v) {
				if (isArray(props[pc]) && !isArray(v))
					throw "[Type Mismatch] (Default Type : Array) Cannot set string value."
				props[pc] = v;
    			return pObject;
    		}

    		pObject['get' + pc] = function () {
    			return props[pc];
    		}	
    		
    		pObject['add' + pc] = function(v) {
    			var o = props[pc];
    			if (isArray(o)) { 
					if (!o) props[pc] = [];
					if (!isExistArray(o, v)) props[pc].push(v);
    			}
				return pObject;
	    	}

			pObject['remove' + pc] = function(v) {
				var o = props[pc];
				if (isArray(o) && o.length > 0) { 
					props[pc].splice(o.indexOf(v), 1);
				}
				return pObject;
			}	

    	})(p);
    }
    return pObject;
 };

/**
*	@obj : child object 
*	@props : added property
**/
function extend(obj,prop) {
	if ( !prop ) { prop = obj; obj = this; }
	for ( var i in prop ) obj[i] = prop[i];
	return obj;
};