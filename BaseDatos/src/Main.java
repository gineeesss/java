import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;
import java.util.Scanner;

public class Main {
    //TIPO_DATP nombre variable = valor;
public static Scanner scr =new Scanner(System.in);
    public static void main(String[] args) {

        {
           try {
               int filas;
               String user="alumno",password="alumno",ciudad;
               String sql;
               String url ="jdbc:mariadb://192.168.56.102:3306/jardineria?user=alumno&password=alumno";
               Connection conexion = DriverManager.getConnection(url);
               Statement sentencia= conexion.createStatement();
               System.out.println("Dime de que ciudad quieres los clientes: ");
               //ciudad=scr.nextLine();
               user=scr.nextLine();
               password=scr.nextLine();
               //filas = sentencia.executeUpdate("SQL DELETE");
               //sql = "SELECT codigocliente,nombrecliente,nombrecontacto FROM Clientes WHERE ciudad='Madrid'";
               //sql = "SELECT codigocliente,nombrecliente,nombrecontacto FROM Clientes WHERE ciudad='"+ciudad+"'";
               sql = "SELECT nombrecliente FROM Clientes WHERE nombrecontacto='"+user+"' and apellidocontacto='"+ password+"'";
               ResultSet resultado = sentencia.executeQuery(sql);
               //System.out.println("Codigo Cliente"+"\t"+"Nombrecliente"+"\t"+"NombreContacto");

               if (resultado.next()) System.out.println("usuario correcto");
               else System.out.println("Usuario/contraseña incorretos");
               while (resultado.next()){
                   System.out.println(resultado.getInt("codigocliente")+"\t"+resultado.getString("nombrecliente")+"\t"+resultado.getString(3));
               }


           } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
