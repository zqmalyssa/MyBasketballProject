<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>

<div class="panel panel-default panel-table">
  <div class="panel-heading">
    <div class="row">
      <div class="col col-xs-6">
        <h3 class="panel-title">您预定了以下场次</h3>
      </div>
      <div class="col col-xs-6 text-right">
        <button type="button" class="btn btn-sm btn-primary btn-create">Create New</button>
      </div>
    </div>
  </div>
  <div class="panel-body">
    <table class="table table-striped table-bordered table-list">
      <thead>
        <tr>
          
            <th class="hidden-xs">ID</th>
            <th>Name</th>
            <th>Email</th>
              <th>Actions</th>
        </tr> 
      </thead>
      <tbody>
              <tr>
                <td align="center">
						1
                </td>
                <td class="hidden-xs">Fuen</td>
                <td>John Doe</td>
               <td>
				    <button type="button" class="btn btn-xs btn-default">
				    	<span class="glyphicon glyphicon-pencil"></span>
					</button>
					<button type="button" data-bind="click: $parent.remove" class="remove-news btn btn-xs btn-default" data-toggle="tooltip" data-placement="top" data-original-title="Delete">
					    <span class="glyphicon glyphicon-trash"></span>
					</button>
					<button type="button" class="enabledisable-news btn btn-xs btn-default">
						<span class="glyphicon glyphicon-ok"></span>
					</button>
				</td>  
              </tr>
            </tbody>
    </table>

  </div>
  <div class="panel-footer">
    <div class="row">
      <div class="col col-xs-4">Page 1 of 5
      </div>
      <div class="col col-xs-8">
        <ul class="pagination hidden-xs pull-right">
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
        </ul>
        <ul class="pagination visible-xs pull-right">
            <li><a href="#">«</a></li>
            <li><a href="#">»</a></li>
        </ul>
      </div>
    </div>
  </div>
</div>
        
