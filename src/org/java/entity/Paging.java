package org.java.entity;

/**
 * 分页实列
 * @author Yuan Kang
 *
 */
public class Paging {
	private Integer pageIndex = 1;
	private Integer pageSize = 2;
	private Integer pageRow;
	
	public Integer getPageCount(){
		return pageRow%pageSize==0?pageRow/pageSize:pageRow/pageSize+1;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex <= 1 ? 1:(pageIndex >= getPageCount() ? getPageCount():pageIndex);
	}

	@Override
	public String toString() {
		return "Paging [pageIndex=" + pageIndex + ", pageSize=" + pageSize
				+ ", pageRow=" + pageRow + "]";
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageRow() {
		return pageRow;
	}

	public void setPageRow(Integer pageRow) {
		this.pageRow = pageRow;
	}

	public Paging() {
		super();
	}
	
}
