package ejercicio;

public class Restaurante {
    // PROPIEDADES
    private String nombre="";
    private int numMesa=0, tamMesa=0;
    private int[] ocupacion;

    //METODOS

    /* Este es el constructor. Hemos tenido que adaptarlo porque ahora queremos gestionar
    varios restaurantes, y para que sean diferentes pues tienen que tener propiedades diferentes
    El nombre, el número de mesas que tienen el restaurante y el tamaño máximo de cada mesa
    dependen del restaurante que se elija, por lo que el programa principal me lo tienen que pasar
    por parámetro para poder darle valores a las respectivas propiedades.
    La única propiedad que no necesito pasar por parámetro es la ocupación de las mesas, ya que
    el enunciado dice que sea con números aleatorios
     */
    public Restaurante(String nombre, int numMesa, int tam){
        this.nombre=nombre;
        this.numMesa=numMesa;
        /* CUIDADO!!! Vemos que hemos tenido que inicializar el array aquí y no en el apartado
        de propiedades, ya que necesitamos saber el número de mesas del restaurante para poder
        darle el tamaño correcto al array, y eso no lo sabemos hasta que me lo dicen a través del
        constructor
         */
        ocupacion = new int[numMesa];
        this.tamMesa=tam;
        for (int i=0;i<ocupacion.length;i++) {
            this.ocupacion[i] = (int) (Math.random() * (tam+1));
        }
    }

    /* Este método es para mostrar cuánta gente hay sentada en cada mesa. No necesitamos
    parámetros de entrada porque en la propia clase tenemos toda la información. Y tampoco necesitamos
    devolver ningún parámetro ya que mostramos la información directamente dentro del método
     */
    public void MostrarOcupacion(){
        System.out.println("La ocupación del restaurante "+this.nombre+ " es:");
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
        if (clientes<=this.tamMesa) {
            for (int i=0;i< ocupacion.length;i++){
                if (ocupacion[i]==0) {
                    ocupacion[i] = clientes;
                    System.out.println("Pueden sentarse en la mesa " + (i + 1));
                    return true;
                }
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
        if (clientes<=this.tamMesa) {
            for (int i=0;i< ocupacion.length;i++) {
                if (clientes + ocupacion[i] <= this.tamMesa) {
                    ocupacion[i] += clientes;
                    System.out.println("Pueden sentarse en la mesa " + (i + 1));
                    return true;
                }
            }
        }
        return false;
    }

}
