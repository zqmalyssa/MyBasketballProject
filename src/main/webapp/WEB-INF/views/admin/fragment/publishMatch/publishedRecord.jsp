<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>


<c:url value="/admin/publishMatch" var="publishPage" />

<div class="panel panel-default panel-table">
  <div class="panel-heading">
    <div class="row">
      <div class="col col-xs-6">
        <h3 class="panel-title">已发布的比赛信息</h3>
      </div>

    </div>
  </div>

  <div class="panel-body">
    <table class="table table-striped table-bordered table-list">
      <thead>
        <tr>
          
            <th class="hidden-xs">ID</th>
            <th>类型</th>
            <th>时间</th>
            <th>场地</th>
              <th>是否有人预定</th>
               <th>操作</th>
        </tr> 
      </thead>
      <tbody>
      		  <c:forEach items="${pageMatches}" var="match">
				<tr>
					<td align="center">${match.id }</td>
					<td class="hidden-xs">${match.matchType}</td>
					<td>${match.matchDate }</td>
					<td>${match.matchLocation }</td>
					<td>${match.isBooked }</td>
					<td>
 					<button id="button1id" name="button1id" class="btn btn-success">取消发布</button>
					</td> 
				</tr> 
			  </c:forEach>
             <!--  
              <tr>
                <td align="center">
						${allMatches[0].id}
                </td>
                <td class="hidden-xs">${allMatches[0].matchType}</td>
                <td>${allMatches[0].matchDate}</td>
                <td>${allMatches[0].matchLocation}</td>
                 <td>${allMatches[0].isBooked}</td>
               <td>
 					<button id="button1id" name="button1id" class="btn btn-success">取消发布</button>
				</td>  
              </tr>
               <tr>
                <td align="center">
						2
                </td>
                <td class="hidden-xs">内部比赛</td>
                <td>周六</td>
                <td>凤凰城</td>
                 <td>已预订</td>
               <td>
 					<button id="button2id" name="button2id" class="btn btn-default">取消发布</button>
				</td>  
              </tr>
              -->
            </tbody>
    </table>

  </div>
  <div class="panel-footer">
    <div class="row">
      <div class="col col-xs-4">Page ${pageNow} of ${pageCount}
      </div>
      <div class="col col-xs-8">
        <ul class="pagination hidden-xs pull-right">
	      <c:if test="${pageNow!=1}">
	        <li><a href="${publishPage}?pageNow=${pageNow-1}">&lt;&lt;</a></li>
	      </c:if>
	      		<c:forEach var="i" begin="1" end="${pageCount}">
          	 		<li><a href="${publishPage}?pageNow=${i}">${i}</a></li>
          		</c:forEach>
          <c:if test="${pageNow!=pageCount}">
	        <li><a href="${publishPage}?pageNow=${pageNow+1}">&gt;&gt;</a></li>
	      </c:if> 
          <!-- 
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
           -->
        </ul>
        <ul class="pagination visible-xs pull-right">
            <li><a href="#">«</a></li>
            <li><a href="#">»</a></li>
        </ul>
      </div>
    </div>
  </div>
</div>
        
