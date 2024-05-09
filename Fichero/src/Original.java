import java.io.*;
import java.lang.annotation.Documented;
import java.util.Date;

public class Original {
    public static void main(String[] args) {
        PrintWriter miFichero=null,log=null;
        try{
            log = new PrintWriter(new FileWriter("log.txt",true));  //primero hay que crear el fichero log.txt, que grabará los errores
            miFichero= new PrintWriter(new FileWriter("."+ File.separator+"prueba"+File.separator+"fichero.txt"));
            miFichero.println("Este es mi primer fichero de texto");
            miFichero.println("Estp parece ir bien");
            miFichero.printf("Escribo un número pai %.2f",31231.645);
            miFichero.flush();
        }catch (IOException e){
            Date fecha = new Date();
            log.print(fecha+" ");
            log.println("Error: " + e.getMessage());
            log.flush();
        }finally {
            if(miFichero!=null) miFichero.close();
        }
    }
}
