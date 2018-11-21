<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>经办人查询</title>
<link href="../../js/layui/css/layui.css" rel="stylesheet">
<link href="../../css/reset.css" rel="stylesheet" type="text/css" />
<link href="../../js/ligerui/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="../../css/jwstyle.css?v=20180116" rel="stylesheet" type="text/css"  />
<link href="../../css/index.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="../../js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="../../js/ligerui/js/ligerui.all.js"></script>
<script type="text/javascript" src="../../js/layer/layer.js"></script>
	<script type="text/javascript">
 
      $(function(){
		$.ajax({
		   type: "POST",
		   url: "selBasOrgByID.action",
		   data: "orgId="+parent.jid,
		  dataType:"json",
		   success: function(msg){
		       if(msg.succ){
		    	   $("#cuid").html(msg.data.cuid);
		    	   $("#cudate").html(msg.data.cudate);
		    	   $("#euid").html(msg.data.euid);
		    	   $("#eudate").html(msg.data.eudate);
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
		  <div class="layui-inline" style="width:157px;">
		    <label class="layui-form-label">添加人:</label>
		    <div class="layui-input-block" id="cuid" style="font-size: 14px;margin-top: 8px;color: black;"></div>
		 </div>
		    
		 <div class="layui-inline" >
		    <label class="layui-form-label">添加日期:</label>
		    <div class="layui-input-block" id="cudate" style="font-size: 14px;margin-top: 8px;color: black;"></div>
		 </div>
	   </div>
		
	   <div class="layui-form-item">
		  <div class="layui-inline" style="width: 157px;">
		    <label class="layui-form-label">修改人:</label>
		    <div class="layui-input-block" id="euid" style="font-size: 14px;margin-top: 8px;color: black;"></div>
		 </div>
		    
		 <div class="layui-inline">
		    <label class="layui-form-label">修改日期:</label>
		    <div class="layui-input-block" id="eudate" style="font-size: 14px;margin-top:8px;color: black;"></div>
		 </div>
	   </div>
		
		</form>
	 </div>
 
</body>
</html>