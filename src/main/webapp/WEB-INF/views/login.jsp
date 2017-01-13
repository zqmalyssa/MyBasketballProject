<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>xprj verion page</title>
    <link href="<c:url value='/static/thirdParty/bootstrap-3.3.7-dist/css/bootstrap.min.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/userProfile.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/table.css' />" rel="stylesheet"></link>
     <link href="<c:url value='/static/css/login.css' />" rel="stylesheet"></link>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
     <script src="<c:url value='/static/thirdParty/jquery/jquery-3.1.1.min.js' />"></script>
     <script src="<c:url value='/static/thirdParty/chart/Chart.bundle.min.js' />"></script>
      <script src="<c:url value='/static/js/myChart.js' />"></script>
      <script src="<c:url value='/static/thirdParty/bootstrap-3.3.7-dist/js/bootstrap.min.js' />"></script>
     
</head>

<body>	
<c:url value="/login" var="loginUrl" />
<c:url value="/register" var="registerUrl" />
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <div class="account-wall">
                <div id="my-tab-content" class="tab-content">
    					<div class="tab-pane active" id="login">
	               			 <img class="profile-img" alt="" src="<c:url value='/static/img/login.png' />">
							 <springform:form action="${loginUrl}" method="post" modelAttribute="user" cssClass="form-signin">
								 <springform:input path="loginId" cssClass="form-control" placeholder="Username"  />
							     <springform:password path="loginPwd" cssClass="form-control" placeholder="Password" />
							     <input type="submit" class="btn btn-lg btn-default btn-block" value="Sign In" />
							 </springform:form>
               			<div id="tabs" data-tabs="tabs">
               				<p class="text-center"><a href="#register" data-toggle="tab">Need an Account?</a></p>
              				</div>
						</div>
						<div class="tab-pane" id="register">
							 <springform:form action="${registerUrl}" method="post" modelAttribute="user" cssClass="form-signin">
								 <springform:input path="loginId" cssClass="form-control" placeholder="Username..." />
								 <springform:input path="email" cssClass="form-control" placeholder="Email Address..."  />
							     <springform:password path="loginPwd" cssClass="form-control" placeholder="Password..." />
							     <input type="submit" class="btn btn-lg btn-default btn-block" value="Sign Up" />
							 </springform:form>
							<div id="tabs" data-tabs="tabs">
               			<p class="text-center"><a href="#login" data-toggle="tab">Have an Account?</a></p>
              			</div>
						</div>
				</div>
            </div>
        </div>
    </div>
</div>


</body>
</html>