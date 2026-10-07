<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>

<body>

    <h2>Student Registration</h2>

    <form action="StudentServlet" method="post">

        <label>Roll No:</label>
        <input type="text"
               name="rollNo"
               required>

        <br><br>

        <label>Name:</label>
        <input type="text"
               name="name"
               required>

        <br><br>

        <label>Department:</label>
        <input type="text"
               name="department"
               required>

        <br><br>

        <label>Year:</label>
        <input type="number"
               name="year"
               required>

        <br><br>

        <input type="submit"
               value="Register">

    </form>

</body>

</html>