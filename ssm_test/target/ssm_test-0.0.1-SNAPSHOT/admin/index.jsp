<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>骝马新跨白玉鞍  战罢沙场月色寒</title>
		<link href="../css/jwstyle.css" rel="stylesheet" type="text/css"  />
		<link href="../js/layui/css/layui.css" rel="stylesheet" type="text/css">
		<link href="../js/ligerui/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
		<link href="../js/ligerui/skins/Gray2014/css/all.css"  rel="stylesheet" type="text/css" />
		<link href="../css/index.css" rel="stylesheet" type="text/css" />
		<link href="../js/ztree/css/metroStyle/metroStyle.css"  rel="stylesheet" type="text/css" >
		<link href="../css/reset.css" rel="stylesheet" type="text/css" />
		<script src="../js/jquery-1.9.0.min.js"  type="text/javascript" ></script>
		<script src="../js/ligerui/js/ligerui.all.js"  type="text/javascript" ></script>
		<script src="../js/ztree/js/jquery.ztree.all.min.js" type="text/javascript"></script>
		<script src="../js/layer/layer.js" type="text/javascript"></script>
		<script src="../js/layui/layui.js" type="text/javascript"></script>
		<style type="text/css">
		.ztree li a{color:#666;}
		.ztree li a:hover{color:#009688;position:relative;text-decoration:none;top:1px;left:1px;}
		.ztree li a.curSelectedNode {background-color:#e5e5e5;color: #009688;height:23px;}
		</style>
</head>
<body style="margin: 0px;padding: 0px;background-color: #f5f5f5;height: 100%;">
	<div id="index_top" class="l-topmenu" style="height:50px;background-color: #393D49;">
		<div class="fl ml-10" style="color: #fff;line-height: 50px;font-size: 18px;">供达学生教务管理</div>
		<div class="fr" style="margin-right: 40px;">
			<ul class="layui-nav" style="height: 48px;line-height: 48px;">
			  <li class="layui-nav-item" style="height: 48px;line-height: 48px;">
			    <a href="javascript:void(0);"><i class="layui-icon" style="font-size: 18px; color: #1E9FFF;">&#xe612;</i>&nbsp;&nbsp;${sessionScope.sessionUser.sysUserBean.username==null?sessionScope.sessionUser.sysUserBean.userzh:sessionScope.sessionUser.sysUserBean.username}</a>
			    <dl class="layui-nav-child" style="top: 50px;z-index: 99999;" >
			      <dd><a href="javascript:void(0);">修改密码</a></dd>
			      <dd><a id="loginOut" href="javascript:void(0);">退出系统</a></dd>
			    </dl>
			  </li>
			</ul>
		</div>
	</div> 
	<div id="main_layout" style="overflow: hidden;margin: 0px;">
		<div position="left" title="功能菜单" id="main_left">
			 <div id="treeMenu" style="overflow: auto;">
			 	<ul id="mtree" class="ztree"></ul>
			 </div> 
		</div>
		<div position="center" id="layout_center">
			<div tabid="home" title="我的工作台" lselected="true">
				<iframe frameborder="0" name="showmessage" src="main_SZ.html"></iframe>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="index.js?v=20180816"></script>
	<script type="text/javascript">
		layui.use('element', function(){
		   var element = layui.element;
		});
		
		function login_out(){
			$("#loginOut").on("click",function(){
				layer.confirm('确定要退出系统吗?', {icon: 3, title:'系统提示'}, function(index){
					  window.location.href='../index.jsp';
					  layer.close(index);
					});
			});
			
		}
		function  nologin(msg){
			layer.open({
				  shade:[0.1, '#393D49'],
				  anim: 1,
				  type: 0,
				  title: '系统提示',
				  content: msg,
				  yes: function(index, layero){	
					window.location.href='../index.jsp';
				    layer.close(index);
				  }
			}); 
		}
		
		function  nopower(msg){
			layer.open({
				  shade:[0.1, '#393D49'],
				  anim: 1,
				  type: 0,
				  title: '系统提示',
				  content: msg,
				  yes: function(index, layero){	
				    layer.close(index);
				  }
			}); 
		}
		
	</script>
</body>
</html>