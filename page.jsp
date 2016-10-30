<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	第${ pageBean.currPage }/${ pageBean.totalPage }页 &nbsp;
	总记录数:${ pageBean.totalCount }&nbsp;
	每页显示:${ pageBean.pageSize }条&nbsp;
	<c:if test="${ pageBean.currPage != 1 }">
		<a href="${ pageContext.request.contextPath }/${pageBean.servletName }&currPage=1" target="body">[首页]</a> |
		<a href="${ pageContext.request.contextPath }/${pageBean.servletName }&currPage=${ pageBean.currPage - 1}" target="body">[上一页]</a> 
	</c:if>
	<c:if test="${ pageBean.currPage == 1 }">
		[首页] |
		[上一页] 
	</c:if>
	
	<!-- 分页工具条 -->
	<c:forEach begin="${ pageBean.currPage - 5 > 0 ? pageBean.currPage - 5 : 1 }" end="${ pageBean.currPage + 4 > pageBean.totalPage ? pageBean.totalPage : pageBean.currPage + 4 }" step="1" var="i">
		<c:if test="${ pageBean.currPage == i }">
			${ i }
		</c:if>
		<c:if test="${ pageBean.currPage != i }">
		<a href="${ pageContext.request.contextPath }/${pageBean.servletName }&currPage=${i}" target="body">${ i }</a>
		</c:if>
	</c:forEach>
	
	<c:if test="${ pageBean.currPage != pageBean.totalPage }">
		<a href="${ pageContext.request.contextPath }/${pageBean.servletName }&currPage=${ pageBean.currPage + 1}" target="body">[下一页]</a> |
		<a href="${ pageContext.request.contextPath }/${pageBean.servletName }&currPage=${ pageBean.totalPage }" target="body">[尾页]</a> 
	</c:if>
	<c:if test="${ pageBean.currPage == pageBean.totalPage }">
		[下一页] |
		[尾页]
	</c:if>
