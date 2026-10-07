<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Student Search</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background: #f4f4f4;
            padding-top: 80px;
        }

        .container {
            width: 400px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px #ccc;
        }

        h2 {
            text-align: center;
        }

        input {
            width: 100%;
            padding: 12px;
            margin-top: 10px;
            margin-bottom: 20px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 12px;
            background: #333;
            color: white;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background: #555;
        }

    </style>

</head>

<body>

    <div class="container">

        <h2>Student Search</h2>

        <form action="${pageContext.request.contextPath}/Search"
              method="get">

            <label>Enter Roll Number:</label>

            <input
                type="number"
                name="roll"
                placeholder="Enter roll number"
                required
            >

            <button type="submit">
                Search Student
            </button>

        </form>

    </div>

</body>

</html>