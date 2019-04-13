<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

 <div class="row" style="background-color:#101010">
 <!-- <nav class="navbar navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myNavbar" aria-expended="false">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar" >
      <ul class="nav navbar-nav navbar-left">
        <li class="active"><a href="/">Головна</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Доставка<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul>
        </li>
        <li><a href="#">Оплата</a></li>
        <li><a href="#">Контакти</a></li>
        <li><a href="#">Про Нас</a></li>
        </ul>
      <ul class="nav navbar-nav">
        <li><a  href="/shopping" type="button" style="color:red" ><span class="glyphicon glyphicon-shopping-cart"></span> Корзина : ${quantity.count}</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/registration"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>-->
 

  <div class="container-fluid">
   
    
	<sec:authorize access="!isAuthenticated()">
	
	<div class="col-sm-12 col-xs-12 col-md-12 col-lg-12" style="height:30px; margin-top:10px; margin-bottom:0px; background-color:#101010" >
	
		<div class="col-sm-6 col-xs-6 col-md-5 col-lg-5" >
		
			<div class="col-sm-2 col-xs-2 col-md-2 col-lg-2" style="padding-right:0px;">
				<a  class="headerStyle" href="/" >Головна</a>
			</div>
			<div class="col-sm-4 col-xs-4 col-md-5 col-lg-4" style="padding-right:0px;">
				<a class="headerStyle"  href="#">Доставка і Оплата</a>
			</div>
			<div class="col-sm-2 col-xs-2 col-md-2 col-lg-2" style="padding-left:0px;">
				<a class="headerStyle" href="#">Контакти</a>
			</div>
			<div class="col-sm-4 col-xs-4 col-md-3 col-lg-2" style="padding-left:0px; padding-right:0px;">
				<a class="headerStyle" href="#">Про Нас</a>
			</div>
			
		</div>
			
		<div class="col-sm-offset-2 col-xs-offset-2 col-sm-4 col-xs-4 col-md-offset-3 col-lg-offset-4 col-md-4 col-lg-3	">
		
			<div class=" col-sm-offset-1 col-xs-offset-1  col-sm-6 col-xs-6 col-md-6 col-lg-6" >
				<a class="headerStyle" href="/compare" type="button" >Порівняння <span class="badge">${quantityCompare.count}</span></a>
			</div>
			<div class=" col-sm-5 col-xs-5 col-md-5 col-lg-5" >
				<a class="headerStyle" href="/shopping" type="button" >Корзина <span class="badge">${quantity.count}</span></a>
			</div>
		
		</div> 
	
	</div>
		
	
	</sec:authorize>
	 
			<sec:authorize access="isAuthenticated()">	
				<sec:authorize access="hasRole('ROLE_ADMIN')">
				
				<div class="col-sm-12 col-xs-12 col-md-12 col-lg-12" style="height:30px; margin-top:10px; margin-bottom:10px; background-color:#101010" >
	
			<div class="col-sm-6 col-xs-6 col-md-5 col-lg-5" >
		
				<div class="col-sm-2 col-xs-2 col-md-2 col-lg-2" style="padding-right:0px;">
					<a  class="headerStyle" href="/" >Головна</a>
				</div>
				<div class="col-sm-4 col-xs-4 col-md-5 col-lg-4" style="padding-right:0px;">
					<a class="headerStyle"  href="#">Доставка і Оплата</a>
				</div>
				<div class="col-sm-2 col-xs-2 col-md-2 col-lg-2" style="padding-left:0px;">
					<a class="headerStyle" href="#">Контакти</a>
				</div>
				<div class="col-sm-2 col-xs-2 col-md-3 col-lg-2" style="padding-left:0px; padding-right:0px;">
					<a class="headerStyle" href="#">Про Нас</a>
				</div>
			
			</div>
			
			<form:form action="/logout" method="POST">
	  		<div class=" col-sm-2 col-xs-2  col-md-3 col-lg-3	" style="padding:0px">
		
					<div class=" col-sm-10 col-xs-10 col-md-6 col-lg-6" >${user.login}
						<a class="headerStyle" href="/admin" type="button" >admin</a>
						<button  type="submit" style="background-color:transparent;color: white;text-decoration:none;padding:5px;border:1px solid #fcd13f">Вийти</button>
					</div>
					
					<!-- <div class=" col-sm-5 col-xs-5 col-md-5 col-lg-5" >
						<a class="headerStyle" href="/shopping" type="button" >Корзина <span class="badge">${quantity.count}</span></a>
					</div> -->
		
				</div>  
			</form:form>
			
			<div class="col-sm-4 col-xs-4  col-lg-offset-1 col-md-4 col-lg-3	">
		
				<div class="col-xs-offset-1 col-sm-offset-1  col-sm-6 col-xs-6 col-md-6 col-lg-6" >
					<a class="headerStyle" href="/compare" type="button" >Порівняння <span class="badge">${quantityCompare.count}</span></a>
				</div>
				<div class=" col-sm-5 col-xs-5 col-md-5 col-lg-5" >
					<a class="headerStyle" href="/shopping" type="button" >Корзина <span class="badge">${quantity.count}</span></a>
				</div>
		
			</div>

	</div>
			  
			
	    		<!-- 	<ul >
	    			 <form:form action="/logout" method="POST">
	    			 	<div  >${user.login}</div>
						<a  href="/admin">admin</a>
						<button  type="submit" class="btn btn-warning">log out</button>
					 </form:form>
					 </ul>
				 -->
	   			 
				
				</sec:authorize>
			
			
				
				
			
			<sec:authorize access="hasRole('ROLE_USER')">
				<div class="admin" class="navbar-header">
	    			<form:form action="/logout" method="POST">
						<c:forEach items="${users}" var="user">
						<div >${user.login}</div>
						</c:forEach>
						<button  type="submit" class="btn btn-warning">Logout</button>
					 </form:form>
	   			 </div>
			</sec:authorize>
			
		</sec:authorize>
	
  </div>
</div>


<!--  <div class="top-panel">
  <div class="container">
    <div class="top-panel-inner row flex-between flex-middle">

      <div class="top-menu-wrapper cell- hide-sm">
        




  <ul class="top-menu menu">

    

      
      

      <li class="top-menu-item menu-item level-1 is-current">
        
        <a href="/" class="top-menu-link menu-link level-1">
          Каталог
        </a>
      </li>

    

      
      

      <li class="top-menu-item menu-item level-1 ">
        
        <a href="/page/delivery" class="top-menu-link menu-link level-1">
          Доставка и оплата
        </a>
      </li>

    

      
      

      <li class="top-menu-item menu-item level-1 ">
        
        <a href="/page/about-us" class="top-menu-link menu-link level-1">
          О компании
        </a>
      </li>

    

      
      

      <li class="top-menu-item menu-item level-1 ">
        
        <a href="/page/kontakty" class="top-menu-link menu-link level-1">
          Контакты
        </a>
      </li>

    

      
      

      <li class="top-menu-item menu-item level-1 ">
        
        <a href="/page/delivery" class="top-menu-link menu-link level-1">
          Доставка
        </a>
      </li>

    

      
      

      <li class="top-menu-item menu-item level-1 ">
        
        <a href="/page/payment" class="top-menu-link menu-link level-1">
          Оплата
        </a>
      </li>

    
  </ul>










      </div>

      <div class="cell- hide show-sm">
        <button type="button" class="top-panel-open" data-target="#left-panel" data-type="panel" data-position="left" data-onopen="initLeftMenu">
          <i class="fa fa-bars"></i>
        </button>

        <button type="button" class="top-panel-open" data-target="#mobile-search" data-type="panel" data-position="top mobile-search">
          <i class="fa fa-search"></i>
        </button>
      </div>

      
        <div class="compares-widget cell- ">
          <a href="/compares" class="compares-widget-link">
            <i class="compare-widget-icon fa fa-bar-chart"></i>
            <span class="hide-sm">Сравнение:</span>
            <span class="compares-widget-count js-compares-widget-count">0</span>
          </a>
        </div>
      

      <div class="shopcart-widget cell- text-right">
        <a href="/cart_items" title="Корзина" class="shopcart-link">
          <span class="shopcart-icon">
            <i class="fa fa-shopping-cart"></i>
          </span>

          <span class="shopcart-widget-count js-shopcart-widget-count hide show-sm">0</span>

          <span class="hide-sm">
            Корзина:

            <span class="shopcart-widget-amount js-shopcart-widget-amount">0.00&nbsp;руб</span>
          </span>
        </a>
      </div>

    </div>
  </div>
</div>-->
