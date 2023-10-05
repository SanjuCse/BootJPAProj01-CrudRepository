<%@ page import="com.sanju.service.*" %>
<% 
StudentServiceMgmt service = new StudentServiceMgmt();
out.println("Student Rank::" + service.getRank(120));
%>
