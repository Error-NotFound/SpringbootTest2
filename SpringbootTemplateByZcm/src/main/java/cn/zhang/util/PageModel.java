package cn.zhang.util;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PageModel {
	//查询结果集
	private List list;
	//总记录数
	private Integer totalRecords;
	//每页显示条数
	private Integer pageSize;
	//第几页
	private Integer pageNo;
	
	
	
	
	
	/**
	 * 获取总页数
	 * @return
	 */
	public Integer getTotalPages(){
		return (totalRecords+pageSize-1)/pageSize;
	}
	/**
	 * 获取首页
	 * @return
	 */
	public Integer getTopPageNo(){
		return 1;
	}
	/**
	 * 获取上一页
	 * @return
	 */
	public Integer getPreviousPageNo(){
		return pageNo<1?1:pageNo-1;
	}
	/**
	 * 获取下一页
	 * @return
	 */
	public Integer getNextPageNo(){
		return pageNo>getBottomPageNo()?getBottomPageNo():pageNo+1;
	}
	/**
	 * 获取尾页
	 * @return
	 */
	public Integer getBottomPageNo(){
		return getTotalPages();
	}
	
	
	
	
	
	
	
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo==1?0:pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
	
	
}
