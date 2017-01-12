<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>

<div class="card">
     <div class="panel-heading">
        <div class="row">
           <div class="col-lg-12">
           			<legend>个人信息
           			<span class="pull-right">
           			<button type="button" class="btn btn-default">
				    	<span class="glyphicon glyphicon-pencil"></span>
					</button>
           			</span>
           			
           			
           			</legend>
              <div class="col-xs-12 col-sm-4">
                 <figure>
                    <img class="img-circle img-responsive" alt="" src="<c:url value='/static/img/2.jpg' />">
                 </figure>
        		<input type="file" class="text-center center-block well well-sm">

              </div>
              <div class="col-xs-12 col-sm-8">

	<form class="form-horizontal">
		<fieldset>
			
			<!-- Form Name -->

			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">E-mail</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="E-mail" class="form-control input-md">
			    
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">Name</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="Name" class="form-control input-md">
			    
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">Sname</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="Sname" class="form-control input-md">
			    
			  </div>
			</div>
			
			<!-- Select Basic -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="year">Select Year</label>
			  <div class="col-md-4">
			    <select id="year" name="year" class="form-control">
			      <option value="1">1</option>
			    </select>
			  </div>
			</div>
			
			<!-- Password input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="passwordinput">Renter Password </label>
			  <div class="col-md-4">
			    <input id="passwordinput" name="passwordinput" type="password" placeholder="" class="form-control input-md">
			    
			  </div>
			</div>
			
			<!-- Password input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="passwordinput">Password</label>
			  <div class="col-md-4">
			    <input id="passwordinput" name="passwordinput" type="password" placeholder="" class="form-control input-md" required="">
			    
			  </div>
			</div>
			<!-- label input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" >Gendel</label>
			  <div class="col-md-4">
			   <p class="form-control-static">email@example.com</p>			    
			  </div>
			</div>
		
		</fieldset>
	</form>
              </div>
           </div>
        </div>
     </div>
</div>        