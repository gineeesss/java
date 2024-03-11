public class Main {
    public static void main(String[] args) {
        Planeta objeto1 = new Planeta(15,34);
        Tierra objeto2 = new Planeta(10,1);

        System.out.println("La fuerza es: " + objeto1.fuerza());
        System.out.println("La fuerza es: " + objeto1.velocidad());
        System.out.println("La fuerza 2 es: "+ objeto2.fuerza());
        System.out.println("La velociad 2 es: "+((Planeta) objeto2).velocidad());
        System.out.println(objeto2.metodoConCodigo());
        System.out.println(objeto1.metodoConCodigo());
    }

}
