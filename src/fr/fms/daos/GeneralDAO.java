package fr.fms.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GeneralDAO {

    protected Connection conn;

    private final String url = "jdbc:mysql://localhost:3306/formationsvente";
    private final String user = "formationsvente";
    private final String password = "Vente123";

    public GeneralDAO() {
        try {
            Class.forName("org.mariadb.jdbc.Driver"); // driver JDBC
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
