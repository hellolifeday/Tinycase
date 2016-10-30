package cn.aben.mystore.domain;

import java.util.List;

/**
 * 分页的实体类:
 */
public class PageBean {
	private int currPage ; // 当前页数
	private int pageSize ; // 每页显示记录数
	private int totalCount ; // 总记录数.
	private int totalPage ; // 总页数.
	private String  servletName ; // 跳转的Servlet
	private List<Object> list; // 每页显示数据的集合.
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public String getServletName() {
		return servletName;
	}
	public void setServletName(String servletName) {
		this.servletName = servletName;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
}
