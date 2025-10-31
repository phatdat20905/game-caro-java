package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    protected Connection con;

    public DAO() {
        final String DATABASE_NAME = "caro_game"; // TODO FILL YOUR DATABASE NAME
        // ✅ Thêm serverTimezone=UTC để tránh lỗi timezone
        final String jdbcURL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME + "?useSSL=false&serverTimezone=UTC";
        final String JDBC_USER = "root";   // TODO FILL YOUR DATABASE USER
        final String JDBC_PASSWORD = "";   // TODO FILL YOUR DATABASE PASSWORD

        try {
            // ✅ Dùng driver mới cho MySQL 8.x
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(jdbcURL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("✅ Connected to database successfully!");
        } catch (Exception e) {
            System.out.println("❌ Connection to database failed");
            e.printStackTrace();
        }
    }
}
