package ejercicio;

public class Restaurante {
    // PROPIEDADES
    private int[] ocupacion = new int[10];

    //METODOS

    /* Este es el constructor. Como sólo tenemos de propiedad el número de personas sentadas en cada mesa
    no necesitamos ningún parámetro, ya que el enunciado nos dice que la ocupación la hagamos con números aleatorios
     */
    public Restaurante(){
        for (int i=0;i<ocupacion.length;i++) {
            this.ocupacion[i] = (int) (Math.random() * 5);
        }
    }

    /* Este método es para mostrar cuánta gente hay sentada en cada mesa. No necesitamos
    parámetros de entrada porque en la propia clase tenemos toda la información. Y tampoco necesitamos
    devolver ningún parámetro ya que mostramos la información directamente dentro del método
     */
    public void MostrarOcupacion(){
        System.out.printf("%9s\t","Mesa nº");
        for (int i=0;i< ocupacion.length;i++){
            System.out.print(i+1+"\t");
        }
        System.out.print("\nOcupacion\t");
        for (int i=0;i< ocupacion.length;i++){
            System.out.print(ocupacion[i]+"\t");
        }
        System.out.println();
        return;
    }

    /* Este método es para buscar mesas vacías (ocupación=0) donde sentar a la gente. Para ello necesitamos
    que nos digan a cuantas personas hay que intentar sentar, por eso necesitamos un parámetro de clientes.
    Luego necesitamos devolver al programa principal si hemos encontrado sitio o no, por eso el valor de
    retorno es booleano
     */
    public boolean BuscarVacias(int clientes){
        for (int i=0;i< ocupacion.length;i++){
            if (ocupacion[i]==0){
                ocupacion[i]=clientes;
                System.out.println("Pueden sentarse en la mesa "+(i+1));
                return true;
            }
        }
        return false;
    }

    /* Este método es para buscar sitio en mesas que ya tienen gente sentada (ocupación!=0).
    Para ello necesitamos que nos digan a cuantas personas hay que intentar sentar, por eso necesitamos un parámetro de clientes.
    Luego necesitamos devolver al programa principal si hemos encontrado sitio o no, por eso el valor de
    retorno es booleano
     */
    public boolean BuscarSitio(int clientes){
        for (int i=0;i< ocupacion.length;i++){
            if (clientes+ocupacion[i]<=4) {
                ocupacion[i] += clientes;
                System.out.println("Pueden sentarse en la mesa " + (i + 1));
                return true;
            }
        }
        return false;
    }

}
