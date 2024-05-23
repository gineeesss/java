import javax.management.loading.MLetContent;
import java.io.*;
import java.util.*;

public class Main {
    private static Scanner scr = new Scanner(System.in);
    private static Map<String, Tiempo> datos;
    private static List<Tiempo> orden;
    private static PrintWriter log;
    public static void main(String[] args) {
        int opcion;
        try {
            log = new PrintWriter(new FileWriter("log.txt"));
            do {
                leerFichero();
                orden = new ArrayList<>(datos.values());
                menu();
                opcion= scr.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Dime de qué mes quieres la temperatura media (Del 1 al 12):");
                        int mes = scr.nextInt();
                        if (mes<0 || mes>13) System.out.println(nomremes(mes)+" Introducir un numero entre el 1 y 12");
                        else System.out.println("La temperatura media del mes "+nomremes(mes)+"fue: "+temperaturamedia(mes)+" ºC");
                        break;
                    case 2:
                        orden.sort(new OrdenTmax());
                        System.out.printf("El día más caluroso del año fue %s que hizo %.1f ºC",orden.get(orden.size()-1).getFecha(),orden.get(orden.size()-1).getTmax());
                        orden.sort(new OrdenTmin());
                        System.out.printf("El día más caluroso del año fue %s que hizo %.1f ºC",orden.get(0).getFecha(),orden.get(0).getTmax());
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 0:
                        break;
                }
            } while(opcion!=0);
        }catch (IOException | InputMismatchException ex){
            Date fecha = new Date();
            log.print(fecha);
            log.println(ex.getMessage());
            ex.printStackTrace(log);
            log.flush();
        }finally {
            if (log!=null) log.close();
        }
    }
    static void menu() {
        System.out.println("""
               [1] Temperatura media en ºC de un mes:
               [2] Mayor y Menor temperatura del año
               [3] Precipitación acumulada en l/m2 en un mes:
               [4] Día más lluvioso del año
               [5] Día con mayor racha de viento del año 
                """);
    }
    private  static String nomremes(int mes){
        switch (mes){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Error";
        }
    }
    private static void leerFichero () throws IOException {
        String[] lectura;
        datos = new HashMap<>();
        Scanner fichero = new Scanner(new File("Aemet_Badajoz_2023.csv"));
        fichero.nextLine();
        while (fichero.hasNext()){
            lectura=fichero.nextLine().split(";");
            datos.putIfAbsent(lectura[0],new Tiempo(lectura[0],Float.parseFloat(lectura[1]),Float.parseFloat(lectura[2]),Float.parseFloat(lectura[3]),Float.parseFloat(lectura[4]),Float.parseFloat(lectura[5]),Float.parseFloat(lectura[6])));
        }
    }
    private static float temperaturamedia(int mes){
        int dias = 0;
        float media=0f;
        for (String a:datos.keySet()) {
            if (Integer.parseInt(a.split("/")[1])==mes) {
                media+= datos.get(a).getTmed();
                dias ++;
            }
        }
        return media/dias;
    }
    private static float totallluviasmes(int mes){
        int dias = 0;
        float lluvia=0f;
        for (String a:datos.keySet()) {
            if (Integer.parseInt(a.split("/")[1])==mes) {
                lluvia+= datos.get(a).getPrec();
            }
        }
        return lluvia;
    }}
