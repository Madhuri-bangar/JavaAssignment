package JDBCAssignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDbConnection {

    public static Connection getConnection() throws Exception {
        String driverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee_management";
        String username = "root";
        String password = "Madhu@15";

        Class.forName(driverName);
        return DriverManager.getConnection(url, username, password);
    }
}
