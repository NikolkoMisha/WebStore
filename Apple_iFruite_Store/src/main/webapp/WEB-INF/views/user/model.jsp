<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>

<jsp:useBean id="formHandler" class="project.dto.filter.TypeFilter" scope="page">
	<jsp:setProperty name="formHandler" property="search"/>

		
			<div class="  col-sm-12 col-xs-12 col-md-12 col-lg-12"  style=" height: 100%; background-color:#262626;  padding-bottom:5%;">
			<div class="col-sm-5 col-xs-5 col-md-5 col-lg-5">
				<div style=" margin-top:15px ;">
					<a href="/"><img src="/resources/img/ifruiteLogo.png" width="200px"></a>
				</div>
			</div>
			<div class="col-sm-3 col-xs-3 col-md-3 col-lg-2">
				<div style=" margin-top:60px; float: bottom;"><span  style="color:yellow; float: left; padding-right:10px;" class="glyphicon glyphicon-earphone"></span><p style="color:white"> +38(063) 549 28 84</p>
				
				</div>
				<div style="float:bottom;"><span  style="color:yellow; float: left; padding-right:10px;" class="glyphicon glyphicon-earphone"></span><p style="color:white"> +38(063) 549 28 84</p></div>
				<div style="float: left;"><a href="https://instagram.com/ifruite.lviv"><img src="/resources/img/ins.png" width="15px"></a></div>
			</div>
			<div class=" col-sm-offset-1 col-xs-offset-1 col-md-offset-1 col-lg-offset-3 col-sm-3 col-xs-3 col-md-3 col-lg-2" style=" margin-top:60px;">
				
				<form:form class="form-horizontal" action="/" method="GET" modelAttribute="filter" id="filter">
					<custom:hiddenInputs excludeParams="search, minPrice, maxPrice, colorIds, memoryIds"/>
					
					<div class="form-group">
						<div class="input-group" >
		      				<input  style="float: left; background-color:transparent" type="text" value='<%=formHandler.getSearch()%>' class="form-control" name="search" placeholder="Пошук">
		    				<div class="input-group-btn">
						      <button class="btn btn-default" type="submit">
						        <i class="glyphicon glyphicon-search"></i>
						      </button>
						    </div>
		    			</div>
		    			
		    			
					</div>
					
				</form:form>
			</div>
			
			
		
		
		<div class="col-sm-12 col-xs-12 col-md-12 col-lg-12 text-center" style="border-top:3px solid white; border-bottom:3px solid white;">
				
				<!-- 	    <div class="navbar-header">
					       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myNavbar" aria-expended="false">
					       	<img src="/resources/img/buttonMenu.png" width="35px">                        
					      </button>
					      
					    </div>-->
					    
					    
					    
					    
					    
					    <nav class="navbar" style="margin:0px;" id="mainMenu">
					    <div class="" id="myNavbar">
					      <ul class="nav navbar-nav " style="font-family: Cuprum, sans-serif; font-weight:300; font-size:20px; color: yellow">
					        <li ><a href="/" style="color: #fcd13f;">iPhone</a></li>
					        <li class="dropdown">
					          <a class="dropdown-toggle" data-toggle="dropdown" style="color: #fcd041" href="#">iPad<span class="caret"></span></a>
					          <ul class="dropdown-menu">
					            <li><a href="#">Page 1-1</a></li>
					            <li><a href="#">Page 1-2</a></li>
					            <li><a href="#">Page 1-3</a></li>
					          </ul>
					        </li>
					        <li><a href="#" style="color: #fcd13f;">Mack</a></li>
					        <li><a href="#" style="color: #fcd13f;">Watch</a></li>
					        <li><a href="#" style="color: #fcd13f;">Ремонт</a></li>
					        <li><a href="#" style="color: #fcd13f;">Аксесуари</a></li>
					        </ul>
					   <!--    <ul class="nav navbar-nav">
					        <li><a  href="/shopping" type="button" style="color:red" ><span class="glyphicon glyphicon-shopping-cart"></span> Корзина : ${quantity.count}</a></li>
					      </ul>
					      <ul class="nav navbar-nav navbar-right">
					        <li><a href="/registration"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					        <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					      </ul> -->
					    </div>
					  </nav>
					  
					  
			
		</div>
		 <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="border-bottom:3px solid white; 	padding-left:0px; margin-top:2em; margin-bottom:2em">
			<h1 style=" font-family: Cuprum , sans-serif; font-weight:300;  color: white;">${type.name}</h1>
		</div>
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"  >
			<div class=" col-xs-5 col-sm-5 col-md-5 col-lg-5" style="margin-top:1rem">
				<div ><img src="/images/type/${type.id}.jpg?version=${type.version}" width="100%"></div>
			</div>
			
			<div class=" col-xs-7 col-sm-7 col-md-7 col-lg-7" style="color:white; padding-left:3%;">
			<p>
				тут буде пизда який довгий текст з описом про товар і всяка дічь яку можна написати про цей товар
				тут буде пизда який довгий текст з описом про товар і всяка дічь яку можна написати про цей товар
				тут буде пизда який довгий текст з описом про товар і всяка дічь яку можна написати про цей товар
				тут буде пизда який довгий текст з описом про товар і всяка дічь яку можна написати про цей товар
				тут буде пизда який довгий текст з описом про товар і всяка дічь яку мож
			</p>
			</div>
			
			<div class="hidden-xs hidden-sm hidden-md col-lg-7" style=" color: #fcd041; padding-left:3%; padding-top:5%">
				<p style="font-size:2.5rem; padding-right:1rem;"> В наявності </p>
			</div>
			
			<div class="hidden-xs hidden-sm hidden-md col-lg-3" style="padding-top:5%; color:white; padding-left:3%;">
				<p style="font-size:2.5rem; padding-right:1rem; float:left"> ${type.price}</p><p style="padding-top:0.5rem;font-size:2rem">грн</p>
			</div>
			
			<div class="hidden-xs hidden-sm hidden-md col-lg-3" style="padding-top:5%;  padding-bottom:2%; color:white; padding-left:3%;">
				<a href="/model/buy/${type.id}" type="button" class="buttonBuy">
					<span class="glyphicon glyphicon-shopping-cart"></span>
					В корзину
				</a>
			</div>
			
			<div class="hidden-xs hidden-sm hidden-md col-lg-3" style="padding-top:3%; color:white; padding-left:3%;">
				<p style="font-size:2.5rem; padding-right:1rem; float:left"> Артикул :</p><p style="padding-top:1rem;font-size:1.5rem">5125</p>
			</div>
			
			<div class="hidden-xs hidden-sm hidden-md col-lg-3" style="padding-top:3%; color:white; padding-left:3%;">
				<a href="/model/add/${type.id}" type="button" class="buttonBuy">
					<span class="glyphicon glyphicon-stats"></span>
					Порівняти
				</a>
			</div>
			
			<!-- -------------------------------------- ДЛЯ МОБ версії      -------------------------------------------------------------------------------------------- -->
			
				<div class="col-xs-7 col-sm-7 col-md-7 hidden-lg" style=" color: #fcd041; padding-left:3%; padding-top:1%;">
					<p style="font-size:2.5rem; padding-right:1rem;"> В наявності </p>
				</div>
			
				<div class="col-xs-3 col-sm-3 col-md-3 hidden-lg" style="padding-top:2%; color:white; padding-left:3%;">
					<p style="font-size:2.5rem; padding-right:1rem; float:left"> ${type.price}</p><p style="padding-top:0.5rem;font-size:2rem">грн</p>
				</div>
			
				<div class="col-xs-3 col-sm-3 col-md-3 hidden-lg" style="padding-top:2%;  padding-bottom:2.4%; color:white; padding-left:3%;">
					<a href="/model/buy/${type.id}" type="button" class="buttonBuy">
						<span class="glyphicon glyphicon-shopping-cart"></span>
						В корзину
					</a>
				</div>
			
				<div class="col-xs-3 col-sm-3 col-md-3 hidden-lg" style="padding-top:1%; color:white; padding-left:3%;">
					<p style="font-size:2.5rem; padding-right:1rem; float:left"> Артикул :</p><p style="padding-top:1rem;font-size:1.5rem">5125</p>
				</div>
				
				<div class="col-xs-3 col-sm-3 col-md-3 hidden-lg" style="padding-top:1%; color:white; padding-left:3%;">
					<a href="/model/add/${type.id}" type="button" class="buttonBuy">
						<span class="glyphicon glyphicon-stats"></span>
						Порівняти
					</a>
				</div>
			
			
			<!-- ---------------------------------------------------------------------------------------------------------------------------------- -->
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="margin-top:5%; padding-left:0px; border-bottom: 3px solid white;">
				<h1 style="color:white">Характеристики</h1>
			</div>
			
			
			
			
			<div class="col-lg-12" style="padding-left:0px;color: white; margin-top:2rem">
				<div class="col-lg-6 " style="padding-left:0px;">
					<div class="col-lg-6" style="padding-left:0px; border-top:1px solid white; border-bottom:1px solid white;">Діагональ екрану</div>
					<div class="col-lg-6" style="border-top:1px solid white; border-bottom:1px solid white;"> ${type.diagonal.name}</div>
					
			 		<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Процесор</div>
			 		<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.processor.name }</div>
			 		
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Оперативна пам'ять</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.ram.name}</div>
					
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Пам'ять</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.memory.name}</div>
					
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Основна камера</div>
			 		<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.rear_camera.name }</div>
			 		
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Фронтальна камера</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.front_camera.name}</div>
			 	</div>
			 	<div class="col-lg-6 " style="padding-left:0px; ">
					<div class="col-lg-6" style="padding-left:0px; border-top:1px solid white; border-bottom:1px solid white;">Вага</div>
					<div class="col-lg-6" style="border-top:1px solid white; border-bottom:1px solid white;"> ${type.weight.name}</div>
					
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Операційна система</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.operating_system.name}</div>
					
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Батарея</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.battery.name}</div>
					
			 		<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Колір</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.color.name}</div>
					
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Стан</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> 10/10</div>
					
					<div class="col-lg-6" style="padding-left:0px; border-bottom:1px solid white;">Комплект</div>
					<div class="col-lg-6" style="border-bottom:1px solid white;"> ${type.kit.name}</div>
			 	</div>
			</div>
			
			
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="margin-top:2%; padding-left:0px; border-bottom: 3px solid white;">
				<h1 style="color:white">Подібні товари</h1>
			</div>
			
			
			<div >
			
			 <div style="float:left; margin-left:22px; margin-top:1rem"></div>
		<!-- 	 <div style="float:left; margin-left:22px; margin-top:1rem"><a href="/model/setting/${type.id}" class="btn btn-danger">Купити</a></div>
		 -->
		 	</div>
		 </div>
	</div>	 	
</jsp:useBean>


