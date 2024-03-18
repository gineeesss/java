public class Principal {
    public static void main(String[] args) {
        Movil[] moviles = new Movil[3];

        moviles[0]= new Movil("607654835",0.25f);
        moviles[1]= new Movil("686309000",0.50f);
        moviles[2]= new Movil("611222333",0.45f);

        moviles[0].llamar(moviles[1],320);
        moviles[0].llamar(moviles[2],200);
        moviles[1].llamar(moviles[2],550);

        for (Movil i:moviles){
            i.mostrarDatos();
        }
    }
}
