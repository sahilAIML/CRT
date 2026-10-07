package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // MySQL details
    private static final String URL =
            "jdbc:mysql://localhost:3306/studentdb";

    private static final String USER = "root";

    private static final String PASSWORD = "sahilop12";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Get roll number from HTML
        String rollNo = request.getParameter("roll_no");

        try {

            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL query
            String sql =
                    "SELECT * FROM students WHERE roll_no = ?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, rollNo);

            // Execute query
            ResultSet rs = ps.executeQuery();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Student Details</title>");
            out.println("</head>");
            out.println("<body>");

            if (rs.next()) {

                out.println("<h2>Student Details</h2>");

                out.println("<p>Roll Number: "
                        + rs.getString("roll_no")
                        + "</p>");

                out.println("<p>Name: "
                        + rs.getString("name")
                        + "</p>");

                out.println("<p>Department: "
                        + rs.getString("department")
                        + "</p>");

                out.println("<p>Year: "
                        + rs.getInt("year")
                        + "</p>");

            } else {

                out.println("<h2>Student Not Found</h2>");

                out.println("<p>No student found for roll number: "
                        + rollNo
                        + "</p>");
            }

            out.println("<br>");
            out.println("<a href='index.html'>Search Again</a>");

            out.println("</body>");
            out.println("</html>");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            out.println("<h2>Database Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");

            e.printStackTrace();
        }
    }
}