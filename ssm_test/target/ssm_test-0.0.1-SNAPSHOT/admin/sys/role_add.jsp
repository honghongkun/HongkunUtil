<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>角色添加</title>
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
		function doAddRole(index){
			var roleName = $("#roleName").val().trim();
			if(roleName.length<1){
				layer.tips('请输角色名称', '#roleName', {
					  tips: [1, '#3595CC'],
					  time: 1500
					});
				$("#roleName").val('');
				$("#roleName").focus();
				return false;
			 }
			
			var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
			 var postData={roleName:$("#roleName").val().trim()
					 }; 
			 
					
			$.ajax({
				  type: "post",
				  url: "addRole.action",
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
		
	
	</script>
</head>
<body>
 	
 	 <div style="padding: 10px;">
 	  <form id="addform">
		<div class="layui-form-item">
		    <label class="layui-form-label">角色名称</label>
		    <div class="layui-input-block">
		      <input type="text"  id="roleName" maxlength="100"  placeholder="输入角色名称" class="jw-input w-200">
		    </div>
		</div>
		
		</form>
	 </div>
 
</body>
</html>