import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Admin Dashboard</title>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1'>");
        out.println("    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <nav class='navbar navbar-dark bg-dark'>");
        out.println("        <div class='container'>");
        out.println("            <span class='navbar-brand'>Admin Portal</span>");
        out.println("            <a href='login.html' class='btn btn-outline-light'>Logout</a>");
        out.println("        </div>");
        out.println("    </nav>");
        out.println("    <div class='container mt-5'>");
        out.println("        <h2>Admin Dashboard</h2>");
        out.println("        <p class='text-muted'>Welcome, Administrator</p>");
        out.println("        <hr>");
        out.println("        <div class='row'>");
        out.println("            <div class='col-md-4'>");
        out.println("                <div class='card shadow'>");
        out.println("                    <div class='card-body'>");
        out.println("                        <h4>Manage Students</h4>");
        out.println("                        <p>View and manage all registered students</p>");
        out.println("                        <a href='student' class='btn btn-primary'>View Students</a>");
        out.println("                    </div>");
        out.println("                </div>");
        out.println("            </div>");
        out.println("            <div class='col-md-4'>");
        out.println("                <div class='card shadow'>");
        out.println("                    <div class='card-body'>");
        out.println("                        <h4>Manage Courses</h4>");
        out.println("                        <p>View courses and curriculum</p>");
        out.println("                        <button class='btn btn-success'>Course List</button>");
        out.println("                    </div>");
        out.println("                </div>");
        out.println("            </div>");
        out.println("            <div class='col-md-4'>");
        out.println("                <div class='card shadow'>");
        out.println("                    <div class='card-body'>");
        out.println("                        <h4>System Settings</h4>");
        out.println("                        <p>Configure portal options</p>");
        out.println("                        <button class='btn btn-secondary'>Settings</button>");
        out.println("                    </div>");
        out.println("                </div>");
        out.println("            </div>");
        out.println("        </div>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }
}