package org.example;

public class Main {
    public static void main(String[] args) {
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM personas;";
        conn.select( sql );
    }
}