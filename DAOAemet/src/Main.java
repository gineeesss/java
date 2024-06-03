import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionBBDD.abrirConexion();
        GestionBBDD.crearTabla();
        GestionBBDD.grabarDatos();
        Scanner scr = new Scanner(System.in);
        int opcion;
        do{
            menu();
            opcion= scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Los días que se alcanzó la mayor y menor temperatura fueron: ");
                    GestionBBDD.diaFrio();
                    break;
                case 2:
                    System.out.println("El día que se alcanzó la mayor mayor precipitación fue: ");
                    GestionBBDD.diaLluviosox();
                    break;
                case 3:
                    System.out.println("El día que se alcanzó la racha de viento más fuerte fue: ");
                    GestionBBDD.diaVentoso();
                    break;
            }
        }while (opcion!=0);
        GestionBBDD.cerrarConexion();
    }
    public static void menu(){
        System.out.println("""
                \n
                [1] Día más calido y frío
                [2] Día con más precipitaciones
                [3] Dïa con mayor racha de viento (m/s)
                """);
    }
}
