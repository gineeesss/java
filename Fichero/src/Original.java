import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Original {
    public static void main(String[] args) {
        PrintWriter miFichero=null,log=null;
        try{
            log = new PrintWriter("log.txt");  //primero hay que crear el fichero log.txt, que grabará los errores
            miFichero= new PrintWriter("."+ File.separator+"nuevo"+File.separator+"fichero.txt");
            miFichero.println("Este es mi primer fichero de texto");
            miFichero.println("Estp parece ir biensdasd");
            miFichero.flush();
        }catch (FileNotFoundException e){
            log.println("Error: " + e.getMessage());
            log.flush();
        }finally {
            if(miFichero!=null) miFichero.close();
        }
    }
}
