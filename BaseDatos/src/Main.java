import java.sql.*;

public class Main {
    //TIPO_DATP nombre variable = valor;

    public static void main(String[] args) {

        {
           try {
               int filas;
               String user="alumno",password="alumno";
               String sql;
               String url ="jdbc:mariadb://192.168.56.102:3306/jardineria?user=alumno&password=alumno";
               Connection conexion = DriverManager.getConnection(url);
               Statement sentencia= conexion.createStatement();
               //filas = sentencia.executeUpdate("SQL DELETE");
               sql = "SELECT codigocliente,nombrecliente,nombrecontacto FROM Clientes WHERE ciudad='Madrid'";
               ResultSet resultado = sentencia.executeQuery(sql);
               System.out.println("Codigo Cliente"+"\t"+"Nombrecliente"+"\t"+"NombreContacto");
               while (resultado.next()){
                   System.out.println(resultado.getInt("codigocliente")+"\t"+resultado.getString("nombrecliente")+"\t"+resultado.getString(3));
               }


           } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
