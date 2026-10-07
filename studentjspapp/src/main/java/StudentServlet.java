import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Read data from JSP

        String name =
                request.getParameter("studentName");

        String course =
                request.getParameter("course");

        // 2. Backend processing

        String message =
                "Student registered successfully!";

        // 3. Store data in request

        request.setAttribute("studentName", name);

        request.setAttribute("course", course);

        request.setAttribute("message", message);

        // 4. Forward to JSP

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}