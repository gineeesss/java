import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Set<Integer>> cartones = new ArrayList<>(3);
        Set<Integer> carton;
        int jugadores =3, tamCarton=5;
        for (int j=0;j<jugadores;j++){
            carton= new HashSet<>(tamCarton);
            cartones.add(carton);
            // cartones.add(Set.copyOf(carton)); // para hacer una copia del valor del objeto
            int i=0;
            while (i<tamCarton){
                if (carton.add((int)(Math.random()*20+1))) i++;
            }
        }

        for (int i=0;i<jugadores;i++){
            System.out.print("Carton nº"+(i+1)+": ");
            System.out.print(cartones.get(i));
            carton =cartones.get(i);

            //System.out.println(carton.toArray());
            System.out.println();
        }/*
        for (int i = 0; i<jugadores;i++){
            cartones.add(new HashSet<>(tamCarton));
            int j = 0;
            while (cartones.get(i).size()!=tamCarton){
                cartones.get(j).add(numAleatorio());
            }
            System.out.print("Carton nº"+(i+1)+": ");
            System.out.print(cartones.get(i));
            System.out.println();
        }*/
        Set<Integer> bombo = new HashSet<>(20);
        int j = 0;
        System.out.println();
        boolean ganador = false;
        while(!ganador){
            int numero = numAleatorio();
            if(bombo.add(numero)){
                System.out.print("("+numero+") ");
                // System.out.println(bombo);
                //System.out.println();
                for(Set a: cartones){
                    if (bombo.containsAll(a) && bombo.size()>=tamCarton){
                        System.out.println();
                        System.out.println("\nGanador carton: "+(cartones.indexOf(a)+1));
                        ganador=true;
                    }
                }
                j++;
            }
        }
        System.out.println(bombo);
    }
    public static int numAleatorio(){
        return (int)(Math.random()*20+1);
    }
}
