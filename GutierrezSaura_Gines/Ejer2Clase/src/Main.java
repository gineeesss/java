import  moviles.Movil;
public class Main {
    public static void main(String[] args) {
        Movil[] moviles = new Movil[3];
        moviles[0] = new Movil(00,1f);
        moviles[1] = new Movil(11,1f);
        moviles[2] = new Movil(22,1f);

        moviles[0].llamar(moviles[1],320);
        moviles[0].llamar(moviles[2],200);
        moviles[1].llamar(moviles[2],550);
        for (Movil a: moviles) {
            a.mostrarDatos();
        }

    }
}
