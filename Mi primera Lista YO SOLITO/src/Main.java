import java.util.*;

public class Main {
    public static Scanner scr = new Scanner(System.in);// No es necesario  usar el delimitador ya que solo se coge una palabra, por lo que es más correcto lipiar el buffer.useDelimiter("\\n");
    public static void main(String[] args) {
        List<String> palabras = new ArrayListe<>(10);
        Iterator<String> iterator;
        int opcion=-1;
        do {
            menu2();
            try{
                opcion = scr.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce Palabra: ");
                    //String palabra=scr.next().toLowerCase();
                    //char primeraLetra = Character.toUpperCase(palabra.charAt(0));
                    //palabra = primeraLetra + palabra.substring(1);
                    //palabras.add(palabra);
                    palabras.add(capitalPalabra(scr.next()));
                    scr.nextLine();

                    break;
                case 2:
                    mostrar(palabras);
                    break;
                case 3:
                    System.out.println("Inserte Palabra a eliminar: ");
                    String borar = capitalPalabra(scr.next());
                    scr.nextLine();
                    if (palabras.remove(borar)) System.out.println("La palabra: "+ borar);else System.out.println("No se eliminó ninguna palabra.");;
                    /*iterator=palabras.iterator();
                    String borar = capitalPalabra(scr.next());
                    scr.nextLine();
                    //borar.toUpperCase().charAt(2);
                    while(iterator.hasNext()){
                        if (iterator.next().equals(borar)){
                            iterator.remove();
                            System.out.println("Se borró la palabra: "+borar);;
                        }
                    }*/
                    break;
                case 4:
                    List<String> palabrasOrdenadas = new ArrayList<>(palabras);
                    Collections.sort(palabrasOrdenadas);
                    mostrar(palabrasOrdenadas);
                    break;
                case 5:
                    int sizemax = 0; //realmente no hace falta guardar el numero, ya que lo tiene a.leth, y guardo a
                    String palabraMasLetra="";
                    for (String a: palabras) {
                        if (a.length()>=sizemax){
                            sizemax = a.length();
                            palabraMasLetra = a;
                        }
                    }
                    System.out.println("La Palabra con más letras ("+sizemax+") es: "+palabraMasLetra);
                    break;
            }
            }
            catch (InputMismatchException ex){
                ex = new InputMismatchException("Introduir un Núero Entero:");
                System.out.println(ex.getMessage());
                scr.next();
            }
        } while (opcion != 0);
        System.out.println("Gracias por usar el Programa");
    }


    public static String capitalPalabra(String parole){
        parole=parole.toLowerCase();
        char primeraLetra = Character.toUpperCase(parole.charAt(0));
        parole = primeraLetra + parole.substring(1);
        return parole;
    }
    public static <T> void mostrar(Collection<T> coleccion){
        for (T a:coleccion){
            System.out.println(a+" ");
        }
    }
    public static void menu(){
        System.out.println("\n[1] Añadir Palabra" +
                "\n[2] Mostrar Lista" +
                "\n[3] Eliminar Palabras indicando la palabra a eliminar" +
                "\n[4] Ordenar la lista en orden alfabético" +
                "\n[5] Aeriguar la palabra con más letras" +
                "\n[0] Salir del Programa");
    }
    public static void menu2(){
        System.out.println("""
                [1] Añadir Palabra
                [2] Mostrar Lista
                [3] Eliminar Palabras indicando la palabra a eliminar
                [4] Ordenar la lista en orden alfabético
                [5] Aeriguar la palabra con más letras
                [0] Salir del Programa
                """);
    }
}




