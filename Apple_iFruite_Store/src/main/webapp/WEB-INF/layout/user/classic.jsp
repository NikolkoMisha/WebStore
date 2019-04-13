<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/resources/js/jquery-3.1.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<script src="/resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/css/chosen.min.css">
<script src="/resources/js/chosen.jquery.min.js"></script>
<link rel="stylesheet" href="/resources/css/style.css">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style>
			/* width */
			::-webkit-scrollbar {
			  width: 7px;
			}
			
			/* Track */
			::-webkit-scrollbar-track {
			  background: #262626; 
			}
			::-webkit-scrollbar-track-piece {
			  background: #171717; 
			}
			 
			/* Handle */
			::-webkit-scrollbar-thumb {
			  background: #262626; 
			}
			
			/* Handle on hover */
			::-webkit-scrollbar-thumb:hover {
			  background: #262626; 
			}
			@media(min-width:500px) and(max-width:768px)
			.navbar-nav>li>a{
					padding:15px 5px;
				}
			}
			
		 </style>

<script>
	$(function() {
		$('select').chosen();
	});
	
</script>
<style type="text/css">
body {
	width: 100%;
    max-width: 100%;
    height:100%;
    min-height: 100%;
    overflow-x: hidden;
	padding-bottom:5%; 
	padding-top: 0px;
	background-color:#171717;
}
@media (min-width: 1000px) {
    .navbar .navbar-nav {
        display: inline-block;
        float: none;
        vertical-align: top;
    }
    .navbar .navbar-collapse {
        text-align: center;
    }
}
@media(max-width:1000px)  {
	.nav > li{
	 	float: none;
		position: relative;
		display: block;
	}
    .navbar-collapse.collapse {
        display: none !important;
    }
    .navbar-collapse {
        overflow-x: visible !important;
    }
    .navbar-collapse.in {
      overflow-y: auto !important;
    }
    .collapse.in {
      display: block !important;
    }
    .navbar-toggle {
      display: block;
  }
}
</style>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
    <tiles:insertAttribute name="header" />
<div class="container-fluid" style="min-height:100%;">
    <div class="container-fluid">
		<div class="container-fluid" >
			<tiles:insertAttribute name="body" />
		</div>
	</div>
</div>
		<tiles:insertAttribute name="footer" />
</body>
</html>