<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %> 
 <%@taglib prefix="s" uri="/struts-tags" %> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
 <html xmlns="http://www.w3.org/1999/xhtml"> 
 <head> 
    <title> ͼ��չʾϵͳ </title> 
    <link href="<%=request.getContextPath() %>/css/demo.css"
        rel="stylesheet" type="text/css" /> 
 </head> 
 <body> 
 <s:actionmessage /> 
 <table> 
    <tr> 
        <th> ͼ�� ID</th> 
        <th> ���� </th> 
        <th> �۸� </th> 
        <th> ���� </th> 
    </tr> 
    <s:iterator value="model"> 
    <tr> 
        <td><s:property value="id"/></td> 
        <td>${name}</td> 
        <td>${price}</td> 
        <td><a href="book/${id}"> �鿴 </a> | 
        <a href="book/${id}/edit"> �༭ </a> | 
        <a href="book/${id}/deleteConfirm"> ɾ�� </a></td> 
    </tr> 
    </s:iterator> 
 </table> 
 <a href="<%=request.getContextPath() %>/book/new"> ������ͼ�� </a> 
 </body> 
 </html>