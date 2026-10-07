import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try {

            String name = request.getParameter("user");

            String password = request.getParameter("pass");

            if (password.equals("sairam")) {

                RequestDispatcher rd =
                        request.getRequestDispatcher("Welcome");

                rd.forward(request, response);

            } else {

                out.println(
                    "<font color='red'><b>" +
                    "You have entered incorrect password" +
                    "</b></font>"
                );

                RequestDispatcher rd =
                        request.getRequestDispatcher("index.html");

                rd.include(request, response);
            }

        } finally {

            out.close();
        }
    }
}