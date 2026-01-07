package fr.fms.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAO {

    protected Connection conn;

    private final String url = "jdbc:mysql://localhost:3306/VenteFormations";
    private final String user = "Vente123";
    private final String password = "Vente123";

    public DAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // driver JDBC
            this.conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /** close connection */
    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
