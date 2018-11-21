package com.Hong.ssm.utils;

import java.util.List;

/**
 * 分页类
 * @author wangy
 *
 * @param <T>
 */
public class PageModel<T> {
	
	private List<T> list;
	
	private  int totalRecords;
	
	private int pageSize;
	
	private int pageNo;
	
	public  PageModel() {
		
	}
	public  PageModel(int pageNo, int pageSize){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	public int getTopPageNo(){
		return 1;
		
	}
	
	public int getButtomPageNo(){
		return getTotalPages();
	}
	

	public int getPreviousPageNo(){
		if(pageNo <= 1){
		return 1;
		}
		return this.pageNo-1;
	}

	public int getNextPageNo(){
		if(this.pageNo >= getButtomPageNo()){
			return getButtomPageNo();
		}
		return this.pageNo+1;
	}
	
	public int getTotalPages(){
		
		return (totalRecords + pageSize-1) / pageSize;
		
	}
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * 获取当前开始条数
	 * @return
	 */
	public int getCurrentStartRecord(){
		return  (pageNo-1)*pageSize;
	}
	
}
