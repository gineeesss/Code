package org.example;

import java.sql.*;

public class Conexion {
    private static String usr, pass, FQDN, dbName;
    private static int port;
    public static String URI;

    Conexion(String usr, String pass , String FQDN, String port, String dbName){
        this.usr = usr;
        this.pass = pass;
        this.FQDN = FQDN;
        this.port = Integer.parseInt( port );
        this.dbName = dbName;
        this.URI="jdbc:mysql://" +
                usr + ":" +
                pass + "@" +
                FQDN + ":" +
                this.port + "/" +
                dbName +
                "?useLegacyDatetimeCode=false&serverTimezone=Europe/Madrid";
    }
    Conexion(){
        this("usr","pass","localhost","13306","dbDefault");
    }

    public void select(String sql){
        try (Connection conn = DriverManager.getConnection( this.URI );
             //Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql) ){

            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for ( int i = 1 ; i <= numberOfColumns ; i++ ) {
                System.out.print( rsmd.getColumnName(i) + "\t");
            } // for
            System.out.println("");


            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("id") + "\t" +
                        rs.getString("nombre") + "\t" +
                        rs.getString("edad"));
            } // while

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { e.printStackTrace(); }

    } // select()
} // class Conexion
