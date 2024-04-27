import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Número de palabras: ");
        Palabras palabras = new Palabras();
        Miau miau = palabras.new Miau();
        //String[] palabras = new String[scr.nextInt()];
        miau.palabrasIntro();
        miau.listaIntro();
        for (int i=0;i< miau.lista.length;i++){
            System.out.println("Palabra posición "+i+": ");
            miau.lista[i]=scr.next();
        }
        System.out.println("Letra a buscar: ");
        miau.letraIntro();
        //char letra=scr.next().charAt(0);
        int contador=0;
        for (String a: miau.lista) {
            for(int i=0;i<a.length();i++){
                if (a.charAt(i)==miau.letra)  contador++;
            }
        }
        System.out.println("El número de veces que aparece "+ miau.letra+"en el array de palabras es: "+contador);
    }
    public class Miau{
        Scanner scr = new Scanner(System.in).useDelimiter("\\n");
        public String[] lista;
        public int numPalabras;
        public char letra;
        Miau() {

        };
        public void letraIntro(){
            this.letra = scr.next().charAt(0);
        }
        public void palabrasIntro(){
            this.numPalabras=scr.nextInt();
        }
        public void listaIntro(){
            this.lista=new String[numPalabras];
        }
    }
}
