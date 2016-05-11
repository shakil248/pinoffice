'use strict';
app.controller('homeCtrl', ['$scope','homeService', function ($scope,homeService) {

	$scope.errorMessage = "";
    $scope.searchPinCode = function() {
    	if($scope.searchKey != undefined && $scope.searchKey != ""){
    	homeService.searchPinCode($scope.searchKey).then(function(pincodes) {
    		if(pincodes != ""){
		    	$scope.pincodes = pincodes;	
		    	$scope.errorMessage = "";
    		}else{
    			$scope.pincodes="";
    			$scope.errorMessage = "No pin code found";
    		}    	
    	});
    	}
    };
    
    $scope.postComment = function() {
    	if($scope.post != undefined && $scope.post != ""){
    	document.body.style.cursor='wait';
    	homeService.postComment($scope.post, $scope);
    	}
    };
}]);