'use strict';
var app = angular.module('pinCodeApp',['ngRoute']);
app.config(['$routeProvider', function($routeProvider) {
      $routeProvider.when('/', {templateUrl:'resources/partials/home.html', controller: 'homeCtrl'});
}]);
	
app.constant('config', {
      apiUrl: "http://localhost:8080/pincode/"
});







