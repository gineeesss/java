import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainSeguro {
    public static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        String sql,user,password;
        String url ="jdbc:mariadb://192.168.56.102:3306/jardineria?user=alumno&password=alumno";
        Connection conexion = null;
        try {
            sql="select nombrecontacto from Clientes where nombrecontacto=? and apellidocontacto=?";
            conexion = DriverManager.getConnection(url);
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            user = scr.nextLine();
            password = scr.nextLine();
            sentencia.setString(1,user);
            sentencia.setString(2,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
