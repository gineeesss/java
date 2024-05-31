import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Float> pagos=null;
        String sql = "select p.CodigoCliente, sum(d.Cantidad * d.PrecioUnidad) from DetallePedidos d NATURAL JOIN Pedidos p group by p.CodigoCliente";
        Connection conexion = null;
        Statement st= null;
        ResultSet rs = null;
        try{
            conexion = DriverManager.getConnection("jdbc:mariadb://192.168.56.102:3306/jardineria?user=alumno&password=alumno");
            st  = conexion.createStatement();
            rs = st.executeQuery(sql);
            pagos = new HashMap<>();
            /**
             * Lee la consulta y la guarda en un mapa
             * */
            while (rs.next()){
                pagos.putIfAbsent(rs.getInt(1),rs.getFloat(2));
            }
            try{
                sql = "alter table  Clientes add column TipoCliente varchar(25)";
                st.executeQuery(sql);
            }catch (SQLException ex){
                ex = new SQLException("Columna ya existente\n");
                System.out.println(ex.getMessage());
            }
            /**
             * Bucle para recorrer el map (tiene la consulta)
             */
            PreparedStatement prepst = null;
            for (Integer a: pagos.keySet()) {
                Float cantidad  = pagos.get(a);
                System.out.println("Codigo: "+a+" Cantidad: "+cantidad);
                try{
                    if (cantidad > 50000f) {
                        sql = "update Clientes set TipoCliente = 'VIP' where CodigoCliente=?";
                        prepst = conexion.prepareStatement(sql);
                        prepst.setInt(1,a);
                        prepst.executeUpdate();
                        System.out.println("cliente vip");
                    }
                    if (cantidad >=  10000f && cantidad <50000) {
                        sql = "update Clientes set TipoCliente = 'Excelente' where CodigoCliente=?";
                        prepst = conexion.prepareStatement(sql);
                        prepst.setInt(1,a);
                        prepst.executeUpdate();
                        System.out.println("exc");
                    }
                    if (cantidad >= 5000f && cantidad <10000 ) {
                        sql = "update Clientes set TipoCliente = 'Muy Bueno' where CodigoCliente=?";
                        prepst = conexion.prepareStatement(sql);
                        prepst.setInt(1,a);
                        prepst.executeUpdate();
                        System.out.println("cliente m buen");
                    }
                    if(cantidad <5000){
                        sql = "update Clientes set TipoCliente = 'Normal' where CodigoCliente=?";
                        prepst = conexion.prepareStatement(sql);
                        prepst.setInt(1,a);
                        prepst.executeUpdate();
                        System.out.println("cliente norrmal");
                    }
                }catch (SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }catch (SQLException ex){
            ex= new SQLException("Error en la conexión");
            System.out.println(ex.getMessage());
        }
    }
}
