import java.sql.*;
import java.util.Scanner;

public class Tercero {
    public static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        String url ="jdbc:mariadb://192.168.56.102:3306/jardineria?user=alumno&password=alumno";
        try {
            int filas;
            String sql;
            Connection conextion = DriverManager.getConnection(url);
            Statement sentencia = conextion.createStatement();
            /*sql = "create table if not exists Prueba(id int unsigned primary key, nombre varchar(20))";
            filas = sentencia.executeUpdate(sql);
            System.out.println("Han sido afectadas: "+filas+" filas en el create table.");
            sql= "insert into Prueba values (1, 'Gines'),(2,'Paquirrin')";
            filas = sentencia.executeUpdate(sql);
            System.out.println("Han sido afectadas: "+filas+" filas en el insert.");
            sql= "update Prueba set nombre='Almudena' where id=2";
            filas = sentencia.executeUpdate(sql);
            System.out.println("Han sido afectadas: "+filas+" filas en el update.");*/


            sql="update Prueba set nombre='CJ' where nombre=?";
            PreparedStatement sentenciaDos = conextion.prepareStatement(sql);
            String entrada;
            entrada = scr.nextLine();
            sentenciaDos.setString(1,entrada);
            filas = sentenciaDos.executeUpdate();
            System.out.println("Han sido afectadas: "+filas+" filas en el update.");



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
