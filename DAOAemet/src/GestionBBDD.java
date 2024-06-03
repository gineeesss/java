import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class GestionBBDD {
    private static Statement st;
    private static PreparedStatement prepst;
    private static Connection conexion;
    private static String sql;
    private static ResultSet rs;

    static void abrirConexion(){
        try {
            conexion = DriverManager.getConnection("jdbc:mariadb://192.168.56.102:3306/Aemet?user=alumno&password=alumno");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void cerrarConexion(){
        if (conexion!=null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    static void crearTabla(){
        try{
            sql = "create table badajoz2023(fecha varchar(10) primary key,prec decimal(5,3),tmed decimal(5,3),tmin decimal(5,3),tmax decimal(5,3),velmedia decimal(5,3),racha decimal(5,3))";
            st  = conexion.createStatement();
            st.executeQuery(sql);
        }catch (SQLException ex){
            ex = new SQLException("Tabla ya creada\n");
            System.out.println(ex.getMessage());
        }
    }
    static void grabarDatos(){
        GestionFichero.leerFichero();
        try{
            List<String[]> lista = new ArrayList<>(GestionFichero.datos.values());
            for (String[] a: lista) {
                sql="insert into badajoz2023 values (?,?,?,?,?,?,?)";
                prepst = conexion.prepareStatement(sql);
                prepst.setString(1,a[0]);
                prepst.setFloat(2,Float.parseFloat(a[1]));
                prepst.setFloat(3,Float.parseFloat(a[2]));
                prepst.setFloat(4,Float.parseFloat(a[3]));
                prepst.setFloat(5,Float.parseFloat(a[4]));
                prepst.setFloat(6,Float.parseFloat(a[5]));
                prepst.setFloat(7,Float.parseFloat(a[6]));
                prepst.executeUpdate();
            }
            /*
            String[] linea;
            for (String a:GestionFichero.datos.keySet()) {
                linea = GestionFichero.datos.get(a);
                sql="insert into badajoz2023 values (?,?,?,?,?,?,?)";
                prepst = conexion.prepareStatement(sql);
                prepst.setString(1,linea[0]);
                prepst.setFloat(2,Float.parseFloat(linea[1]));
                prepst.setFloat(3,Float.parseFloat(linea[2]));
                prepst.setFloat(4,Float.parseFloat(linea[3]));
                prepst.setFloat(5,Float.parseFloat(linea[4]));
                prepst.setFloat(6,Float.parseFloat(linea[5]));
                prepst.setFloat(7,Float.parseFloat(linea[6]));
                prepst.executeUpdate();
            }*/
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    static void diaFrio(){
        try {
            sql="select fecha,tmin from badajoz2023 order by tmin ASC limit 1";
            rs= st.executeQuery(sql);
            if (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getFloat(2)+"ºC");
            }
            sql="select fecha,tmax from badajoz2023 order by tmax DESC limit 1";
            rs= st.executeQuery(sql);
            if (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getFloat(2)+"ºC");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void diaLluviosox(){
        try {
            sql="select fecha, prec from badajoz2023 order by prec DESC limit 1";
            rs= st.executeQuery(sql);
            if (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getFloat(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void diaVentoso(){
        try {
            sql="select fecha, racha from badajoz2023 order by racha DESC limit 1";
            rs= st.executeQuery(sql);
            if (rs.next()) {
                System.out.printf("%s %.2f m/s",rs.getString(1),(rs.getFloat(2)*3.6));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
