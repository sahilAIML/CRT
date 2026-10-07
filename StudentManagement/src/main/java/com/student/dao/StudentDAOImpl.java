package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean addStudent(Student student) {

        String sql =
                "INSERT INTO students " +
                "(roll_no, name, department, year) " +
                "VALUES (?, ?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, student.getRollNo());
            ps.setString(2, student.getName());
            ps.setString(3, student.getDepartment());
            ps.setInt(4, student.getYear());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
}