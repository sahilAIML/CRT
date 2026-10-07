import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        if (username.equals("admin")
                && password.equals("admin123")
                && role.equals("admin")) {

            response.sendRedirect("admin");

        } else if (username.equals("student")
                && password.equals("student123")
                && role.equals("student")) {

            response.sendRedirect("student.html");

        } else {

            response.setContentType("text/html");

            response.getWriter().println(
                    "<h2>Invalid Username or Password</h2>");

            response.getWriter().println(
                    "<a href='login.html'>Try Again</a>");
        }
    }
}