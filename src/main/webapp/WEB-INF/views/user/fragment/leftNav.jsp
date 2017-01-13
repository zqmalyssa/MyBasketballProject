<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!-- nav bar -->
<c:url value="/users/${user.id}/profile" var="userProfileUrl" />
<c:url value="/users/${user.id}/reserveMatch" var="reserveMatchUrl" />
<a href="mail-compose.html" class="btn btn-danger btn-block btn-compose-email"><spring:message code="button.logout" /></a>
 <ul class="nav nav-pills nav-stacked nav-email shadow mb-20">
     <li class="active">
         <a href="#mail-inbox.html">
             <i class="active fa fa-home fa-fw"></i> <spring:message code="leftNav.menu.user.home" />
         </a>
         
     </li>
     <li>
         <a href="${userProfileUrl}"><i class="fa fa-user fa-fw"></i> <spring:message code="leftNav.menu.user.personalInfo" /></a>
     </li>
     <li>
         <a href="#"><i class="fa fa-database fa-fw"></i> <spring:message code="leftNav.menu.user.personalMatchData" /></a>
     </li>
     <li>
         <a href="${reserveMatchUrl}">
             <i class="fa fa-book fa-fw"></i> <spring:message code="leftNav.menu.user.reserveMatch" />
         </a>
     </li>
 </ul>
