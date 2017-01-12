<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!-- forms -->
<div class="card">

	<form class="form-horizontal">
		<fieldset>
			
			<!-- Form Name -->
			<legend>新闻TODO</legend>
			
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
			
			<!-- Button (Double) -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="button1id">Select to register</label>
			  <div class="col-md-8">
			    <button id="button1id" name="button1id" class="btn btn-success">Register</button>
			    <button id="button2id" name="button2id" class="btn btn-default">Remove</button>
			  </div>
			</div>
		
		</fieldset>
	</form>
</div>  
<!-- forms -->
        
