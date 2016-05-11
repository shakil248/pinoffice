'use strict';
app.controller('homeCtrl', ['$scope','homeService', function ($scope,homeService) {

	$scope.errorMessage = "";
    $scope.searchPinCode = function() {
    	if($scope.searchKey != undefined && $scope.searchKey != ""){
    		if(!isNaN(parseInt($scope.searchKey)) && $scope.searchKey.length==6){
    			searchLocationByPinCode($scope.searchKey);
    		}else{
    			searchPinCodeByLocation($scope.searchKey);
    		}
    		
    	}
    };
    
    function searchPinCodeByLocation(searchKey){
    	document.body.style.cursor='wait';
		homeService.searchPinCode(searchKey).then(function(pincodes) {
		if(pincodes != ""){
	    	$scope.pincodes = pincodes;	
	    	$scope.errorMessage = "";
		}else{
			$scope.pincodes="";
			$scope.errorMessage = "No Pin Code found";
		}    	
		});
    }
    function searchLocationByPinCode(searchKey){
    	document.body.style.cursor='wait';
		homeService.searchLocation(searchKey).then(function(pincodes) {
		if(pincodes != ""){
	    	$scope.pincodes = pincodes;	
	    	$scope.errorMessage = "";
		}else{
			$scope.pincodes="";
			$scope.errorMessage = "No Location found";
		}    	
		});
    }
    $scope.postComment = function() {
    	if($scope.post != undefined && $scope.post != ""){
    	homeService.postComment($scope.post, $scope);
    	}
    };
}]);