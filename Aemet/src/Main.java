import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static Scanner ceeseuve,scr;
    static PrintWriter log;
    //static List<Registro> registros;
    static Map<Fecha,Registro> aemet;
    static String linea;
    static String[] celdas;

    static final String[] NOMBREMESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static void main(String[] args) {
        try {
            log = new PrintWriter(new FileWriter("log.txt",true));
            ceeseuve = new Scanner( new File("Aemet_Badajoz_2023.csv"));
            aemet = new HashMap<>();
            //registros = new ArrayList<>();
            if (ceeseuve.hasNextLine()){
                ceeseuve.nextLine();
            }
            while (ceeseuve.hasNextLine()) {
                linea = ceeseuve.nextLine();
                celdas = linea.split(";");
                aemet.put((new Registro(celdas).fecha), new Registro(celdas));
                //registros.add(new Registro(celdas));
                //System.out.print(celdas[0]);System.out.print(celdas[1]);System.out.print(celdas[2]);System.out.print(celdas[3]);System.out.println();
            }
        } catch (IOException e) {
            Date date = new Date();
            log.print(date);
            log.println(e.getMessage());
        }finally {
            if (log!=null) log.close();
            if (ceeseuve!=null) ceeseuve.close();
        }
        scr = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion=scr.nextInt();
            switch (opcion){
                case 1:
                    temperaturaMedia(scr.nextInt());
                    break;
                case 2:
                    diasExtremos();
                    break;
                case 3:
                    totalPrecipitacionMes(scr.nextInt());
                    break;
                case 4:
                    diaMasLLuvioso();
                    break;
                case 5:
                    diaMasViento();
                    break;
            }
        }while (opcion!=0);
    }
    static void temperaturaMedia(int mes){
        //List<Registro> mesLista = new ArrayList<>();
        float totalTemperatura=0;
        int dias=0;
        for (Registro a: aemet.values()) {
            if (a.fecha.mes == mes) {
                totalTemperatura += a.tmed;
                dias++;
            }
        }
        System.out.println("La temperatura media de "+NOMBREMESES[mes-1]+" es: "+(totalTemperatura/dias));
    }
    static void diasExtremos (){
        List<Registro> listaTemExtremas = new ArrayList<>(aemet.values());
        Collections.sort(listaTemExtremas,new CompararTmax());
        System.out.println("El día con la temperatura más calida fue el "+listaTemExtremas.get(0).fecha+" con "+listaTemExtremas.get(0).tmax+"º C.");
        Collections.sort(listaTemExtremas,new CompararTmin());
        System.out.println("El día con la temperatura más fría fue el "+listaTemExtremas.get(0).fecha+" con "+listaTemExtremas.get(0).tmin+"º C.");
    }
    static void totalPrecipitacionMes(int mes) {
        float totalPrecipitaciones = 0;
        int dias = 0;
        for (Registro a : aemet.values()) {
            if (a.fecha.mes == mes) {
                totalPrecipitaciones += a.prec;
                dias++;
            }
        }
        System.out.println("La precipitación acumulada del mes "+NOMBREMESES[mes-1]+" fueron: "+totalPrecipitaciones+"l/m2");
    }
    static void diaMasLLuvioso(){
        List<Registro> listaLluviaOrdenada = new ArrayList<>(aemet.values());
        Collections.sort(listaLluviaOrdenada,new CompararLluvia());
        System.out.println("El día más lluvioso del año fue el: "+listaLluviaOrdenada.get(0).fecha+" con "+listaLluviaOrdenada.get(0).prec+"l/m2");
    }
    static void diaMasViento(){
        List<Registro> listaViento = new ArrayList<>(aemet.values());
        Collections.sort(listaViento,new CompararViento());
        System.out.println("El día en el que hizo una mayor racha de fecha en todo el año fue el día "+ listaViento.get(0).fecha +" con una velocidad máxima de "+((listaViento.get(0).racha)*3.6)+"km/h");
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
}