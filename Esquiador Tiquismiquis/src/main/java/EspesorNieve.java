import java.util.Scanner;

public class EspesorNieve {
    public static String cota(String input) {
        int espesorQuerido, espesor=0, crecimiento, disminucion,dias=0;
        Scanner scr=new Scanner(System.in);

        String[] tokens=input.split(" ");
        espesorQuerido=Integer.valueOf(tokens[0]);
        crecimiento=Integer.valueOf(tokens[1]);
        disminucion=Integer.valueOf(tokens[2]);


        while(espesorQuerido!=0 && crecimiento!=0 && disminucion!=0) {
            if (crecimiento > disminucion) {
                dias = espesorQuerido / (crecimiento - disminucion);
                return String.valueOf(dias);
            } else if(crecimiento>espesorQuerido){
                return "1";
            }else{
                return "Esta temporada te quedas viendo Netflix";
            }
        }
        return "";

    }
}
