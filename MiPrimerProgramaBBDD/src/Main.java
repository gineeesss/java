import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion,filas;
        String sql;
        String url ="jdbc:mariadb://192.168.56.102:3306/nba?user=alumno&password=alumno";
        try{
            Connection conexion = DriverManager.getConnection(url);
            Statement sentencia = conexion.createStatement();
            do {
                menu();
                opcion = scr.nextInt();
                switch (opcion){
                    case 1:
                        sql="select count(*) from equipos where conferencia='West'";
                        filas = sentencia.executeUpdate(sql);
                        System.out.println("EL número de equipos en la Conferencia Oeste es: "+filas);
                        break;
                    case 2:
                        sql="update jugadores set equipo='Lakers' where nombre='LeBron James'";

                        break;
                    case 3:
                        sql="select * from jugadores where equipo='Lakers'";
                        ResultSet salida = sentencia.executeQuery(sql);
                        while(salida.next()){
                            System.out.println(salida.getInt(1)+"\t"+salida.getInt(2));
                        }
                        break;
                    case 4:
                        sql="selet ciudad from equipos where nombrre=?";
                        break;
                }
            }while (opcion!=0);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void menu(){
        System.out.println("""
               [1] ¿Cuántos equipos componen la conferencia Oeste?
               [2] Traspasar al jugador Lebron James al equipo de "Los Ángeles Lakers"
               [3] Mostrar por pantalla la plantilla actual de "Los Ángeles Lakers"
               [4] Mostrar por pantalla la ciudad donde juega un equipo:
                """);
    }
}
// en la colacion configurar exclusivamente la conexion remota o la otra, tambien se puede poner como global y ya está