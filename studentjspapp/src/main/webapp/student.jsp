<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <title>Student Registration</title>

</head>

<body>

    <h1>Student Registration</h1>

    <form action="StudentServlet" method="post">

        <label>Student Name:</label>

        <input type="text"
               name="studentName"
               required>

        <br><br>

        <label>Course:</label>

        <select name="course">

            <option value="Java">
                Java
            </option>

            <option value="Python">
                Python
            </option>

            <option value="React">
                React
            </option>

            <option value="C#">
                C#
            </option>

        </select>

        <br><br>

        <input type="submit"
               value="Register">

    </form>

</body>

</html>