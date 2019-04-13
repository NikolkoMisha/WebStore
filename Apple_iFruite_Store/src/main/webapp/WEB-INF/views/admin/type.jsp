<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
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
					<li><a id="text_color" href="/admin/commodity">Товар</a></li>
					<li><a id="text_color" href="/admin/category">Категорії</a></li>
					<li class="active"><a id="text_color" href="/admin/type">Моделі</a><span
						class="sr-only">(current)</span></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="  col-md-2 col-xs-12">
		<nav class="navbar navbar-default" id="navbaren">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbars">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse"  id="myNavbars">
				<ul  class="nav navbar-nav"  >
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/color">Колір</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/memory">Пам'ять</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/ram">Оперативна пам'ять</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/processor">Процесор</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/diagonal">Діагональ екрану</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/weight">Вага</a></li> 
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/battery">Батарея</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/operating_system">Операційна система</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/rear_camera">Основна камера</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/front_camera">Фронтальна камера</a></li>
					<li class="col-md-12 col-sm-12"><a id="leftBar" href="/admin/type/option">Комплектація</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>


	<div class="col-md-offset-1 col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-sm-10 col-xs-12">
				<form:form class="form-horizontal" action="/admin/type" method="POST" modelAttribute="model" enctype="multipart/form-data" >
  					<custom:hiddenInputs excludeParams=" model, price, category, memory, processor, color, diagonal, battery, weight, operating_system, kit"/>	
  				
  						<div class="form-group">
								<label for="name" style="color:red;text-align:left;" class="col-sm-10 col-md-offset-7 control-label"><form:errors path="name"/></label>
							</div>
  					<div class="form-group">
						<label for="name" class="col-sm-2 control-label" style="color:#fff">Назва</label>
    					<div class="col-sm-3">
      						<form:input type="text" class="form-control" path="name" id="name"/>
    					</div>
    					<label for="price" class="col-sm-2 control-label" style="color:#fff">Ціна</label>
    					<div class="col-sm-3">
      						<form:input type="text" class="form-control" path="price" id="price"/>
    					</div>
    				</div>
    				<div class="form-group">
    			  		<label for="category" class="col-sm-2 control-label" style="color:#fff">Категорія</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="category" id="category"
      						 items="${categories}" itemValue="id" itemLabel="name" />
    					</div>
    					<label for="memory" class="col-sm-2 control-label" style="color:#fff">Пам'ять</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="memory" id="memory"
      						 items="${memories}" itemValue="id" itemLabel="name" />
    					</div>
    				</div>
    				
    				<div class="form-group">
    					<label for="processor" class="col-sm-2 control-label" style="color:#fff">Процесор</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="processor" id="processor"
      						 items="${processors}" itemValue="id" itemLabel="name" />
    					</div>
    					<label for="ram" class="col-sm-2 control-label" style="color:#fff">Оперативна пам'ять</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="ram" id="ram"
      						 items="${rams}" itemValue="id" itemLabel="name" />
    					</div>
    				</div>
    				<div class="form-group">
    					<label for="diagonal" class="col-sm-2 control-label" style="color:#fff">Діагональ</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="diagonal" id="diagonal"
      						 items="${diagonals}" itemValue="id" itemLabel="name" />
    					</div>
    					<label for="battery" class="col-sm-2 control-label" style="color:#fff">Батарея</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="battery" id="battery"
      						 items="${batteries}" itemValue="id" itemLabel="name" />
    					</div>
    				</div>
    				<div class="form-group">
    					<label for="weight" class="col-sm-2 control-label" style="color:#fff">Вага</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="weight" id="weight"
      						 items="${weights}" itemValue="id" itemLabel="name" />
    					</div>
    					<label for="color" class="col-sm-2 control-label" style="color:#fff">Колір</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="color" id="color"
      						 items="${colors}" itemValue="id" itemLabel="name" />
    					</div>
    				</div>
    				<div class="form-group">
    					<label for="rear_camera" class="col-sm-2 control-label" style="color:#fff">Основна камера</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="rear_camera" id="rear_camera"
      						 items="${rear_cameras}" itemValue="id" itemLabel="name" />
    					</div>
    					<label for="front_camera" class="col-sm-2 control-label" style="color:#fff">Фронтальна камера</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="front_camera" id="rear_camera"
      						 items="${front_cameras}" itemValue="id" itemLabel="name" />
    					</div>
    				</div>
    				
    				<div class="form-group">
    					<label for="kit" class="col-sm-2 control-label" style="color:#fff">Комплектація</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="kit" id="kit"
      						 items="${kits}" itemValue="id" itemLabel="name" />
    					</div>
    					<label for="operating_system" class="col-sm-2 control-label" style="color:#fff">Операційна система</label>
    					<div class="col-sm-3">
      						<form:select class="form-control" path="operating_system" id="operating_system"
      						 items="${operating_systems}" itemValue="id" itemLabel="name" />
    					</div>
    				</div>
    				<div class="form-group">
  						<div class="">
		  					<label for="file" class="col-sm-2 control-label" style="color:#fff" >Image</label>
    					<div class="col-sm-8">
      						<input name="file" id="file" type="file" style="color:red">
    					</div>
		    				
	    				</div>
	    			</div>
  					<div class="form-group">
    					<div class=" col-sm-10">
      						<button type="submit" class="btn btn-info">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
			</div>
	<div class=" col-md-12 col-xs-12">
	  	<div class="row">
	  		<div class="col-md-1 col-xs-12"><h5 class="adminka">Фото</h5></div>
	  		<div class="col-md-1 col-xs-12"><h5 class="adminka">Назва</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">Ціна</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">Колір</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">Пам'ять</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">ОЗУ</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">Батарея</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">ОС</h5></div>
			<div class="col-md-1 col-xs-12"><h5 class="adminka">Процесор</h5></div>
		</div>
			<c:forEach items="${page.content}" var="model">
				<div class="row">
						<div class="col-md-1 col-xs-12"><img class="img-rounded" width="100%" src="/images/type/${model.id}.jpg?version=${type.version}"></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.name}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.price}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.color.name}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.memory.name}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.ram.name}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.battery.name}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.operating_system.name}</h6></div>
						<div class="col-md-1 col-xs-12"><h6 class="adminka">${model.processor.name}</h6></div>
						
						
						
						
					<div class="col-md-2 col-xs-12"><h6><a class="btn btn-success" href="/admin/type/update/${model.id}">update</a></h6></div>
					<div class="col-md-1 col-xs-12"><h6><a class="btn btn-danger " href="/admin/type/delete/${model.id}">delete</a></h6></div>
						
				</div>
			</c:forEach>
	</div>
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
					<div class="col-md-6 col-xs-6 text-center">
						<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
					</div>
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
