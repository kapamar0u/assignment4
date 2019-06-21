<%-- 
    Document   : viewAllShelves
    Created on : Jun 4, 2019, 9:49:39 PM
    Author     : Kosta
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            th,td {
                border: 1px solid black;
                text-align: center;
            }
            th{
                background-color: coral;
            }
        </style>
    </head>
    <body>

        <table>
            <th>ID</th>
            <th>FIRSTNAME</th>
            <th>LASTNAME</th>
            <th>UPDATE</th>
            <th>DELETE</th>

            <c:forEach var = "i" items="${list}">
                <tr> 
                    <td>
                        <c:out value="${i.id}"/>
                    </td>
                    <td>
                        <c:out value="${i.firstname}"/>
                    </td>
                     <td>
                        <c:out value="${i.lastname}"/>
                    </td>
                    <td>
                        <button><a href="${pageContext.request.contextPath}/update/${i.id}">Update</a></button>
                    </td>
                    <td>
                        <button><a href="${pageContext.request.contextPath}/delete/${i.id}">Delete</a></button>
                    </td>
                </tr>
            </c:forEach>

                
        </table>
        <button><a href="/assignment4">home</a></button>
    </body>
</html>
