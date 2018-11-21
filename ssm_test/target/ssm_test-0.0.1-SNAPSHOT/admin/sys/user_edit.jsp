<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>修改用户</title>
<link href="../../js/layui/css/layui.css" rel="stylesheet">
<link href="../../css/reset.css" rel="stylesheet" type="text/css" />
<link href="../../js/ligerui/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="../../css/jwstyle.css?v=20180116" rel="stylesheet" type="text/css"  />
<link href="../../css/index.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="../../js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="../../js/ligerui/js/ligerui.all.js"></script>
<script type="text/javascript" src="../../js/layer/layer.js"></script>
	<script type="text/javascript">
	var customerTypeidbox;
	function doEditUser(index){
		var userZh = $("#userZh").val().trim();
		if(userZh.length<1){
			layer.tips('请输用户账号', '#userZh', {
				  tips: [1, '#3595CC'],
				  time: 1500
				});
			$("#userZh").val('');
			$("#userZh").focus();
			return false;
		 }
		var userPhone = $("#userPhone").val().trim();
		var userRolepid = $("#userRolepid").val().trim();
		var userPwd = $("#userPwd").val().trim();
		if(userPwd.length<1){
			layer.tips('请输用户密码', '#userPwd', {
				  tips: [1, '#3595CC'],
				  time: 1500
				});
			$("#userPwd").val('');
			$("#userPwd").focus();
			return false;
		 }
		var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
		 var postData={"userId":parent.eid,
				 userName:$("#userName").val().trim(),
				 userZh: $("#userZh").val().trim(),
				 userPhone:$("#userPhone").val().trim(),
				 userPwd:$("#userPwd").val().trim(),
				 userRolepid:$("#userRolepid").val().trim()
				 
				 }; 
		 
				
		$.ajax({
			  type: "POST",
			  url: "UaerEdit.action",
			  data:postData,
			  dataType: "json",
			  success: function(rd){
				  parent.layer.close(loadIndex);
				 if(rd.succ){
					 parent.MainSet.msg(rd.msg);
					 parent.layer.close(index);
					 parent.$("#gridrld").click();
				 }else{
					 layer.msg(rd.msg);
				 }
			  }
		});
		 
	 }
 
      $(function(){
		$.ajax({
		   type: "POST",
		   url: "selUserID.action",
		   data: "userId="+parent.eid,
		  dataType:"json",
		   success: function(msg){
		       if(msg.succ){
		    	   $("#userZh").val(msg.data.userZh);
		    	   $("#userName").val(msg.data.userName);
		    	   $("#userPwd").val(msg.data.userPwd);
		    	   $("#userPhone").val(msg.data.userPhone);
		    	   $("#userRolepid").val(msg.data.userRolepid);
		       }
		   }
		});
	})
			
	</script>
</head>
<body>
 	
 	 <div style="padding: 10px;">
 	  <form id="addform">
		<div class="layui-form-item">
		    <label class="layui-form-label">用户账号</label>
		    <div class="layui-input-block">
		      <input type="text"  id="userZh" maxlength="100"  placeholder="输入用户账号" class="jw-input w-200">
		    </div>
		</div>
		
		<div class="layui-form-item">
		    <label class="layui-form-label">真实姓名</label>
		    <div class="layui-input-block">
		      <input type="text"  id="userName" maxlength="100"  placeholder="输入真实姓名" class="jw-input w-200">
		    </div>
		</div>
		
			<div class="layui-form-item">
		    <label class="layui-form-label">用户密码</label>
		    <div class="layui-input-block">
		      <input type="text"  id="userPwd" maxlength="100"  placeholder="输入用户密码" class="jw-input w-200">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">联系电话</label>
		    <div class="layui-input-block">
		      <input type="text"  id="userPhone" maxlength="100"  placeholder="输入联系电话" class="jw-input w-200">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">角色</label>
		    <div class="layui-input-block">
		      <input type="text"  id="userRolepid" class="jw-input w-200">
		    </div>
		</div>
		</form>
	 </div>
 
</body>
</html>