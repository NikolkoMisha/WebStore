<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row">
	<nav class="navbar navbar-default" id="navbars">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a style="color:#00f" href="/admin/commodity">Товар</a></li>
					<li><a style="color:#00f" href="/admin/category">Категорії</a></li>
					<li  class="active"><a style="color:#00f" href="/admin/type">Моделі</a><span
						class="sr-only">(current)</span></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<nav class="navbar navbar-default" id="navbars">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbario">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbario">
				<ul class="nav navbar-nav">
					<li><a id="text_color" href="/admin/type/color">Колір</a></li>
					<li class="active"><a id="text_color" href="/admin/type/memory">Пам'ять</a><span
						class="sr-only">(current)</span></li>
					<li><a id="text_color" href="/admin/type/ram">Оперативна пам'ять</a></li>
					<li><a id="text_color" href="/admin/type/processor">Процесор</a></li>
					<li><a id="text_color" href="/admin/type/diagonal">Діагональ екрану</a></li>
					<li><a id="text_color" href="/admin/type/weight">Вага</a></li>
					<li><a id="text_color" href="/admin/type/battery">Батарея</a></li>
					<li><a id="text_color" href="/admin/type/operating_system">Операційна система</a></li>
					<li><a id="text_color" href="/admin/type/rear_camera">Основна камера</a></li>
					<li><a id="text_color" href="/admin/type/front_camera">Фронтальна камера</a></li>
					<li><a id="text_color" href="/admin/type/option">Комплектація</a></li>										
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-md-3 col-xs-12"></div>
	<div class="col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/type/memory" method="POST" modelAttribute="memory">
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label" style="color:#fff">Пам'ять</label>
    					<div class="col-sm-10">
      						<form:input type="text" class="form-control" path="name" id="name"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-info">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
	<div class="row">
			<div class="col-md-4 col-xs-4"><h3 class="adminka">Пам'ять</h3></div>
			<div class="col-md-4 col-xs-4"><h3 class="adminka">Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3 class="adminka">Delete</h3></div>
		</div>
			<c:forEach items="${memories}" var="memory">
				<div class="row">
					<div class="col-md-4 col-xs-4"><h4 class="adminka">${memory.name}</h4></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-success" href="/admin/type/memory/update/${memory.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/type/memory/delete/${memory.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>