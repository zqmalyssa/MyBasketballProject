<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page isELIgnored="false"%>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>


<c:url value="/users/profile" var="updateUserUrl" />
<div class="card">
   <springform:form action="${updateUserUrl}" method="post" modelAttribute="user" cssClass="form-horizontal">
     <div class="panel-heading">
        <div class="row">
           <div class="col-lg-12">
	   		   <legend><spring:message code="user.form.name" />
	   		   	 <span class="pull-right">
   			   	     <button type="submit" class="btn btn-default">
   					 <span class="glyphicon glyphicon-floppy-save"></span>
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

						<fieldset>							
							<!-- Text input-->
							<div class="form-group">
							  <label class="col-md-4 control-label" for="user.name"><spring:message code="user.name" /></label>  
							  <div class="col-md-4">
								 <springform:input path="name" cssClass="form-control input-md"  />
							  </div>
							</div>
							
							<!-- Text input-->
							<div class="form-group">
							  <label class="col-md-4 control-label" for="user.name"><spring:message code="user.gender" /></label>  
							  <div class="col-md-4">
								 <springform:input path="gender" class="form-control input-md"  />
							  </div>
							</div>
							
							<!-- Text input-->
							<div class="form-group">
							  <label class="col-md-4 control-label" for="user.birthDate"><spring:message code="user.birthDate" /></label>  
							  <div class="col-md-4">
								 <springform:input path="birthDate" cssClass="form-control input-md"  />
							  </div>
							</div>
							<!-- Text input-->
							<div class="form-group">
							  <label class="col-md-4 control-label" for="user.nickName"><spring:message code="user.nickName" /></label>  
							  <div class="col-md-4">
								 <springform:input path="nickName" cssClass="form-control input-md"  />
							  </div>
							</div>
							<!-- Text input-->
							<div class="form-group">
							  <label class="col-md-4 control-label" for="height"><spring:message code="user.height" /></label>  
							  <div class="col-md-4">
								 <springform:input path="height" cssClass="form-control input-md"  />
							  </div>
							</div>
							<!-- Text input-->
							<div class="form-group">
							  <label class="col-md-4 control-label" for="weight"><spring:message code="user.weight" /></label>  
							  <div class="col-md-4">
								 <springform:input path="weight" cssClass="form-control input-md"  />
							  </div>
							</div>
						
						</fieldset>
					
              </div>
           </div>
        </div>
     </div>
    </springform:form> 
</div>        
