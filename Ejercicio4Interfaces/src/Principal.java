import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Electrodomestico[] electro = new Electrodomestico[6];
        float precio,precioLavadoras=0f, precioTelevisores=0f,lavadoraCara=0f,televisorCaro=0f;

        electro[0]=new Lavadora("LG",100,15,'A', Electrodomestico.Tipo_Color.GRIS,9);
        electro[1]=new Lavadora("Samsung",100,28,'L', Electrodomestico.Tipo_Color.BLANCO,15);
        electro[2]=new Lavadora("Balay",100,82,'D', Electrodomestico.Tipo_Color.NEGRO,40);
        electro[3]=new Television("LG",100,45,'H', Electrodomestico.Tipo_Color.BLANCO,30,true);
        electro[4]=new Television("Samsung",100,70,'B', Electrodomestico.Tipo_Color.AZUL,80,true);
        electro[5]=new Television("Philips",100,50,'C', Electrodomestico.Tipo_Color.ROJO,60,false);

        for (Electrodomestico i:electro){
            i.precioFinal();
            precio=i.getPrecio();
            System.out.println(i.toString());
            if(i instanceof Lavadora){
                precioLavadoras+= precio;
                if (precio>lavadoraCara) lavadoraCara=precio;
            }
            else if(i instanceof Television){
                precioTelevisores+= precio;
                if (precio>televisorCaro) televisorCaro=precio;
            }
        }

        /*System.out.println("El precio de todas las lavadoras es de "+precioLavadoras);
        System.out.println("El precio de todos los televisores es de "+precioTelevisores);

        for (Electrodomestico i:electro){
            if (i instanceof Lavadora && i.getPrecio()==lavadoraCara) System.out.println("Los datos de la lavadora más cara son:\n"+i.toString());
            if (i instanceof Television && i.getPrecio()==televisorCaro) System.out.println("Los datos del televisor más caro son:\n"+i.toString());
        }

        for (Electrodomestico i:electro){
            if (i instanceof Television) ((Television) i).instalarNetflix();
        }*/

        System.out.println();
        Arrays.sort(electro);
        for (Electrodomestico i:electro){
            System.out.println(i);
        }
    }
}
