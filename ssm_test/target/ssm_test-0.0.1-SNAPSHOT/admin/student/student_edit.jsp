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
function doeditBasStu(index){
	var stuName = $("#stuName").val().trim();
	
	if(stuName.length<1){
		layer.tips('请输入姓名', '#stuName', {
			  tips: [1, '#3595CC'],
			  time: 1500
			});
		$("#stuName").val('');
		$("#stuName").focus();
		return false;
	 }
	var txtCardID = $("#txtCardID").val().trim();
	if(txtCardID.length<1){
		layer.tips('请输入身份证号', '#txtCardID', {
			  tips: [1, '#3595CC'],
			  time: 1500
			});
		$("#txtCardID").val('');
		$("#txtCardID").focus();
		return false;
	 }
	 var mazey = $("#mazey").val().trim();
		
		if(mazey.length<1){
			layer.tips('请输入邮箱有效格式', '#mazey', {
				  tips: [1, '#3595CC'],
				  time: 1500
				});
			$("#mazey").val('');
			$("#mazey").focus();
			return false;
		 }
			 var xuid = $("#xuid").val().trim();
				
				if(xuid.length<1){
					layer.tips('请输入修改人', '#xuid', {
						  tips: [1, '#3595CC'],
						  time: 1500
						});
					$("#xuid").val('');
					$("#xuid").focus();
					return false;
				 }
              /*  var xudate = $("#xudate").val().trim();
				if(xudate.length<1){
					layer.tips('请输入修改日期', '#xudate', {
						  tips: [1, '#3595CC'],
						  time: 1500
						});
					$("#xudate").val('');
					$("#xudate").focus();
					return false;
				 } */
	var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
	var postData={"stuId":parent.eid,
			/* orgCode:$("#orgCode").val(),  */
			stuName : $("#stuName").val().trim(),
			stuIdcaed : $("#txtCardID").val().trim(),
			stuCode : $("#stuCode").val().trim(),
			stuTempCode : $("#stuTempCode").val().trim(),
			stuNation : $("#stuNation").val().trim(),
			stuProvince : $("#stuProvince").val().trim(),
			stuAddress : $("#stuAddress").val().trim(),
			/* stuGrade : $("#stuGrade").val().trim(), */
			stuStatusType : $("#stuStatusType").val().trim(),
			stuEmail : $("#mazey").val().trim(),
			stuPyname : $("#allpym").html(),
			stuBirthday : $("#txtBirth").val().trim(),
			xuid : $("#xuid").val().trim(),
			/* xudate : $("#xudate").val().trim(), */
			stuSex : $("#txtSex").val().trim()
			 };
	 
	 $.ajax({
		  type: "post",
		  url: "editBasStu.action",
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


function check(){
    var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
    var obj = document.getElementById("mazey"); //要验证的对象
    if(obj.value === ""){ //输入不能为空
        parent.MainSet.msg("邮箱输入不能为空!");
        return false;
    }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
    	parent.MainSet.msg("邮箱验证不通过!");
        return false;
    }else{
    	 parent.MainSet.msg("邮箱验证通过！");
        return true;
    }
}

		
		 $(function(){
				$.ajax({
					  type: "POST",
					   url: "selBasStuID.action",
					   data: "stuId="+parent.eid,
					  dataType:"json",
				   success: function(msg){
				       if(msg.succ){
				    	    /* $("#orgCode").val(msg.data.orgCode); */
							$("#stuName").val(msg.data.stuName);
							$("#txtCardID").val(msg.data.stuIdcaed);
							$("#stuCode").val(msg.data.stuCode);
							$("#stuTempCode").val(msg.data.stuTempCode);
							$("#stuNation").val(msg.data.stuNation);
							$("#stuProvince").val(msg.data.stuProvince);
							$("#stuAddress").val(msg.data.stuAddress);
							/* $("#stuGrade").val(msg.data.stuGrade); */
							$("#stuStatusType").val(msg.data.stuStatusType);
							$("#mazey").val(msg.data.stuEmail);
							$("#allpym").html(msg.data.stuPyname);
							$("#txtBirth").val(msg.data.stuBirthday);
							$("#xuid").val(msg.data.xuid);
					    	/* $("#xudate").val(msg.data.xudate); */
							$("#txtSex").val(msg.data.stuSex);
				       }
				   }
				});
			})
	</script>
	
</head>
<body>
 	
 	 <div style="padding: 10px;">
 	 <form  class="layui-form"  id="addform" action=""> <!-- id="addform" -->
 	
		<div class="layui-form-item">
		<div class="layui-inline">
		    <label class="layui-form-label">姓名</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuName" maxlength="100"  placeholder="输入姓名" class="jw-input w-200" onkeyup="allpym.innerHTML=Pinyin.GetQP(this.value);" />
		    </div>
		    </div>
		    
		    <div class="layui-inline">
		    <label class="layui-form-label">身份证号</label>
		    <div class="layui-input-block">
		      <input type="text"  id="txtCardID" maxlength="100" onchange="getInfo()" placeholder="输入身份证号" class="jw-input w-200">
		      
		    </div>
		    
		</div>
		</div>
		
		  <div class="layui-form-item">
		   <div class="layui-inline">
		    <label class="layui-form-label">学号</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuCode" maxlength="100"  placeholder="输入学号" class="jw-input w-200">
		    </div>
		    </div>
		    
		    <div class="layui-inline">
		    <label class="layui-form-label">临时学号</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuTempCode" maxlength="100"  placeholder="输入学号" class="jw-input w-200">
		    </div>
		  </div>
		  </div>
		  
         
		<div class="layui-form-item">
		<div class="layui-inline">
		    <label class="layui-form-label">民族</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuNation" maxlength="100"  placeholder="输入民族" class="jw-input w-200">
		    </div>
		    </div>
		    
	   <div class="layui-inline">
        <label class="layui-form-label">性别</label>
         <div class="layui-input-block"> 
          <input type="text"  id="txtSex" maxlength="100"  placeholder="输入性别" class="jw-input w-200">
         </div>
       </div>
		</div>
		
		<div class="layui-form-item">
		 <div class="layui-inline">
		    <label class="layui-form-label">生源省份</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuProvince" maxlength="100"  placeholder="输入生源省份" class="jw-input w-200">
		    </div>
		    </div>
		    
		    <div class="layui-inline">
		    <label class="layui-form-label">地址</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuAddress" maxlength="100"  placeholder="输入地址" class="jw-input w-200">
		    </div>
		</div>
		</div>
		
		

		<div class="layui-form-item">
		<div class="layui-inline">
		    <label class="layui-form-label">流失类型</label>
		    <div class="layui-input-block">
		      <input type="text"  id="stuStatusType" maxlength="100"  placeholder="输入流失类型" class="jw-input w-200">
		    </div>
		    </div>
		    
		    <div class="layui-inline">
		    <label class="layui-form-label">邮箱</label>
		    <div class="layui-input-block">
		      
		      <input type="text" id="mazey"  maxlength="100"  placeholder="输入邮箱" class="jw-input w-200">
		     <!--  <i style="margin-top:-25px;margin-left:191px"  class="layui-icon">&#xe605;</i> -->
		    </div>
		</div>
		</div>
		
		<div class="layui-form-item">
		 <div class="layui-inline" style="width: 322px">
		    <label class="layui-form-label">姓名拼音</label>
		    <div class="layui-input-block" >
		     <div class="layui-form-mid layui-word-aux" id="allpym" style="font-size: 15px"></div>
		    </div>
		    </div>
		    
		    <div class="layui-inline">
		    <label class="layui-form-label" >出生日期</label>
		    <div class="layui-input-block">
		      <input type="text"  id="txtBirth"  placeholder="输入出生日期" autocomplete="off" class="jw-input w-200">
		    </div>
		</div>
		</div>
		
		<div class="layui-form-item">
		 <div class="layui-inline">
		    <label class="layui-form-label">修改人</label>
		    <div class="layui-input-block">
		      <input type="text"  id="xuid" onclick="check();"  placeholder="输入修改人" autocomplete="off" class="jw-input w-200">
		    </div>
		    </div>
		    
		    <!-- <div class="layui-inline">
		    <label class="layui-form-label">修改日期</label>
		    <div class="layui-input-block">
		      <input type="text"  name="date" id="xudate"  placeholder="输入修改日期" autocomplete="off" class="jw-input w-200">
		    </div> -->
		</div>
		</div>
		
		</form>
		</div>
 
</body>

<script type="text/javascript">
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form,
  layer = layui.layer,
  layedit = layui.layedit,
  laydate = layui.laydate;
  
  
  //日期
  laydate.render({
    elem: '#xudate'
  });
  laydate.render({
    elem: '#date1'
  });
  
  form.render();
  
});

</script>

</html>