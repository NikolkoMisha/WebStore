	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
			
		<div class="col-md-12 col-xs-12" style="border-bottom:3px solid white; margin-top:38px">
			<p style=" font-family: Cuprum , sans-serif; font-weight: 300; font-size:35px; color: #fcd13f;">${commodity.name}</p>
		</div>
		
		<div class="col-md-12 col-xs-12 col-sm-12 col-lg-12" style="padding-left:0px; padding-right:0px; margin-bottom:40px;">
			
			<c:forEach items="${categories}" var="category">
			
				<div class="col-xs-3 col-sm-3 col-md-3   col-lg-3" style=" border-bottom:1px solid white; margin-top:30px; padding-left:0px; padding-right:0px; height: 332px;  text-align:center;">
					<div class="col-lg-12" style="margin-bottom:19px;">
				 		<a href="/category/${category.id}"><img src="/images/category/${category.id}.jpg?version=${category.version}" width="100%"></a>
					</div>
				<a href="/category/${category.id}" style="margin-top:19px; text-decoration:none; color: white; font-size:26px; font-family: Cuprum, sans-serif; font-weight:300;">${category.name}</a>
				</div>
			
			</c:forEach>
			
			
			
		</div>
			
			
		</div>
	
</jsp:useBean>
<!-- 
<c:if test="${empty category}">
	<h3 style="color:white; font-size:20px;">Category is empty</h3>
</c:if>
 -->