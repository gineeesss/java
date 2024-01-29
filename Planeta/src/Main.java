import com.sun.security.jgss.GSSUtil;
import planeta.PlanetCorreccion;
import planeta.Planeta;

public class Main {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra",1,5.9736E12,1.08321E12, 12742, 149597870);
        System.out.println(tierra);

        Planeta jupiter = new Planeta("Júpiter", 95,1.899E27,1.4313E15,142984,778412026);
        System.out.println(jupiter);

        PlanetCorreccion tier = new PlanetCorreccion("Tierra",1,5.9736E12,1.08321E12, 12742, 149597870);
        System.out.println("Los datos del planeta son:\n" +tier);
        System.out.println("La densidad es=" +tier.calcularDensidad());
        System.out.println("¿Es exterior?" + String.format("%.3e",tier.calcularDensidad()));

        PlanetCorreccion jup = new PlanetCorreccion("Júpiter", 95,1.899E27,1.4313E15,142984,778412026);
        System.out.println("Los datos del planeta son:\n" + jup);
        System.out.printf("La densidad es= %.3e\n", jup.calcularDensidad());
        System.out.println("¿Es exterior?" + jup.esExterior());
    }
}