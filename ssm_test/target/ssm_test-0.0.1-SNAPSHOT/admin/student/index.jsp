<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>骝马新跨白玉鞍  战罢沙场月色寒</title>
		<!-- <link href="../../css/jwstyle.css" rel="stylesheet" type="text/css"  /> -->
		<!-- <link href="../../js/layui/css/layui.css" rel="stylesheet" type="text/css"> -->
		<link href="../../js/ligerui/skins/Aqua/css/ligerui-all_studeng2.css" rel="stylesheet" type="text/css" />
		<!-- <link href="../../js/ligerui/skins/Gray2014/css/all.css"  rel="stylesheet" type="text/css" /> -->
		<!-- <link href="../../css/index.css" rel="stylesheet" type="text/css" /> -->
		<link href="../../js/ztree/css/metroStyle/metroStyle.css"  rel="stylesheet" type="text/css" >
		<link href="../../css/reset.css" rel="stylesheet" type="text/css" />
		<script src="../../js/jquery-1.9.0.min.js"  type="text/javascript" ></script>
		<script src="../../js/ligerui/js/ligerui.all.js"  type="text/javascript" ></script>
		<script src="../../js/ztree/js/jquery.ztree.all.min.js" type="text/javascript"></script>
		<script src="../../js/layer/layer.js" type="text/javascript"></script>
		<script src="../../js/layui/layui.js" type="text/javascript"></script>
		<style type="text/css">
		.ztree li a{color:#666;}
		.ztree li a:hover{color:#009688;position:relative;text-decoration:none;top:1px;left:1px;}
		.ztree li a.curSelectedNode {background-color:#e5e5e5;color: #009688;height:23px;}
		</style>
</head>
<body style="margin: 0px;padding: 0px;background-color: #f5f5f5;height: 100%;">
	
	<div id="main_layout" style="overflow: hidden;margin: 0px;">
		<div position="left"  id="main_left">
			 <div id="treeMenu" style="overflow: auto;">
			 	<ul id="mtree" class="ztree"></ul>
			 </div> 
		</div>
		<div position="center" id="layout_center">
			<div tabid="home" title="我的工作台" lselected="false">
				<iframe frameborder="0" name="showmessage" src="student.html"></iframe>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="index.js?v=20180816"></script>
	<script type="text/javascript">
		layui.use('element', function(){
		   var element = layui.element;
		});
		
	</script>
</body>
</html>