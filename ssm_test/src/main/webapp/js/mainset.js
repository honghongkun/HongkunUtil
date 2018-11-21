var MainSet = MainSet || {};
/****
 * 设置grid宽度和高度
 */
MainSet.setGridSize =  function(autoH, autoW){
	 autoH = autoH || 57;
	 autoW = autoW || 16;
	 gridH = $(window).height() - $("#tableDiv").offset().top - autoH;
	 gridw = $(window).width()-autoW;
	return {h:gridH,w:gridw};
};
/**
 * 初始化gird
 */
MainSet.CreateGridInit = function(initObj){
	var MainGridSet = {
			mtype : "post",
			datatype : "json",
			shrinkToFit : false,//依据自定列宽
			rownumbers : true,//是否显示行号
			altRows : true,//隔行变色   
			autowidth : true,//宽度自动
			cmTemplate : {
			sortable : false,//设置所有列不排序
			title : false
			//设置所有列不显示title
			},
			page : 1,//设置初始的页码
			pager : "#jqGridPager",
			rowNum : 50,
			rowList : [ 50, 100, 200 ],
			viewrecords : true,//是否显示总记录数
			jsonReader : {
				id : "roleid",
				total : "pages",//总页数
				page : "pageNum",//页码
				records : "total",//查询出的记录数
				root : "roleList"//数据			  			
			},
			 prmNames: {page:"pageNo",rows:"pageSize", sort: null,order: null, search:null, nd:null, npage:null},
			loadComplete:function(rdata){
				if(!rdata.succ){
					if(rdata.noLogin){
						parent.nologin(rdata.msg);
						return false;
					}
					if(rdata.noPower){
						parent.nopower(rdata.msg);
						return false;
					}
				}
			}
	}
	return $.extend(true,MainGridSet,initObj);
};

/**
 * 提示
 * @param inputClass
 * @param sbutid
 * @returns
 */
MainSet.msg = function(msg,time){
	time = time*1000||1000;
	parent.layer.msg(msg,{time: time,offset: '80', anim: 1});
}

MainSet.tips = function(elem,msg){
	layer.tips(msg, elem, {
		  tips: [1, '#3595CC'],
		  time: 1500
		});
}


/*要筛选的样式,要点击的按钮*/
  function enterKey(inputClass,sbutid){ 
	$('body').on('keyup',inputClass,function(e) {  
    var theEvent = e || window.event;    
    var code = theEvent.keyCode || theEvent.which || theEvent.charCode;    
    if (code == 13) {$('#'+sbutid).click();}
    });
 }
  
  
