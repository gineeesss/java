import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Introduce un caso");
            respuesta = scr.nextLine();
            System.out.println(EspesorNieve.cota(respuesta));
        }while(!respuesta.equals("0 0 0"));

    }
}