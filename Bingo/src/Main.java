import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Set<Integer>> cartones = new ArrayList<>(3);
        Set<Integer> carton;
        for (int j=0;j<3;j++){
            carton= new HashSet<>(5);
            cartones.add(carton);
            int i=0;
            while (i<5){
                if (carton.add((int)(Math.random()*20+1))) i++;
            }
        }

        //System.out.println(cartones);
        for (int i=0;i<3;i++){
            System.out.print("Carton nº"+(i+1)+": ");
            System.out.print(cartones.get(i));
            carton =cartones.get(i);
            System.out.println(carton.toArray());
            System.out.println();
        }
    }
}
