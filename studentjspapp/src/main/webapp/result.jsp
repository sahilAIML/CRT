<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <title>Student Result</title>

</head>

<body>

    <h1>Registration Successful</h1>

    <p>
        Student Name:
        <%= request.getAttribute("studentName") %>
    </p>

    <p>
        Course:
        <%= request.getAttribute("course") %>
    </p>

    <h2>
        <%= request.getAttribute("message") %>
    </h2>

    <br>

    <a href="student.jsp">
        Register Another Student
    </a>

</body>

</html>