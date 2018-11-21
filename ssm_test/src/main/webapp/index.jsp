<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>学籍管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="apple-mobile-web-app-status-bar-style" content="black"> 
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="format-detection" content="telephone=no">
  <link href="${pageContext.request.contextPath}/js/layui/css/layui.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/css/reset.css" rel="stylesheet" type="text/css" />
  <link href="${pageContext.request.contextPath}/css/jwstyle.css?v=20180116" rel="stylesheet" type="text/css"  />
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.0.min.js"></script>
  <%--使用非模块化加载...省事... --%>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/layui/layui.all.js"></script>
  
  <style type="text/css"> 
  	.main_banner{overflow:hidden;margin:0px;padding:0;width: 480px;height: 300px;background-color: #fff;
  				 position: absolute;top: 50%;left: 50%;margin-top: -150px;margin-left: -240px;
  				 border: 1px solid #dddddd;-moz-box-shadow: 0px 0px 5px #888;box-shadow: 0px 0px 5px #888;}	
	#particles-js{margin:0px;padding:0px;width: 100%;height: 100%;}
	.login-label{color: #555;font-size: 16px;}	
  </style>
  
</head>
<body class="layui-bg-cyan">
	 <div id="particles-js">
	  <div class="main_banner" >
	 	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;color: #000;">
		  <legend>用户登录</legend>
		</fieldset>
	  	<div id="logindiv" style="margin: 40px;">
	  		 <div class="layui-form-item">
			    <label class="layui-form-label login-label">用户名:</label>
			    <div class="layui-input-block">
			      <input type="text"  id="userzh"   placeholder="用户名" class="jw-input w-200">
			    </div>
			</div>
			 <div class="layui-form-item">
			    <label class="layui-form-label login-label">密&nbsp;&nbsp;码:</label>
			    <div class="layui-input-block">
			      <input type="password"  id="userpwd"  placeholder="密码" class="jw-input w-200">
			    </div>
			</div>
			 <div class="layui-form-item" style="text-align: center;">
			 	<button  id="userLoginBut" class="layui-btn">&nbsp;&nbsp;登&nbsp;&nbsp;录&nbsp;&nbsp;</button>
			 </div>
	  	</div>
	 </div>
	</div> 
<!-- scripts -->
<script src="${pageContext.request.contextPath}/js/particles/particles.js"></script>
<script src="${pageContext.request.contextPath}/js/particles/app.js?v=20180203"></script>

<script type="text/javascript">

	function pageInit(){
		var userzhVal = $("#userzh").val().trim();
		if(userzhVal==""){
			layer.tips('请输入用户名', '#userzh', {
				  tips: [1, '#3595CC'],
				  time: 1000
				});
			$("#userzh").val('');
			$("#userzh").focus();
			return;
		}
		var userpwdVal = $("#userpwd").val().trim();
		if(userpwdVal==""){
			layer.tips('请输入密码', '#userpwd', {
				  tips: [1, '#3595CC'],
				  time: 1000
				});
			$("#userpwd").val('');
			$("#userpwd").focus();
			return;
		}
		
		var postData ={userZh:userzhVal,userPwd:userpwdVal};
		var loadIndex = layer.load(2,{shade:[0.1, '#393D49']});
		$.ajax({
			   type: "POST",
			   url: "login.action",
			   data:postData,
			   dataType:"json",
			   success: function(rm){
				   if(rm.succ){
					    window.location.href="admin"
				   }else{
					   layer.close(loadIndex);
					   layer.msg(rm.msg,{time: 1000}); 
					   /*layer.msg("用户名或密码错误！");*/
				   }
			   }
		});
	}

	$(function(){
	 /* 模块化加载方案  这里不使用
		layui.use('layer', function(){
			   layer = layui.layer;
		});  */
		$("#userzh").focus();
		$("#userLoginBut").on("click",pageInit);
		$("#logindiv").on("keydown",function(e){
			 if(e.keyCode==13){
				 pageInit(); 
			 }
		});
	});
		 
</script>
</body>
 
</html>