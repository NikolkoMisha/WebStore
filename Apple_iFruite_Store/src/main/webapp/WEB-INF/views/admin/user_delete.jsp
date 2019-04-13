<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<div class="col-md-offset-3 col-md-7 col-xs-12">
	<div class="row">
		<div class="col-md-2 col-xs-3"><h3 class="adminka">Логін </h3></div>
		<div class="col-md-2 col-xs-3"><h3 class="adminka">Ім'я </h3></div>
		<div class="col-md-2 col-xs-3"><h3 class="adminka">Прізвище </h3></div>
		<div class="col-md-3 col-xs-3"><h3 class="adminka">Повноваження </h3></div>
				<div class="col-md-2 col-xs-3"><h3 class="adminka">Delete</h3></div>
	</div>
				<c:forEach items="${users}" var="user">
					<div class="row">
						<div class="col-md-2 col-xs-3"><h4 class="adminka">${user.login}</h4></div>
						<div class="col-md-2 col-xs-3"><h4 class="adminka">${user.name}</h4></div>
						<div class="col-md-2 col-xs-3"><h4 class="adminka">${user.surname}</h4></div>
						<div class="col-md-3 col-xs-3"><h4 class="adminka">${user.role}</h4></div>
					<!-- 	<div class="col-md-2 col-xs-3"><a class="btn btn-danger" href="/admin/law/user_delete/delete/${user.id}<custom:allParams/>">delete</a></div>-->
					</div>
				</c:forEach>
</div>