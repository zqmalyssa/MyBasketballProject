<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!-- nav bar -->
<a href="mail-compose.html" class="btn btn-danger btn-block btn-compose-email">Logout</a>
 <ul class="nav nav-pills nav-stacked nav-email shadow mb-20">

     <li class="active">
         <a href="#mail-inbox.html">
             <i class="active fa fa-home fa-fw"></i> Home  <span class="label pull-right">7</span>
         </a>
         
     </li>
     <li>
         <a href="#mail-compose.html"><i class="fa fa-user fa-fw"></i> Personal Info</a>
     </li>
     <li>
         <a href="#"><i class="fa fa-database fa-fw"></i> Personal Match Data</a>
     </li>
     <li>
         <a href="#">
             <i class="fa fa-book fa-fw"></i> Reserve Match <span class="label label-info pull-right inbox-notification">35</span>
         </a>
     </li>
 </ul><!-- /.nav -->

 <!-- /.nav -->