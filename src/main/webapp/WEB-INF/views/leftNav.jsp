<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!-- nav bar -->
<a href="mail-compose.html" class="btn btn-danger btn-block btn-compose-email">Compose Email</a>
 <ul class="nav nav-pills nav-stacked nav-email shadow mb-20">
     <li class="active">
         <a href="#mail-inbox.html">
             <i class="fa fa-inbox"></i> Inbox  <span class="label pull-right">7</span>
         </a>
     </li>
     <li>
         <a href="#mail-compose.html"><i class="fa fa-envelope-o"></i> Send Mail</a>
     </li>
     <li>
         <a href="#"><i class="fa fa-certificate"></i> Important</a>
     </li>
     <li>
         <a href="#">
             <i class="fa fa-file-text-o"></i> Drafts <span class="label label-info pull-right inbox-notification">35</span>
         </a>
     </li>
     <li><a href="#"> <i class="fa fa-trash-o"></i> Trash</a></li>
 </ul><!-- /.nav -->

 <h5 class="nav-email-subtitle">More</h5>
 <ul class="nav nav-pills nav-stacked nav-email mb-20 rounded shadow">
     <li>
         <a href="#">
             <i class="fa fa-folder-open"></i> Promotions  <span class="label label-danger pull-right">3</span>
         </a>
     </li>
     <li>
         <a href="#">
             <i class="fa fa-folder-open"></i> Job list
         </a>
     </li>
     <li>
         <a href="#">
             <i class="fa fa-folder-open"></i> Backup
         </a>
     </li>
 </ul>
 <!-- /.nav -->