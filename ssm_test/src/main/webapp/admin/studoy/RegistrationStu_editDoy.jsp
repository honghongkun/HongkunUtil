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
		function doeditRegistrationStuDoy(index){
			
			var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
			var postData={"registrationId":parent.eid,
					registrationStuName:$("#registrationStuName").html(), 
					registrationDoyName : $("#registrationDoy").val().trim(),
					registrationRoom : $("#registrationRoom").val().trim()
					 };
			 
			 $.ajax({
				  type: "post",
				  url: "editRegistrationStu.action",
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
		
/* ---------------------------宿舍楼下拉----------------------------------------------------- */
		$(function(){
			$.ajax({
				  type: "post",
				  url: "selDoyNamelist1.action",
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
						$("#registrationDoy").append(optionstr);
					 }
				  }
			});
			
		});
		
		 $(function(){
				$.ajax({
					  type: "POST",
					   url: "selRegistrationStuByID.action",
					   data: "registrationId="+parent.eid,
					  dataType:"json",
				   success: function(msg){
				       if(msg.succ){
							$("#registrationStuName").html(msg.data.registrationStuName);
							$("#registrationDoyName").html(msg.data.registrationDoyName);
							$("#registration").html(msg.data.registrationRoom);
							
				       }
				   }
				});
			})
		
	</script>
</head>
<body>
 	
 	 <div style="padding: 10px;">
 	 <form  class="layui-form"  id="addform"> <!-- id="addform" -->
 	  
 	 <div class="layui-form-item">
         <div class="layui-inline">
		    <label class="layui-form-label">学生姓名</label>
		    <div class="layui-input-block">
             <div class="layui-form-mid layui-word-aux" id="registrationStuName" style="font-size: 15px"></div>
            </div>
		 </div>
     </div>
 	  
 	    <div class="layui-form-item">
 	    <div class="layui-inline" style="width:200px">
		    <label class="layui-form-label">原宿舍楼</label>
		    <div class="layui-input-block">
             <div class="layui-form-mid layui-word-aux" id="registrationDoyName" style="font-size: 15px"></div>
            </div>
		 </div>
 	    
 	       <div class="layui-inline" style="width:321px">
           <label class="layui-form-label">更换宿舍楼</label>
            <div class="layui-input-block">
              <select id="registrationDoy" name="interest" lay-filter="aihao" >
              <option value="">选择宿舍楼</option>
              </select>
            </div>
            </div>
         </div>
        <div class="layui-form-item">
          <div class="layui-inline" style="width:200px">
		    <label class="layui-form-label">原宿舍</label>
		    <div class="layui-input-block">
             <div class="layui-form-mid layui-word-aux" id="registration" style="font-size: 15px"></div>
            </div>
		 </div>
          <div class="layui-inline">
		    <label class="layui-form-label">更换房间</label>
		    <div class="layui-input-block">
		      <input type="text"  id="registrationRoom" maxlength="100"  placeholder="输入楼层房间" class="jw-input w-200" />
		    </div>
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
</script>

</html>