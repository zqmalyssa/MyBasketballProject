<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>xprj verion page</title>
    <link href="<c:url value='/static/thirdParty/bootstrap-3.3.7-dist/css/bootstrap.min.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/userProfile.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/table.css' />" rel="stylesheet"></link>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
     <script src="<c:url value='/static/thirdParty/jquery/jquery-3.1.1.min.js' />"></script>
     <script src="<c:url value='/static/thirdParty/chart/Chart.bundle.min.js' />"></script>
      <script src="<c:url value='/static/js/myChart.js' />"></script>
</head>

<body>	
	<div class="container">
		<div class="row">
		    <div class="col-sm-3">
		    	<jsp:include page="../leftNav.jsp"></jsp:include>
		    </div>
		    <div class="col-sm-9">
		    	<jsp:include page="fragment/myProfile/userProfile.jsp"></jsp:include>
		    </div>
		    
		</div>
	</div>
</body>
</html>