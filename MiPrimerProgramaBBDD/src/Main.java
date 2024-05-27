import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion,filas;
        String sql,pass,equipo;
        Connection conexion = null;
        try{
            System.out.println("Contraseña: ");
            //pass=scr.nextLine();
            pass = "alumno";
            String url ="jdbc:mariadb://192.168.56.102:3306/nba?user=alumno&password="+pass;
            conexion = DriverManager.getConnection(url);
            Statement st = conexion.createStatement();
            ResultSet rs= null;
            PreparedStatement prepst = null;
            do {
                menu();
                opcion = scr.nextInt();
                switch (opcion){
                    case 1:
                        sql="select count(nombre) from equipos where conferencia='West'";
                         rs = st.executeQuery(sql);
                        if(rs.next() ) System.out.println("EL número de equipos en la Conferencia Oeste es: "+rs.getString(1));
                        break;
                    case 2:
                        sql="update jugadores set nombre_equipo='Lakers' where nombre='LeBron James'";
                        if (st.executeUpdate(sql) !=0) System.out.println("Update sejecutado correctaente.");
                        break;
                    case 3:
                        sql="select nombre,procedencia from jugadores where nombre_equipo='Lakers'";
                        rs = st.executeQuery(sql);
                        System.out.printf("%-20s\t%20s \n","Nombre","Procedencia");
                        while(rs.next()){
                            System.out.printf("%-20s\t%20s\n",rs.getString(1),rs.getString(2));
                        }
                        break;
                    case 4:
                        sql="select ciudad from equipos where nombre=?";
                        prepst=conexion.prepareStatement(sql);
                        System.out.println("Nombre del eqipo: ");
                        prepst.setString(1,scr.next());
                        rs = prepst.executeQuery();
                        if (rs.next()) System.out.println("La ciudad donde juega el equipo es: "+rs.getString("ciudad"));
                        else System.out.println("Ese equipo no existe");
                        break;
                }
            }while (opcion!=0);
            if (rs != null) rs.close();
            if (prepst != null) prepst.close();
            conexion.close();
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