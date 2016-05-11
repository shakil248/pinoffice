'use strict';
var app = angular.module('pinCodeApp',['ngRoute']);
app.config(['$routeProvider', function($routeProvider) {
      $routeProvider.when('/home', {templateUrl:'resources/partials/home.html', controller: 'homeCtrl'});
	  $routeProvider.otherwise({redirectTo:'/home'});
}]);
	
app.constant('config', {
      apiUrl: "http://localhost:8080/pincode/"
});







