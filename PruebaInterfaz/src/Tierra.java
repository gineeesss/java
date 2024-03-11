public interface Tierra {
    double g=9.8;
    double fuerza();

    default String metodoConCodigo(){
        return "Hola, este método usa default";
    }
}
//Está preeterminado que sea static fonal abstract