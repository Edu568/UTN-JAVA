package dataBase;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDeDatos {
    private Connection conexion;

    public Connection conectar = null;
    String usuario = "root";
    String contraseña = "root";
    String bd = "utn";
    String ip = "localhost";
    String puerto = "3306";

    String ruta = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //llama al driver
            conectar = DriverManager.getConnection(ruta, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto correctamente" + e);
        }

        return conectar;
    }

    public void cerrarConnection() throws SQLException {
        try {
            conectar.close();
        } catch (Exception e) {
        }
    } // las conexiones


    public BaseDeDatos(String url, String usuario, String contrasena) throws SQLException {
        conexion = DriverManager.getConnection(url, usuario, contrasena);
    }

    public void agregarAlumno(Alumno alumno) throws SQLException {
        if (String.valueOf(alumno.getLegajo()).length() != 5) {
            throw new IllegalArgumentException("El legajo debe tener 5 digitos");
        }
        String sql = "INSERT INTO alumnos (nombre, legajo) VALUES (?, ?)";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, alumno.getNombre());
        statement.setInt(2, alumno.getLegajo());
        statement.executeUpdate();
    }

    public void agregarMateria(Materia materia) throws SQLException {
        String sql = "INSERT INTO materias (nombre, correlativas) VALUES (?, ?)";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, materia.getNombre());
        statement.setString(2, String.join(",", materia.getCorrelativas()));


    }
}
