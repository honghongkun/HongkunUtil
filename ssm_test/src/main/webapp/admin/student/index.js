function init_main(){
				   $("#main_layout").ligerLayout({
	                    leftWidth: 180,
	                    heightDiff:-4,
	                    space: 1,
	                    onHeightChanged:f_heightChanged,
	                    onEndResize:function(){
	                    	 tab && tab.trigger('sysWidthChange');
	                    },
	                    onLeftToggle: function (){
	                        tab && tab.trigger('sysWidthChange');
	                    },
	                    onRightToggle: function (){
	                        tab && tab.trigger('sysWidthChange');
	                    }

	                    
	                });

	                var height = $(".l-layout-center").height();

	                //Tab
	                tab = $("#layout_center").ligerTab({
	                    height: height,
	                    showSwitchInTab : true,
	                    showSwitch: true,
	                    onBeforeSelectTabItem: function(tabid){
	                    	var nodes = menuTreeObject.getNodesByParam("zyId", tabid, null);
	                    	if(nodes.length>0){
	                    		menuTreeObject.selectNode(nodes[0]);
	                    		}else{
	                    		menuTreeObject.cancelSelectedNode();
	                    		}
	                    	
	                      }
                        
	                });
	                
			}
			
			
				
			var setting = {
					view: {
							dblClickExpand: true,
							showLine: true,
							selectedMulti: false
						  },
					async:{
					    url:"getmenu22.action",
					    dataFilter:function(treeId, parentNode, responseData){
					    	if(responseData.succ){
					    		return responseData.data;
					    	}/*else{
					    		if(responseData.noLogin){
					    			nologin(responseData.msg);
					    		}
					    		if(responseData.noPower){
					    			nopower(responseData.msg);
					    		}
					    	}*/
					    },
					    type:"post",
						enable: true,
						dataType: "JSON"
					},
					data: {
						key:{
						  name:"zyName",
						  title:"zyName"
						},
						simpleData: {
							enable: true,
							idKey: "zyId",
							pIdKey: "zyPid",
							rootPId: "0"
						}
					},
					callback: {
						beforeClick:function(treeId, treeNode, clickFlag){
					
							var selected = true;
							if(treeNode.isParent){
								menuTreeObject.expandNode(treeNode,true,false);
								selected = false;
							}
							
							 if(treeNode.zyUrl!= null && treeNode.zyUrl!= "#"){
								 f_addTab(treeNode.zyId,treeNode.zyName,makeUrl(treeNode.zyUrl));
								 selected =  true;
							 }
							 return selected;
							
						}
							
						
						
					}
			    };


			
			function f_heightChanged(options){  
                if (tab){tab.addHeight(options.diff);} 
                setMenuDivHeight();
            }
			
			 function f_addTab(tabid,text,url){
		         tab.addTabItem({tabid: tabid, text: text, url: url });
		     }
			
			 function  makeUrl(urls){
				 if(urls.indexOf("?")>-1){
					 urls += "&";
				 }else{
					 urls += "?";
				 }
				 return urls+"_vertime="+new Date().getTime();
				 
			 }
			
			function  setMenuDivHeight(){
				$("#treeMenu").height($(document).height()-$("#treeMenu").offset().top);
			}
			
			function  menutreeSelect(tabid){
				var nodes = menuTreeObject.getNodesByParam("zyId", tabid, null);
				 
			}
			
			$(function(){
				init_main();
				menuTreeObject = $.fn.zTree.init($("#mtree"), setting, null);
				setMenuDivHeight();
				login_out();
				
			});
			