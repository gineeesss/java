import java.sql.*;

public abstract class GestionBBDD {
    static Statement st;
    static PreparedStatement prepst;
    static Connection conexion;
    static String sql;
    static ResultSet rs;

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
        GestionFichero.aver();
        try{
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
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    static void diaFrio(){
        try {
            sql="select fecha from badajoz2023 order by tmin ASC limit 1";
            rs= st.executeQuery(sql);
            System.out.println(rs.getString(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void diaLluviosox(){
        sql="select fecha from badajoz2023 order by prec DESC limit 1";

    }
    static void diaVentoso(){
        sql="select fecha from badajoz2023 order by racha DESC limit 1";

    }
}
