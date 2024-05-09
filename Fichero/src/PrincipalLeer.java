import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrincipalLeer {
    public static void main(String[] args) {
        Scanner scrFichero = null;
        try {
            scrFichero = new Scanner(new File("."+ File.separator+"prueba"+File.separator+"fichero.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(scrFichero.hasNextLine()) {
            System.out.println(scrFichero.nextLine());
        }
    }
}
