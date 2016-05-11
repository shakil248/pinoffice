'use strict';
app.factory('homeService',['$http','config', function($http,config) {
    return {
    	searchPinCode: function(searchKey) { 
    		var promise  = $http.get(config.apiUrl+'getpin',{params: {searchKey: searchKey}}).
            then(function(response) {
            	document.body.style.cursor='default';
            	return response.data;
                
            });
			return promise ;
		},
		searchLocation: function(searchKey) { 
    		var promise  = $http.get(config.apiUrl+'getlocation',{params: {searchKey: searchKey}}).
            then(function(response) {
            	document.body.style.cursor='default';
            	return response.data;
                
            });
			return promise ;
		},
		
		postComment: function(post, scope) { 
			var res = $http.post(config.apiUrl+'postcomment',post);
			res.success(function(data, status, headers, config) {
				  console.log("Success", data);
				  scope.saveStatus = "comment posted";
				  
			});
			res.error(function(data, status, headers, config) {
				 console.log(data);
				 scope.saveStatus = "!Oops saving failed";
			});	
			
			},
    
    
    };
}]);







