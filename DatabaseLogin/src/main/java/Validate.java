import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {

    public static boolean checkUser(
            String email,
            String pass) {

        boolean status = false;

        try {

            // Load MySQL JDBC Driver
            Class.forName(
                "com.mysql.cj.jdbc.Driver"
            );

            Connection con =
                    DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/studentdb",
                        "root",
                        "sahilop12"
                    );

            PreparedStatement ps =
                    con.prepareStatement(
                        "select * from register " +
                        "where email=? and pass=?"
                    );

            ps.setString(1, email);

            ps.setString(2, pass);

            ResultSet rs =
                    ps.executeQuery();

            status = rs.next();

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return status;
    }
}