import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionBBDD.abrirConexion();
        GestionBBDD.crearTabla();
        GestionBBDD.grabarDatos();
        Scanner scr = new Scanner(System.in);
        int opcion;
        do{
            opcion= scr.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Los días que se alcanzó la mayor y menor temperatura fueron: ");
                    GestionBBDD.diaFrio();
                    break;
                case 2:
                    System.out.println("Los días que se alcanzó la mayor y menor temperatura fueron: ");
                    break;
                case 3:
                    System.out.println("Los días que se alcanzó la mayor y menor temperatura fueron: ");
                    break;
            }
        }while (opcion!=0);
        GestionBBDD.cerrarConexion();
    }
}
