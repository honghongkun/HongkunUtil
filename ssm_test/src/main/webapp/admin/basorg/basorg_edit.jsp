<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>X教务系统-修改组织结构</title>
<link href="../../js/layui/css/layui.css" rel="stylesheet">
<link href="../../css/reset.css" rel="stylesheet" type="text/css" />
<link href="../../js/ligerui/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="../../css/jwstyle.css?v=20180116" rel="stylesheet" type="text/css"  />
<link href="../../css/index.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="../../js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="../../js/ligerui/js/ligerui.all.js"></script>
<script type="text/javascript" src="../../js/layer/layer.js"></script>
<script type="text/javascript" src="../../js/layui/layui.js"></script>


	<script type="text/javascript">
	var customerTypeidbox;
		function doEditBasOrg(index){
			var orgDepartment = $("#orgDepartment").val().trim();
			if(orgDepartment.length<1){
				layer.tips('请输入院系', '#orgDepartment', {
					  tips: [1, '#3595CC'],
					  time: 1500
					});
				$("#orgDepartment").val('');
				$("#orgDepartment").focus();
				return false;
			 }
			var orgLevel = $("#orgLevel").val().trim();
			if(orgLevel.length<1){
				layer.tips('请输入专业', '#orgLevel', {
					  tips: [1, '#3595CC'],
					  time: 1500
					});
				$("#orgLevel").val('');
				$("#orgLevel").focus();
				return false;
			 }
			var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
			 var postData={"orgId":parent.eid,
					 orgDepartment:$("#orgDepartment").val().trim(),
					 orgLevel: $("#orgLevel").val().trim(),
					 /* orgName:$("#orgName").val().trim(), */
					 orgInfo:$("#orgInfo").val().trim(),
					 euid:$("#euid").val().trim(),
					 orgCodebystu:$("#orgCodebystu").val().trim(),
					 eudate:$("#eudate").val().trim()
					 }; 
			 
					
			$.ajax({
				  type: "post",
				  url: "editBasOrgByID.action",
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
				   url: "selBasOrgByID.action",
				   data: "orgId="+parent.eid,
				  dataType:"json",
				   success: function(msg){
				       if(msg.succ){
				    	   $("#orgDepartment").val(msg.data.orgDepartment);
				    	   $("#orgLevel").val(msg.data.orgLevel);
				    	   $("#orgName").val(msg.data.orgName);
				    	   $("#orgInfo").val(msg.data.orgInfo);
				    	   $("#euid").val(msg.data.euid);
				    	   $("#orgCodebystu").val(msg.data.orgCodebystu);
				    	   $("#eudate").val(msg.data.eudate);
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
		    <label class="layui-form-label">院系</label>
		    <div class="layui-input-block">
		      <input type="text"  id="orgDepartment" maxlength="100"  placeholder="输入院系" class="jw-input w-200">
		    </div>
		</div>
		
		<div class="layui-form-item">
		    <label class="layui-form-label">专业</label>
		    <div class="layui-input-block">
		      <input type="text"  id="orgLevel" maxlength="100"  placeholder="输入专业" class="jw-input w-200">
		    </div>
		</div>
		
			<!-- <div class="layui-form-item">
		    <label class="layui-form-label">班级</label>
		    <div class="layui-input-block">
		      <input type="text"  id="orgName" maxlength="100"  placeholder="输入班级" class="jw-input w-200">
		    </div>
		</div> -->
		
		<div class="layui-form-item">
		    <label class="layui-form-label">组织编码</label>
		    <div class="layui-input-block">
		      <input type="text"  id="orgCodebystu" maxlength="100"  placeholder="输入院系" class="jw-input w-200">
		    </div>
		</div>
		
		<div class="layui-form-item">
		    <label class="layui-form-label">备注</label>
		    <div class="layui-input-block">
		      <input type="text"  id="orgInfo" maxlength="100"  placeholder="输入备注" class="jw-input w-200">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">修改人</label>
		    <div class="layui-input-block">
		      <input type="text"  id="euid" maxlength="100"  placeholder="输入修改人" class="jw-input w-200">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">修改日期</label>
		    <div class="layui-input-block">
		      <input type="text" name="date" id="eudate" lay-verify="date" placeholder="输入修改日期" autocomplete="off" class="jw-input w-200">
		    </div>
		</div>
		
		</form>
	 </div>
 
</body>

<script type="text/javascript">
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //日期
  laydate.render({
    elem: '#eudate'
  });
  laydate.render({
    elem: '#date1'
  });
 
});
</script>

</html>