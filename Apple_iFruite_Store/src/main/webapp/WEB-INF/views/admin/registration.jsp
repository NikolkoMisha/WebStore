<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="row">
	<div class=" col-sm-12 col-xs-12">
	<div class="col-md-offset-4 col-md-6">
			<form:form class="form-horizontal" action="/admin/law/registration" method="POST" modelAttribute="user">
  			<div class="form-group">
				<label for="email" class="col-sm-offset-2 col-sm-10" style="color:red;"><form:errors path="email"/></label>
			</div>
			<div class="form-group">
			<label for="email" class="col-sm-2 control-label" style="color:#fff">Email</label>
    			<div class="col-sm-4">
      				<input class="backlight" placeholder="example@domain.com" class="form-control" name="email" id="email"/>
    			</div>
  			</div>
  			<div class="form-group">
				<label for="name" class="col-sm-offset-2 col-sm-10" style="color:red;"><form:errors path="name"/></label>
			</div>
			<div class="form-group">
			<label for="name" class="col-sm-2 control-label" style="color:#fff">Ім'я</label>
    			<div class="col-sm-4">
      				<input class="backlight" placeholder="name" class="form-control" name="name" id="name"/>
    			</div>
  			</div>
    		<div class="form-group">
				<label for="surname" class="col-sm-offset-2 col-sm-10" style="color:red;"><form:errors path="surname"/></label>
			</div>
			<div class="form-group">
    			<label for="surname" class="col-sm-2 control-label" style="color:#fff">Прізвище</label>
    			<div class="col-sm-4">
      				<input class="backlight" placeholder="surname" class="form-control" name="surname" id="surname"/>
    			</div>
    		</div>
  			<div class="form-group">
				<label for="login" class="col-sm-offset-2 col-sm-10" style="color:red;"><form:errors path="login"/></label>
			</div>
  			<div class="form-group">
  			<label for="telephone" class="col-sm-2 control-label" style="color:#fff">Логін</label>
    			<div class="col-sm-4">
      				<input class="backlight" placeholder="login" class="form-control" name="login" id="login"/>
    			</div>
  			</div>
  		 	<div class="form-group">
				<label for="password" class="col-sm-offset-2 col-sm-10" style="color:red;"><form:errors path="password"/></label>
			</div>
			<div class="form-group">
    			<label for="password" class="col-sm-2 control-label" style="color:#fff">Пароль</label>
    			<div class="col-sm-4">
      				<input class="backlight" placeholder="password" class="form-control" type="password" name="password" id="password"/>
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-2 col-sm-10">
      				<button type="submit" class="btn btn-info">Зареєструвати</button>
    			</div>
  			</div>
		</form:form>
	</div>
</div>
</div>
<script>
	$('label').each(function() {
		if(!$(this).html()) $(this).parent('div').hide();
	});
</script>