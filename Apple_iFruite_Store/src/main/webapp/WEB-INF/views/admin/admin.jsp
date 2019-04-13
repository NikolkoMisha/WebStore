<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
	<nav class="navbar navbar-default" id="navbars">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbarAdmin">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
		<div class="collapse navbar-collapse" id="myNavbarAdmin">
				<ul class="nav navbar-nav" >
					<li><a id="text_color"href="/admin/commodity">Товар</a></li>
					<li><a id="text_color" href="/admin/category">Категорії</a></li>
					<li><a id="text_color" href="/admin/type">Моделі</a></li>
				<!--  	<li><a id="text_color" href="/admin/specification">Характеристики</a></li>-->
					<li><a id="text_color" href="/admin/law">Додатково</a></li>
				</ul>
			</div>
			
		</div>
	</nav>
</div>