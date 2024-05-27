import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sql = "select codigocliente, sum(cantidad) from pagos group by codigocliente";
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection("jdbc:mariadb://192.168.56.102:3306/jardineria?user=alumno&password=alumno");
            Statement st  = conexion.createStatement();
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            Map<Integer,Float> pagos = new HashMap<>();
            while (rs.next()){
                pagos.putIfAbsent(rs.getInt(1),rs.getFloat(2));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        sql = "alter table  Clientes ";
    }
}
