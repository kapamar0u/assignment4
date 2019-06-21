<%-- 
    Document   : insertToShelve
    Created on : Jun 3, 2019, 7:16:39 PM
    Author     : Kosta
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            td {
                border: 1px solid black;
                text-align: center;
            }

            .hd{
                background-color: blueviolet;
            }
        </style>
    </head>
    <body>

        <form:form method="POST" modelAttribute="trainer" action="${pageContext.request.contextPath}/doInsertTrainer">
            <table>
                <tr>
                    <td class="hd">FIRSTNAME</td>
                    <td><form:input path="firstname" /></td>
                    <td><form:errors path="firstname" cssClass="" /></td>
                </tr>
                <tr>
                    <td class="hd">LASTNAME</td>
                    <td><form:input path="lastname" /></td>
                    <td><form:errors path="lastname" cssClass="" /></td>
                </tr>
            </table>
        <tr><input type="submit"></tr>

</form:form>
<button><a href="/assignment4">home</a></button>
</body>
</html>
