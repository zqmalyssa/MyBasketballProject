<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>xprj verion page</title>
    <link href="<c:url value='/static/thirdParty/bootstrap-3.3.7-dist/css/bootstrap.min.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/timeline.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="container">
	    <div class="page-header">
	        <h1 id="timeline">Timeline</h1>
	    </div>
	    <ul class="timeline">
	        <li>
	          <div class="timeline-badge"><i class="glyphicon glyphicon-check"></i></div>
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">想法</h4>
	              <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 11 hours ago via Twitter</small></p>
	            </div>
	            <div class="timeline-body">
	              <p>开始项目.</p>
	            </div>
	          </div>
	        </li>
	        <li class="timeline-inverted">
	          <div class="timeline-badge warning"><i class="glyphicon glyphicon-credit-card"></i></div>
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">开发环境搭建</h4>
	            </div>
	            <div class="timeline-body">
	              <p>提交一个Maven web的项目结构到Githup,尚未添加Spring web的配置</p>
	            </div>
	          </div>
	        </li>
	        <li>
	          <div class="timeline-badge danger"><i class="glyphicon glyphicon-credit-card"></i></div>
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">开发环境搭建</h4>
	            </div>
	            <div class="timeline-body">
	              <p>添加Spring的配置信息：配置jsp路径，静态资源路径（css,js,img...），properties file路径。</p>
	            </div>
	          </div>
	        </li>
	        <li class="timeline-inverted">
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">开发环境搭建</h4>
	            </div>
	            <div class="timeline-body">
	              <p>TODO1.</p>
	            </div>
	          </div>
	        </li>
	        <li>
	          <div class="timeline-badge info"><i class="glyphicon glyphicon-floppy-disk"></i></div>
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">开发环境搭建</h4>
	            </div>
	            <div class="timeline-body">
	              <p>TODO2.</p>
	              <hr>
	              <div class="btn-group">
	                <button type="button" class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown">
	                  <i class="glyphicon glyphicon-cog"></i> <span class="caret"></span>
	                </button>
	                <ul class="dropdown-menu" role="menu">
	                  <li><a href="#">Action</a></li>
	                  <li><a href="#">Another action</a></li>
	                  <li><a href="#">Something else here</a></li>
	                  <li class="divider"></li>
	                  <li><a href="#">Separated link</a></li>
	                </ul>
	              </div>
	            </div>
	          </div>
	        </li>
	        <li>
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">开发环境搭建</h4>
	            </div>
	            <div class="timeline-body">
	              <p>TODO3</p>
	            </div>
	          </div>
	        </li>
	        <li class="timeline-inverted">
	          <div class="timeline-badge success"><i class="glyphicon glyphicon-thumbs-up"></i></div>
	          <div class="timeline-panel">
	            <div class="timeline-heading">
	              <h4 class="timeline-title">开发环境搭建</h4>
	            </div>
	            <div class="timeline-body">
	              <p>TODO4</p>
	            </div>
	          </div>
	        </li>
	    </ul>
	</div>
</body>
</html>