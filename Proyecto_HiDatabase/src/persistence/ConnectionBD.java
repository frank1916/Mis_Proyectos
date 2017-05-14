package persistence;

import java.sql.*;

/**
 *
 * @author franciscodavid
 */
public final class ConnectionBD {

    private Connection conn;

    public ConnectionBD() {
        this.conn = conection();
    }

    /**
     * Conexion directa con la BD.
     *
     * @return
     */
    public Connection conection() {
        try {
            //cargar el driver..
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Hi_Database", "root", "");
            System.out.println("conexion_Establecida");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("error11" + " " + ex);

        }
        return conn;
    }

    /**
     * permite identificar usuarios existentes en la BD.
     *
     * @param name
     * @param password
     * @return
     */
    public boolean identifyUser(String name, char[] password) {

        try {
            Statement instruction = conn.createStatement();
            ResultSet resultadoConsulta = instruction.executeQuery("SELECT * FROM usuarios WHERE nombreUsuario='" + name + "'"
                    + "AND pass ='" + password + "'");
            if (resultadoConsulta.first()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.err.println("error22" + " " + ex);

        }
        return false;
    }

    /**
     * Permite crear un usuario en la BD.
     *
     * @param name
     */
    public void createUser(String name) {

        String insert = "INSERT INTO usuarios(nombreUsuario,contraseña)VALUES (?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(insert);
            pst.setString(1, name);
            int n = pst.executeUpdate();
            if (n > 0) {
                System.out.println("se agrego correctamente");
            } else {
                System.err.println("noo se pudo agregar usuario");
            }
        } catch (Exception e) {
            System.err.println("error33 " + " " + e);
        }
    }

}
