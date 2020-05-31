
package com.qlda.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hienh
 */
public class BDConnect {
    
    public static Connection getConnection() {
        try {
            Connection cons = null;
            String dbURL = "jdbc:sqlserver://localhost;databaseName=QLDA;user=sa;password=123";
            cons = DriverManager.getConnection(dbURL);

            System.out.println("Connected");
            DatabaseMetaData dm = (DatabaseMetaData) cons.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
            return cons;

        } catch (SQLException ex) {
            Logger.getLogger(BDConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }
}
