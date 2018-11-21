<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>城市选择的三种实现</title>
    <!-- <link href="../../js/city/style.css" rel="stylesheet" type="text/css" /> -->
    <link href="../../js/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../../js/layui/layui.js"></script>
    <script type="text/javascript" src="../../js/jquery-1.9.0.min.js"></script>
    
</head>
<body>
<div>
    <fieldset>
        <legend>方法一：下拉选择框实现省市区（县）三级联动</legend>
        <form class="layui-form"  id="addform" action="#">
        <div class="layui-form-item">
            <label  for="addr-show">您选择的是：
               <input type="text" value="" class="jw-input w-200" id="addr-show" onClick="showAddr()">
            </label>
            </div>
            <br/>

            <!--省份选择-->
            <select id="prov" onchange="showCity(this)">
                <option>=请选择省份=</option>
            </select>

            <!--城市选择-->
            <select id="city" onchange="showCountry(this)">
                <option>=请选择城市=</option>
            </select>

            <!--县区选择-->
            <select id="country" onchange="selecCountry(this)">
                <option>=请选择县区=</option>
            </select>
            <button type="button" class="btn met1" onClick="showAddr()">确定</button>
        </form>
    </fieldset>
</div>

<script type="text/javascript" src="../../js/city/city.js"></script>
    <script type="text/javascript" src="../../js/city/city02.js"></script>
    <script type="text/javascript" src="../../js/city/method01.js"></script>
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