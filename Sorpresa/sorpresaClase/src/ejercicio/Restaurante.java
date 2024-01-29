package ejercicio;

public class Restaurante {
    //properties
    private  int numMesas,tamMesa;
    private String nombre;
    private int[] ocupacion;

    //methods

    public Restaurante(String nombre, int numMesas, int tamMesa) {
        this.nombre = nombre;
        this.numMesas=numMesas;
        this.tamMesa= tamMesa;
        ocupacion = new int[this.numMesas];   // IMPORTANTE -dimensionar array en el constructor
        for (int i = 0; i < ocupacion.length; i++) {
            this.ocupacion[i] = (int)(Math.random()*tamMesa+0);
        }
    }
    public void MostrarOcupacion(){
        System.out.println("["+this.nombre+"]");
        System.out.print("Mesa nº|\t ");
        for (int i=0;i< ocupacion.length;i++){
            System.out.print(i+1 +"\t");
        }
        // System.out.println("\n_____________________________________________________");
        System.out.print("\nOcup nº|\t ");
        for (int i=0;i< ocupacion.length;i++){
            System.out.print(ocupacion[i]+"\t");
        }
    }

    public boolean BuscarVacias(int clientes){
        if (clientes>this.tamMesa){
            System.out.println("Lo siento, no tenemos mesas para tantas personas.");
            return false;
        }else
            for (int i= 0;i<ocupacion.length;i++){
                if (clientes+ocupacion[i]<=this.tamMesa){
                    ocupacion[i]=clientes;
                    System.out.println("Pueden sentarse en la mesa"+(i+1));
                    return true;
                }
            }
        return false;
    }
    /*public boolean BuscarSitio(int clientes){
        if (clientes<=this.tamMesa){

        }
    }*/
}
