	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>

<jsp:useBean id="formHandler" class="project.dto.filter.TypeFilter" scope="page">
	<jsp:setProperty name="formHandler" property="search"/>
	<jsp:setProperty name="formHandler" property="minPrice"/>
	<jsp:setProperty name="formHandler" property="maxPrice"/>
	
	
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
			
			
		
		
		<div class="col-sm-12 col-xs-12 col-md-12 col-lg-12" style="border-top:3px solid white; border-bottom:3px solid white; text-align:center">
				
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
		<div style="margin-left:0px; margin-top:15px; margin-bottom:48px;  width:100% ;float:left">
			<img src="/resources/img/apple_8.jpg"  style="height:470px; width:100%">
		</div>
		<div class="col-md-12 col-xs-12" style="border-bottom:3px solid white;">
			<p style=" font-family: Cuprum , sans-serif; font-weight: 300; font-size:20px; color: #fcd13f;">Категорії</p>
		</div>
		
		<div class="col-md-12 col-xs-12 col-sm-12 col-lg-12" style="padding-left:0px; padding-right:0px; margin-bottom:40px;">
			
			
			
			<c:forEach items="${commodities}" var="commodity">
			
				<div class="col-xs-3 col-sm-3 col-md-3   col-lg-3" style="margin-top:30px; padding-left:0px; padding-right:0px; height: 332px;  text-align:center;">
					<div class="col-lg-12" style="margin-bottom:19px;">
						<a href="/commodity/${commodity.id}"><img src="/images/commodity/${commodity.id}.jpg?version=${commodity.version}" width="100%"></a>
					</div>
				<a href="/commodity/${commodity.id}" style="margin-top:19px; text-decoration:none; color: white; font-size:26px; font-family: Cuprum, sans-serif; font-weight:300;">${commodity.name}</a>
				</div>
			
			</c:forEach>
			
			
			
		</div>
			
			
			
			<div class="col-md-12 col-xs-12" style="border-bottom:3px solid white;">
				<p style=" font-family: Cuprum , sans-serif; font-weight: 300; font-size:20px; color: #fcd13f;">ТОП Продаж</p>
			</div>
		
		<div class="col-md-12 col-xs-12 col-sm-12 col-lg-12" style="padding-left:0px; padding-right:0px; margin-bottom:40px;">
			
			
			
			<c:forEach items="${page.content}" var="type">
				
				<div class="col-xs-3 col-sm-3 col-md-3   col-lg-3" style="margin-top:30px; padding-left:0px; padding-right:0px; height: 332px;  text-align:center;">
					<div class="col-lg-12" style="margin-bottom:19px;">
						<a href="/model/${type.id}"><img src="/images/type/${type.id}.jpg?version=${type.version}" width="100%"></a>
					</div>
				<a href="/model/${type.id}" style="margin-top:19px; text-decoration:none; color: white; font-size:26px; font-family: Cuprum, sans-serif; font-weight:300;">${type.name}</a>
				</div>
			
			
			<!-- 	<div style="margin-top:30px; margin-right:20px; margin-left:22px; float: left; height: 332px; width: 265px; text-align:center">
					<div style="margin-bottom:19px;  height: 265px; width: 265px;">
						<a href="/model/${type.id}"><img src="/images/type/${type.id}.jpg?version=${type.version}" width="100%"></a>
					</div>
				<a href="/model/${type.id}" style=" text-decoration:none; color: white; font-size:26px; font-family: Cuprum, sans-serif; font-weight:300;">${type.name}</a>
			 	<a href="/model/${type.id}" style=" text-decoration:none; color: white; font-size:16px; font-family: Cuprum, sans-serif; font-weight:300;">${type.price} грн</a> 
			  	<a href="/buy/${type.id}" class="btn btn-warning" id="btnSubmit" >В корзину</a> 
				</div>-->
			</c:forEach>
			<!--    	<div class="iphone_ipod" style="text-align:left;">
					<div class="index_golovna" >
						<div style="margin-top:20px; text-align:center;" ><p><a href="/model/${type.id}" style=" text-decoration:none; color:#eea236; font-size:28px">${type.name}</a></p></div>
						<div ><a href="/model/${type.id}"><img src="/images/type/${type.id}.jpg?version=${type.version}" width="100%"></a></div>
					
					<div style="margin-top:20px; text-align:center;"><p><a href="/model/${type.id}" style=" text-decoration:none; color:#eea236; font-size:28px">${type.price} грн</a>
						<a href="/buy/${type.id}" class="btn btn-warning" id="btnSubmit" >В корзину</a></p></div>
					</div>
				</div> -->
		</div>
		
		<div class="col-md-12 col-xs-12 col-sm-12 col-lg-12 " style="background-color: #171717; margin-bottom: 40px">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="text-align:center; margin-top: 20px; margin-bottom:20px; color: white; font-family: Cuprum, sans-serif; font-size: 24px; font-weight: 300;">
	            Замовте персональну консультацію
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
	    	  		<span style=" color: white; font-family: Cuprum, sans-serif;  font-weight: 400;">Замовити</span>
	            </button>
			</div>
		</div>
		
		<div class="col-md-12 col-xs-12" style="border-bottom:3px solid white;">
			<p style=" font-family: Cuprum , sans-serif; font-weight: 300; font-size:20px; color: #fcd041;">Блог</p>
		</div>
			
		<div class="col-md-12 col-xs-12 col-sm-12 col-lg-12" style="padding-left:0px; padding-right:0px;">
			
			
			
			<c:forEach items="${commodities}" var="commodity">
				
				<div class="col-xs-3 col-sm-3 col-md-3   col-lg-3" style="margin-top:30px; padding-left:0px; padding-right:0px; height: 332px;  text-align:center;">
					<div class="col-lg-12" style="margin-bottom:19px;">
						<a href="/commodity/${commodity.id}"></a>
					</div>
				<a href="/commodity/${commodity.id}" style="margin-top:19px; text-decoration:none; color: white; font-size:26px; font-family: Cuprum, sans-serif; font-weight:300;">${commodity.name}</a>
				</div>
				
			</c:forEach>
		</div>
		
		
		
		
		
		
	</div>
	<!--  
		<div class="row">
			<div class="col-md-12 col-xs-12 text-center">
				<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
			</div>
		</div>
	-->

<!-- 	<div class="col-md-2 col-xs-12" style="margin-top:25px;" style="float: left;">
		
		
		
		
		<form:form class="form-horizontal" action="/" method="GET" modelAttribute="filter" id="filter">
			<custom:hiddenInputs excludeParams="search, minPrice, maxPrice, colorIds, memoryIds"/>
			
				<div class="form-group">
					<div class="col-sm-6 col-xs-6">
						<div class="dropdown">
								<button class="backlight" type="button"
									data-toggle="dropdown">
									Sort <span class="caret"></span>
								</button>
							<ul class="dropdown-menu">
									<custom:sort innerHtml="Name asc" paramValue="name" />
									<custom:sort innerHtml="Name desc" paramValue="name,desc" />
							</ul>
						</div>
					</div>
					<div class="col-sm-6 col-xs-6" class="backlight" >
							<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
						
					</div>
				</div>
			
				<div class="form-group">
					<div class="col-sm-12">
	      				<input class="backlight" type="text" value='<%=formHandler.getSearch()%>' class="form-control" name="search" placeholder="Пошук">
	    			</div>
				</div>
				<div class="form-group">
					<div class="col-sm-6 col-xs-6">
	      				<input class="backlight" type="text" value='<%=formHandler.getMinPrice()%>' class="form-control" name="minPrice" placeholder="Мін">
	    			</div>
	    			<div class="col-sm-6 col-xs-6">
	      				<input class="backlight" type="text" value='<%=formHandler.getMaxPrice()%>' class="form-control" name="maxPrice" placeholder="Макс">
	    			</div>
				</div>
				<div class="form-group" class="backlight"  >
					<label for="color" class="col-sm-1 control-label" style="color:#fff;" >Колір</label>
					<div class="col-sm-12">
						<form:checkboxes element="div" items="${colors}" path="colorIds" itemLabel="name" itemValue="id" id="color"/>
					</div>
				</div>
				<div class="form-group">
					<label for="memory" class="col-sm-1 control-label" style="color:#fff;">Пам'ять</label>
					<div class="col-sm-12">
						<form:checkboxes element="div" items="${memories}" path="memoryIds" itemLabel="name" itemValue="id" id="memory" />
					</div>
				</div>
				<div class="col-sm-6 col-xs-6">
					<button  class="backlight" >Ok</button>
				</div>
		</form:form>
		
		
		
	</div>-->

</jsp:useBean>
<script>
    $(document).ready(function () {

        $("#formABC").submit(function (e) {

            //stop submitting the form to see the disabled button effect
            e.preventDefault();

            //disable the submit button
            $("#btnSubmit").attr("disabled", true);

            return true;

        });
    });
</script>