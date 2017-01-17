<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<!-- forms -->

<c:url value="/admin/publish" var="publishUrl" />
<div class="card">

	<springform:form  action="${publishUrl}" method="post" modelAttribute="match" cssClass="form-horizontal">
		<fieldset>
			
			<!-- Form Name -->
			<legend>发布新的比赛信息</legend>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">比赛类型</label>  
			  <div class="col-md-4">
			  
				  <springform:select  path="matchType"  cssClass="form-control input-md">
	  					<springform:option value ="内部训练">内部训练</springform:option>
	  					<springform:option value ="公司比赛">公司比赛</springform:option>
				  </springform:select>
				  
				
			  </div>
			</div>
			
			<!-- date -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">比赛时间</label>  
			  <div class="input-group date form_datetime col-md-4" data-date="2017-01-01" data-date-format="yyyy-mm-dd hh:ii" data-link-field="dtp_input1">
			  <!--
			  <input id="textinput" name="textinput" type="text" placeholder="Name" class="form-control input-md">
			  -->
                    	<input class="form-control" type="text" value=""  name="matchDate" >
                    	 <!--  
                    	<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    	-->
						<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">比赛场地</label>  
			  <div class="col-md-4">
			  <springform:select id="select1" path="matchLocation"  cssClass="form-control input-md">
  					<option value ="凤凰城">凤凰城</option>
  					<option value ="东佳">东佳</option>
  					<option value="维拓体育公园">维拓体育公园</option>
  					<option value="户外">户外</option>
			  </springform:select>
			    
			  </div>
			</div>
			
			
			<!-- Button (Double) -->
			<div class="form-group">
			  <div class="col-md-6 control-label">
			    <button id="button1id" type="submit" class="btn btn-success">Publish</button>
			    <button id="button2id" name="button2id" class="btn btn-default">Cancel</button>
			  </div>
			</div>
		
		</fieldset>
	</springform:form>
</div> 

<script type="text/javascript">
$('.form_datetime').datetimepicker({
    //language:  'fr',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 2,
	forceParse: 0,
    showMeridian: 1
});
</script>
 
<!-- forms -->
        
