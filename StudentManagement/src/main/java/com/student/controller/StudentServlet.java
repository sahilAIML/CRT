package com.student.controller;

import java.io.IOException;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/StudentServlet", "/addStudent"})
public class StudentServlet extends HttpServlet {

    private StudentDAO studentDAO;

    @Override
    public void init() {

        studentDAO = new StudentDAOImpl();
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("student-form.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String rollNo =
                request.getParameter("rollNo");

        String name =
                request.getParameter("name");

        String department =
                request.getParameter("department");

        int year =
                Integer.parseInt(
                        request.getParameter("year")
                );

        Student student =
                new Student(
                        rollNo,
                        name,
                        department,
                        year
                );

        boolean result =
                studentDAO.addStudent(student);

        if (result) {

            request.setAttribute(
                    "message",
                    "Student registered successfully!"
            );

        } else {

            request.setAttribute(
                    "message",
                    "Student registration failed!"
            );
        }

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}