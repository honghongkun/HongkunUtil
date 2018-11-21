<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../css/jwstyle.css" rel="stylesheet" type="text/css"  />
<link href="../../js/ztree/css/metroStyle/metroStyle.css"  rel="stylesheet" type="text/css" >
</head>
<body>
	 <div style="margin: 10px;">
	 	<ul id="treeDemo" class="ztree"></ul>
	 
	 </div>
	
	<script type="text/javascript" src="../../js/jquery-1.9.0.min.js"></script>
	<script src="../../js/ztree/js/jquery.ztree.all.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../../js/mainset.js?v=20180301"></script>

	<script type="text/javascript">
	
	var setting = {
			check: {
				enable: true
			},
			async:{
				enable: true,
				url:'selMenuForSet.action',
				otherParam:{"roleId":parent.setid},
				dataFilter:function(a,b,c){
					 if(c.succ){
						 for(x in c.data){
							c.data[x].checkedFlg= !(c.data[x].checkedFlg==null);
						 }
						 return c.data
					 } 
					
					
				}
			},
			callback:{
				onAsyncSuccess:function(){
					treeObj.expandAll(true);
				}
			},
			data: {
				simpleData: {
					enable: true,
					idKey: "menuId",
					pIdKey: "menuPid",
					rootPId: 0,
				},
				key:{
					checked:"checkedFlg",
					name:"menuName"
				}
			}
		};
	
		function  setRole(index){
			var checkedNotes =  treeObj.getCheckedNodes(true);
			 var  checkedKeys="";
			 for(x in checkedNotes){
				 checkedKeys  +=  checkedNotes[x].menuId+",";
			 }
			 if(checkedKeys.lastIndexOf(",")==checkedKeys.length-1){
				 checkedKeys = checkedKeys.substring(0,checkedKeys.length-1);
			 }
			 
			var loadIndex = parent.layer.load(2,{shade:[0.1, '#393D49']});
			 
			 var  postData = {'roleId':parent.setid,'checkedKeys':checkedKeys}
			 $.ajax({
					type:"post",
					url:"delOrAddRole.action",
					data:postData,
					dataType:"json",
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
				 
			 })
			 
		}
		
		
		
		$(document).ready(function(){
			treeObj =  $.fn.zTree.init($("#treeDemo"), setting, null);
		});

	
	</script>
</body>
</html>