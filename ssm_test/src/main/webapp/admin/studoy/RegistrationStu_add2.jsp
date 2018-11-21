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
		function doAddRegistrationStu(index){
			var myText = $("#myText").val().trim();
			
			if(myText.length<1){
				layer.tips('请输入联系电话', '#myText', {
					  tips: [1, '#3595CC'],
					  time: 1500
					});
				$("#myText").val('');
				$("#myText").focus();
				return false;
			 }
			var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
			var postData={
					registrationStuName:$("#registrationStuName").val(), 
					registrationStuSex : $("#registrationStuSex").val().trim(),
					registrationDoyName : $("#registrationDoyName").val().trim(),
					registrationRoom : $("#registrationRoom").val().trim(),
					registrationPhone : $("#myText").val().trim()
					 };
			 
			 $.ajax({
				  type: "post",
				  url: "addRegistrationStu.action",
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
		
		
/* ---------------------------学生下拉----------------------------------------------------- */
		$(function(){
			$.ajax({
				  type: "post",
				  url: "selStuSexstudentV.action",
				  dataType: "json",
				  success: function(msg){	
					  var optionstr="";
					 if(msg.succ){
						var data = JSON.stringify(msg.data)
						var jsonObj = JSON.parse(data);//转换为json对象
						for(var i=0;i<jsonObj.length;i++){
							optionstr+='<option value="'+jsonObj[i].stuName+'">'+jsonObj[i].stuName+"</option>";
							//$("#orgCode").val(jsonObj[i].orgCode);
						//alert(jsonObj[i].orgCode); //取json中的值
								}
						$("#registrationStuName").append(optionstr);
					 }
				  }
			});
			
		});
/* ---------------------------宿舍楼下拉----------------------------------------------------- */
		$(function(){
			$.ajax({
				  type: "post",
				  url: "selDoyNamelist2.action",
				  dataType: "json",
				  success: function(msg){	
					  var optionstr="";
					 if(msg.succ){
						var data = JSON.stringify(msg.data)
						var jsonObj = JSON.parse(data);//转换为json对象
						for(var i=0;i<jsonObj.length;i++){
							optionstr+='<option value="'+jsonObj[i].doyName+'">'+jsonObj[i].doyName+"</option>";
							//$("#orgCode").val(jsonObj[i].orgCode);
						//alert(jsonObj[i].orgCode); //取json中的值
								}
						$("#registrationDoyName").append(optionstr);
					 }
				  }
			});
			
		});
		
		
	</script>
</head>
<body>
 	
 	 <div style="padding: 10px;">
 	 <form  class="layui-form"  id="addform" action=""> <!-- id="addform" -->
 	  
 	   <div class="layui-form-item">
     <div class="layui-inline" style="width:321px">
		    <label class="layui-form-label">学生姓名</label>
		    <div class="layui-input-block">
              <select id="registrationStuName" name="interest" lay-filter="aihao" >
              <option value="">选择学生</option>
              </select>
         </div>
		</div>
    </div>
 	  
		<div class="layui-form-item" style="width:321px">
		    <label class="layui-form-label">姓别</label>
		    <div class="layui-input-block">
		     <select id="registrationStuSex" name="interest" lay-filter="aihao" >
              <option value="女">女</option>
              </select>
		    </div>
		</div>
 	  
 	   <div class="layui-form-item">
 	     <div class="layui-inline" style="width:321px">
         <label class="layui-form-label">宿舍楼</label>
            <div class="layui-input-block">
              <select id="registrationDoyName" name="interest" lay-filter="aihao" >
              <option value="">选择宿舍楼</option>
              </select>
         </div>
      </div>
    </div>
    <div class="layui-form-item">
		    <label class="layui-form-label">楼层房间</label>
		    <div class="layui-input-block">
		      <input type="text"  id="registrationRoom" maxlength="100"  placeholder="输入楼层房间" class="jw-input w-200" />
		    </div>
		</div>
		</div>
    
        <div class="layui-form-item" style="margin-left:10px">
		    <label class="layui-form-label">联系电话</label>
		    <div class="layui-input-block">
		       <input type="text" onchange="subBtn()"  id="myText" maxlength="100"  placeholder="联系电话" class="jw-input w-200">
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
  
  form.render();
  
});

function subBtn(){
 
 if(iphoneCheck(myText)){
	 parent.MainSet.msg("手机号验证成功");
 var phone=$("#myText").val();
 var myphone=phone.substr(3,4);
 //alert(myphone)
 
 }else{
 alert("请输入正确的手机号")
 }
 
 function iphoneCheck(id){
 var temp=document.getElementById("myText");
 var re=/^[1][34587]\d{9}$/;//手机号码验证正则表达式
 if(re.test(temp.value)){
 return true;
 }else{
 return false;
 }
 }
}
</script>

</html>