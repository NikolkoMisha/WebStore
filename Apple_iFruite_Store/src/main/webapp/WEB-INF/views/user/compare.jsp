	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>

<jsp:useBean id="formHandler" class="project.dto.filter.TypeFilter" scope="page">
	<jsp:setProperty name="formHandler" property="search"/>


	
		<div class="  col-sm-12 col-xs-12 col-md-12 col-lg-12"  style="padding-bottom: 10%; min-height:100%; height: 100%; background-color:#262626 " >
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
			
			
		
		
		<div class="col-sm-12 col-xs-12 col-md-12 col-lg-12" style="border-top:3px solid white; border-bottom:3px solid white; text-align:center; margin-bottom:50px;">
				
				<!-- 	    <div class="navbar-header">
					       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myNavbar" aria-expended="false">
					       	<img src="/resources/img/buttonMenu.png" width="35px">                        
					      </button>
					      
					    </div>-->
					    
					    
					    
					    
					    
					    <nav class="navbar" style="margin:0px;" id="mainMenu">
					    <div class="" id="myNavbar">
					      <ul class="nav navbar-nav " style="font-family: Cuprum, sans-serif; font-weight:300; font-size:20px; color: yellow">
					        <li ><a href="/" style="color: #fcd041;">iPhone</a></li>
					        <li class="dropdown">
					          <a class="dropdown-toggle" data-toggle="dropdown" style="color: #fcd041" href="#">iPad<span class="caret"></span></a>
					          <ul class="dropdown-menu">
					            <li><a href="#">Page 1-1</a></li>
					            <li><a href="#">Page 1-2</a></li>
					            <li><a href="#">Page 1-3</a></li>
					          </ul>
					        </li>
					        <li><a href="#" style="color: #fcd041;">Mack</a></li>
					        <li><a href="#" style="color: #fcd041;">Watch</a></li>
					        <li><a href="#" style="color: #fcd041;">Ремонт</a></li>
					        <li><a href="#" style="color: #fcd041;">Аксесуари</a></li>
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
		
			
		
		
	<!-- 	<div class="col-md-2">
  					<div style="color:#eea236; font-size:20px; font-family:Impact, fantasy" class="btn-modal-cart total-cost">Загальна вартість ${totalPrice}  (грн.)</div>
					<div><a href="/All_del${model.id}" class="btn btn-default">Очистити корзину</a></div> 
  		</div>
	
		<div class=" col-md-10">
			<form:form class="form-horizontal" action="/shopping" method="POST" modelAttribute="setting">
  						<custom:hiddenInputs excludeParams="model, count, name, phone"/>	
				<div class="form-group">
							<label for="name" class="col-sm-1 control-label" style="color:#fff">Ім'я</label>
    						<div class="col-sm-2">
      							<form:input type="text" class="form-control" path="name" id="name"/>
    						</div>
    						<label for="phone" class="col-sm-1 control-label" style="color:#fff">Телефон</label>
    						<div class="col-sm-2">
      							<form:input type="text" class="form-control" path="phone" id="phone"/>
    						</div>
    						<div class="col-sm-3">
      							<button type="submit" class="btn btn-success">Оформити замовлення</button>
    						</div>
    					</div>
  			</form:form>
  		</div>
  	 -->
  	
  		
  				
  	
		  		<div class="col-md-12 col-xs-12" style="border-bottom:3px solid white;">
					<p style=" font-family: Cuprum , sans-serif; font-weight: 200; font-size:30px; color: white;">Порівняння</p>
				</div>
				
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center" style="margin-top:2rem; padding:0px ; color: #fcd041; font-size:15px; font-weight:500 ;background-color:#171717">
				
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Модель</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Процесор</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Пам'ять,<br/>ОЗП</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Діагональ екрану</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Вага</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Батарея</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Основна камера</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;word-wrap:break-word">Фронтальна камера</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Стан</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Ціна</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; border-right:1px solid white;">Комплект</div>
					
					<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:7.5rem;padding-left:0px; padding-top:1rem; padding-right:0px; ">Очистити</div>
					
				</div>
				
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="color:white; padding:0px; font-size:14px;">		
					<c:forEach var="compare" items="${Compares}" >
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center" style="padding:0px;border-top:1px solid white;background-color:#171717">
					
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.processor.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.memory.name},<br/>${compare.key.ram.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.diagonal.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.weight.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.battery.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.rear_camera.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.front_camera.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">10/10</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.price}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:1rem; border-right:1px solid white;">${compare.key.kit.name}</div>
						
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1" style="height:9rem;padding-left:0px; padding-right:0px; padding-top:3rem; "> <a href="/compare/del/${compare.key.id}"><span style="color:red; font-size:20px;" class="glyphicon glyphicon-remove-circle"></span></a></div>
					</div>
					</c:forEach>
				</div>
		<!-- 			
			<c:forEach var="compare" items="${Compares}" >
				<div class="shoping_foto">
					<div class="div_shoping_foto" ><p><img src="/images/type/${compare.key.id}.jpg?version=${compare.key.version}" width="100%"></p></div>
				</div>
				<div class="shoping_name">
					<div class="div_shoping_name" ><a href="/type/${compare.key.id}" style=" text-decoration:none; color:#ffffff; font-size:28px">${compare.key.name}</a></div>
				</div>
				<div class="shoping_count">
						<div class="div_shoping_count"><span class="badge">${compare.value}</span></div>
				  <div class="div_shoping_count_text"><label for="number"  style="color:#fff">шт.</label></div>
				</div>
				<div class="shoping_price">
					<div class="div_shoping_price">${compare.key.price*compare.value} грн / шт.</div>
				</div>	
					<div class="shoping_delete">
						<div class="div_shoping_delete"><a href="/compare/del/${compare.key.id}" class="btn btn-default">З корзини</a></div>
					</div>
			</c:forEach>
		 -->				

						
		</div>
</jsp:useBean>