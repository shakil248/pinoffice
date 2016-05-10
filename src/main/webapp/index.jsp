<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html ng-app="pinCodeApp">
<title>Search Pin Code</title>
<head>
<spring:url value="/resources/lib/css/bootstrap.min.css" var="bootstrapCSS" />
<spring:url value="/resources/lib/angular/angular.js" var="angularJS" />
<spring:url value="/resources/lib/angular/angular-route.js" var="angularRouteJS" />
<spring:url value="/resources/js/app.js" var="appJS" />

<spring:url value="/resources/js/controllers/homeCtrl.js" var="homeCtrlJS" />
<spring:url value="/resources/js/services/homeService.js" var="homeServiceJS" />

 <link href="${bootstrapCSS}" rel="stylesheet" type="text/css" ></link>
<script src="${angularJS}"></script>
<script src="${angularRouteJS}"></script>
<script src="${appJS}"></script>
<script src="${homeCtrlJS}"></script>
<script src="${homeServiceJS}"></script>
    
</head>
<h3>PinCodeIndia.co</h3>
<body>
<div ng-view></div>
</body>
</html>
