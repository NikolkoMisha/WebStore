	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>

<jsp:useBean id="formHandler" class="project.dto.filter.TypeFilter" scope="page">
	<jsp:setProperty name="formHandler" property="search"/>


	
		<div class="  col-sm-12 col-xs-12 col-md-12 col-lg-12"  style="padding-bottom: 10%; min-height:100%; height: 100%; background-color:#262626">
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
							<p style=" font-family: Cuprum , sans-serif; font-weight: 200; font-size:30px; color: white;">Корзина</p>
						</div>
  	
  	
  	
  	
  	
  	
  	
  	
		<c:forEach var="cart" items="${sCart}" >  	
  			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="margin-top:40px;padding-left: 0px; padding-bottom: 40px;border-bottom:2px solid white;">
  				<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 text-center" >
  					<a href="/model/${cart.key.id}"><img src="/images/type/${cart.key.id}.jpg?version=${cart.key.version}" width="100%"></a>
  				</div>
  				
  				<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" style="margin-top:6%;">
  					<a href="/model/${cart.key.id}" style=" text-decoration:none; color:#fcd041; font-size:28px">${cart.key.name}</a>
  				</div>
  				
  				<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 text-center" style=" margin-top:7%;">
  					<p style="color:#fcd041; font-size:16px">${cart.key.price} грн</p>
  				</div>
  				
  				<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 text-center" style="margin-top:6%;">
				    <div style="float:left"><span style="color: #fcd041; font-size:30px">${cart.value}</span></div>
					<div style="float:bottom"><a href="/shopping/buy/${cart.key.id}" style="text-decoration:none;color:white; font-size:20px" type="button">+</a></div>
					<div ><a href="/del/${cart.key.id}" style="text-decoration:none;color:white; font-size:20px" type="button">-</a></div>
				</div>
				
				<div class="hidden-xs hidden-sm  hidden-md col-lg-2 text-center" style="margin-top:6.75%;">
  					<p style="color:#fcd041; font-size:20px">${cart.key.price*cart.value} грн</p>
  				</div>
  				
  				<div class="col-xs-2 col-sm-2 col-md-2 hidden-lg text-center" style="padding-right: 0px; margin-top:6.75%;">
  					<p style="color:#fcd041; font-size:20px">${cart.key.price*cart.value} грн</p>
  				</div>
  				
  				<div  class="col-xs-2 col-sm-2 col-md-2 col-lg-2 text-right" style="margin-top:6.75%;">
  					<button type="submit" name="button" style="outline:none; height:32px; background-color:transparent; border: 1px solid #fcd041;">
              			<span style=" color: white; font-family: Cuprum, sans-serif;  font-weight: 400;">Видалити</span>
           			</button>
  				</div>
  			</div>
  		</c:forEach>
  		
  		<div class="col-md-12 col-xs-12 col-sm-12 col-lg-12 " style="background-color: #171717;  margin-top: 10%;">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="text-align:center; margin-top: 20px; margin-bottom:20px; color: white; font-family: Cuprum, sans-serif; font-size: 24px; font-weight: 300;">
	            Оформити замовлення
	        </div>
	        
	        <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style=" margin-top: 16px; margin-bottom: 32px;">
	        	<p style="color: white; font-family: Cuprum, sans-serif; font-size: 22px; font-weight: 300;">Ім'я</p>
	        	<input class="col-xs-12 col-sm-12 col-md-12 col-lg-12" type="text" name="name" style=" outline:none; padding-left:1.4rem; background-color:transparent; border: 1px solid white; color: white; font-family: Cuprum, sans-serif; font-size: 20px; font-weight: 400;">
			</div>
			
			<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style=" margin-top: 16px;  margin-bottom: 32px;">
	        	<p style="color: white; font-family: Cuprum, sans-serif; font-size: 22px; font-weight: 300;">Tелефон</p>
				<input class="col-xs-12 col-sm-12 col-md-12 col-lg-12" type="text" name="name" style=" outline:none; padding-left:1.4rem; background-color:transparent; border: 1px solid white; color: white; font-family: Cuprum, sans-serif; font-size: 20px; font-weight: 400;">
			</div>
			
			<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style=" margin-top: 57px;  margin-bottom: 32px;">
            	<button class="col-xs-12 col-sm-12 col-md-12 col-lg-12" type="submit" name="button" style="height:3.2rem; outline:none; background-color:transparent; border: 1px solid #fcd041;">
	    	  		<span style=" color: white; font-family: Cuprum, sans-serif;  font-weight: 400;">Оформити</span>
	            </button>
			</div>
		</div>
  		
  		
  	 	<!-- 
  		<c:forEach var="cart" items="${sCart}" >
				<div class="shoping_foto">
					<div class="div_shoping_foto" ><p><img src="/images/type/${cart.key.id}.jpg?version=${cart.key.version}" width="100%"></p></div>
				</div>
				<div class="shoping_name">
					<div class="div_shoping_name" ><a href="/type/${cart.key.id}" style=" text-decoration:none; color:#ffffff; font-size:28px">${cart.key.name}</a></div>
				</div>
				<div class="shoping_count">
						<div class="div_shoping_count"><span class="badge">${cart.value}</span></div>
				  <div class="div_shoping_count_text"><label for="number"  style="color:#fff">шт.</label></div>
				</div>
				<div class="shoping_price">
					<div class="div_shoping_price">${cart.key.price*cart.value} грн / шт.</div>
				</div>	
					<div class="shoping_delete">
						<div class="div_shoping_delete"><a href="/del/${cart.key.id}" class="btn btn-default">З корзини</a></div>
					</div>
			</c:forEach>
	 	-->
		</div>		
	
</jsp:useBean>