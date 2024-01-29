public class Prueba {
    public static void main(String[] args) {

        // enum realmente es un objeto  y a partir de el se crean variables
        enum diasSemana{LUNES,MARTES, MIÉRCCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO}
        diasSemana diaHoy, diaMañana;
        // SE DEFINE UNA VARIALE DEL TIPO ENUM DEFINIDO
        diaHoy = diasSemana.MIÉRCCOLES;
        // SOLO SE LE PUEDE DAR UNO DE LOS VALORES DEL ENUM
        diaMañana = diasSemana.JUEVES;
        System.out.println(diaMañana);

        enum meses{ENERO, FEBERO, MARZO, ABRIL, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OVTUBRE, NOVIEMBRE, DICIEMBRE}
        meses mesActual = meses.NOVIEMBRE;
        System.out.println(mesActual);
        double a = 231;
        int b = 2;
        System.out.print(a+b);

    }
}