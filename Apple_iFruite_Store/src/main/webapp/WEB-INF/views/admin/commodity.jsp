<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<div class="row">
	<nav  class="navbar navbar-default" id="navbars">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav" >
					<li class="active"><a id="text_color" href="/admin/commodity">Товар</a><span
						class="sr-only">(current)</span></li>
					<li><a id="text_color" href="/admin/category">Категорії</a></li>
					<li><a id="text_color" href="/admin/type">Моделі</a></li>
					
				</ul>
			</div>
		</div>
	</nav>
</div>

	<div class="col-md-offset-3 col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-10 col-xs-12">
				<form:form class="form-horizontal" action="/admin/commodity" method="POST" modelAttribute="commodity" enctype="multipart/form-data">
					<custom:hiddenInputs excludeParams="name"/>
					<div class="form-group">
						<label for="name" style="color:red;text-align:left;" class="col-sm-10 col-sm-offset-2 control-label"><form:errors path="name"/></label>
					</div>
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label" style="color:#fff;">Ім'я товару</label>
    					<div class="col-sm-8">
      						<form:input type="text" class="form-control" path="name" id="name"/>
    					</div>
  					</div>
  	  				<div class="form-group">
    					<label for="file" class="col-sm-2 control-label" style="color:#fff;">Image</label>
    					<div class="col-sm-10">
      						<input name="file" id="file" type="file" style="color:red">
    					</div>
  					</div>
  					<div class="form-group">
    					<div  class="col-sm-offset-2 col-sm-10">
      						<button  type="submit" class="btn btn-info">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-offset-1 col-md-3 col-xs-4"><h3 class="adminka">Ім'я товару</h3></div>
			<div class="col-md-offset-1 col-md-3 col-xs-4"><h3 class="adminka">Update</h3></div>
			<div class="col-md-offset-1 col-md-3 col-xs-4"><h3 class="adminka">Delete</h3></div>
		</div>
			<c:forEach items="${page.content}" var="commodity">
				<div class="row">
		 		<div class="col-md-3 col-xs-3"><img src="/images/commodity/${commodity.id}.jpg?version=${commodity.version}" width="100%"></div>
					<div class="col-md-offset-1 col-md-3 col-xs-3"><h4 class="adminka">${commodity.name}</h4></div>
					<div class="col-md-offset-1 col-md-3 col-xs-3"><a class="btn btn-success" href="/admin/commodity/update/${commodity.id}<custom:allParams/>">update</a></div>
					<div class="col-md-offset-1 col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/commodity/delete/${commodity.id}<custom:allParams/>">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12">
		<div class="row">
					<div class="col-md-6 col-xs-6 text-center">
						<div class="dropdown">
							<button class="btn btn-warning dropdown-toggle" type="button"
								data-toggle="dropdown">
								Sort <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<custom:sort innerHtml="Name asc" paramValue="name" />
								<custom:sort innerHtml="Name desc" paramValue="name,desc" />
							</ul>
						</div>
					</div>
					<div  class="col-md-6 col-xs-6 text-center">
						<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
					</div>
				</div>
	</div>
<div class="row">
	<div class="col-md-12 col-xs-12 text-center">
		<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
	</div>
</div>
<script>
	$('label').each(function() {
		if(!$(this).html()) $(this).parent('div').hide();
	});
</script>