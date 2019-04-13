<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="row">
	<div class="col-sm-12 col-xs-12">
		<div class="col-md-offset-5 col-md-6">
			<form:form class="form-horizontal" action="/login" method="POST">
				<div class="form-group">
	    		<!--  	<label for="login" class="col-sm-2 control-label" style="color:#fff">Login</label>-->
	    			<div class="col-sm-4">
	      				<input class="backlight" class="form-control" name="login" id="login" placeholder="login">
	    			</div>
	  			</div>
				<div class="form-group">
	    		<!--  	<label for="password" class="col-sm-2 control-label" style="color:#fff">Password</label>-->
	    			<div class="col-sm-4">
	      				<input class="backlight" placeholder="password" class="form-control" type="password" name="password" id="password">
	    			</div>
	  			</div>
	  			<div class="form-group">
	  				<div class=" col-sm-10">
	  					<div class="checkbox">
	  						<label style="color:#fff">
	  							<input name="remember-me" type="checkbox" > Remember me
	  						</label>
	  					</div>
	  				</div>
	  			</div>
	  			<div class="form-group">
	    			<div class="col-sm-10">
	      				<button type="submit" class="btn btn-info">Sign in</button>
	    			</div>
	  			</div>
			</form:form>
		</div>
	</div>
</div>