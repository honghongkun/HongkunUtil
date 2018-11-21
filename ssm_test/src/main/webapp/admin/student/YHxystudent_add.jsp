<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>X教务系统-新增学籍信息</title>
<link href="../../js/layui/css/layui.css" rel="stylesheet" type="text/css" />
<link href="../../css/reset.css" rel="stylesheet" type="text/css" />
<link href="../../js/ligerui/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="../../css/jwstyle.css?v=20180116" rel="stylesheet" type="text/css"  />
<link href="../../css/index.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="../../js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="../../js/ligerui/js/ligerui.all.js"></script>
<script type="text/javascript" src="../../js/layer/layer.js"></script>
<script type="text/javascript" src="../../js/layui/layui.js"></script>
<script type="text/javascript" src="../../js/ChinesePY.js"></script>
<script type="text/javascript" src="../../js/SFZ/Foridentity.js"></script>
	<script type="text/javascript">
	var customerTypeidbox;
		function doAddBasStu(index){
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
					 var tuid = $("#tuid").val().trim();
						
						if(tuid.length<1){
							layer.tips('请输入添加人', '#tuid', {
								  tips: [1, '#3595CC'],
								  time: 1500
								});
							$("#tuid").val('');
							$("#tuid").focus();
							return false;
						 }
                      
			var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
			var postData={
					orgCode:$("#orgCode").val(), 
					stuName : $("#stuName").val().trim(),
					stuIdcaed : $("#txtCardID").val().trim(),
					stuCode : $("#stuCode").val().trim(),
					stuTempCode : $("#stuTempCode").val().trim(),
					stuNation : $("#stuNation").val().trim(),
					stuProvince : $("#stuProvince").val().trim(),
					stuAddress : $("#stuAddress").val().trim(),
					stuGrade : $("#basName").val().trim(),
					stuStatusType : $("#stuStatusType").val().trim(),
					stuEmail : $("#mazey").val().trim(),
					stuPyname : $("#allpym").html(),
					stuBirthday : $("#txtBirth").val().trim(),
					tuid : $("#tuid").val().trim(),
					/* tudate : $("#tudate").val().trim(), */
					stuSex : $("#txtSex").val().trim()
					 };
			 
			 $.ajax({
				  type: "post",
				  url: "addBasStu.action",
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
		
/* ---------------------------编号下拉----------------------------------------------------- */
		$(function(){
			$.ajax({
				  type: "post",
				  url: "selOrgcode2.action",
				  dataType: "json",
				  success: function(msg){	
					  var optionstr="";
					 if(msg.succ){
						var data = JSON.stringify(msg.data)
						var jsonObj = JSON.parse(data);//转换为json对象
						for(var i=0;i<jsonObj.length;i++){
							optionstr+='<option value="'+jsonObj[i].orgId+'">'+jsonObj[i].orgCodebystu+"</option>";
							//$("#orgCode").val(jsonObj[i].orgCode);
						//alert(jsonObj[i].orgCode); //取json中的值
								}
						$("#orgCode").append(optionstr);
					 }
				  }
			});
			
		});
/* ---------------------------年级下拉----------------------------------------------------- */
		$(function(){
			$.ajax({
				  type: "post",
				  url: "selbasStuGradeBy2.action",
				  dataType: "json",
				  success: function(msg){	
					  var optionstr="";
					 if(msg.succ){
						var data = JSON.stringify(msg.data)
						var jsonObj = JSON.parse(data);//转换为json对象
						for(var i=0;i<jsonObj.length;i++){
							optionstr+='<option value="'+jsonObj[i].basId+'">'+jsonObj[i].basName+"</option>";
							//$("#orgCode").val(jsonObj[i].orgCode);
						//alert(jsonObj[i].orgCode); //取json中的值
								}
						$("#basName").append(optionstr);
					 }
				  }
			});
			
		});
		
/* ---------------------------邮箱验证----------------------------------------------------- */	
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
		
	</script>
</head>
<body>
 	
 	 <div style="padding: 10px;">
 	 <form  class="layui-form"  id="addform" action=""> <!-- id="addform" -->
 	  
 	   <div class="layui-form-item">
 	     <div class="layui-inline" style="width:321px">
         <label class="layui-form-label">组织编号</label>
            <div class="layui-input-block">
              <select id="orgCode" name="interest" lay-filter="aihao" >
              <option value="">选择编号</option>
              </select>
         </div>
      </div>
      
      <div class="layui-inline" style="width:321px">
		    <label class="layui-form-label">年级</label>
		    <div class="layui-input-block">
              <select id="basName" name="interest" lay-filter="aihao" >
              <option value="">选择年级</option>
              </select>
         </div>
		</div>
    </div>
 	  
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
		    <label class="layui-form-label">添加人</label>
		    <div class="layui-input-block">
		      <input type="text"  id="tuid" onclick="check();"  placeholder="输入添加人" autocomplete="off" class="jw-input w-200">
		    </div>
		    </div>
		    
		   <!--  <div class="layui-inline">
		    <label class="layui-form-label">添加日期</label>
		    <div class="layui-input-block">
		      <input type="text"  name="date" id="tudate"  placeholder="输入添加日期" autocomplete="off" class="jw-input w-200">
		    </div>
		</div> -->
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
    elem: '#tudate'
  });
  laydate.render({
    elem: '#date1'
  });
  
  form.render();
  
});

</script>

</html>