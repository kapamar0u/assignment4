<%-- 
    Document   : index
    Created on : Jun 5, 2019, 9:11:40 PM
    Author     : Kosta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .button {width: 50%;}
            .content {
                max-width: 500px;
                margin: auto;
                background-color: grey;
            }
            thead{
                text-align: center;
            }

        </style>

    </head>

    <body class="content">
        <table class="table">
            <tr><thead><h1>WELCOME !</h1></thead></tr><br>
    <tr>
    <button class="button"><h3><a href="InsertTrainer.htm">insert trainer</a></h3></button><br>
    <button class="button"><h3><a href="viewAllTrainers.htm">view all trainers</a></h3></button><br>
    </tr>
</table>

</body>
</html>
