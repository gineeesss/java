package electrodoesticos;

public abstract class Electrodomestico implements Comparable{

    //PROPERTIES
    public enum Color{blanco,negro,rojo,azul,gris}
    private final String marca;
    private float precio;
    private final int peso;
    private final char consumoEnergetico;
    private final Color color;

    public Electrodomestico(String marca, float precio,int peso, char consumoEnergetico, Color color) {
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.color = color;
    }

    public  float getPrecio() {
        return precio;
    }
    public String getMarca(){
        return marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "marca: " + marca + "| precio: " + precio +
                "| peso: " + peso +
                "| consumoEnergetico: " + consumoEnergetico +
                "| color: " + color ;
    }

    public char comprobarConsumoEnergetico(char consumo){
       switch (consumo){
           case 'A','a','B','b','C','c','D','d','F','f': consumo = Character.toUpperCase(consumo);break;
           default: consumo = 'F';
       }
        //dos maneras distintas
        if (Character.toUpperCase(consumo) >= 'A' && Character.toUpperCase(consumo) <='F'){
            return Character.toUpperCase(consumo);
        } else return 'F';

    }

    public void precioFinal(){
        if(this.peso >=10){
            switch (this.consumoEnergetico){
                case 'A':
                    this.precio += 100;
                    break;
                case 'B':
                    this.precio += 80;
                    break;
                case 'C':
                    this.precio += 50;
                    break;
                case 'D':
                    this.precio += 30;
                    break;
                case 'F':
                    this.precio += 10;
                    break;
            }
            if (this.peso > 0){ //control por si hay algún peso puesto en negativo, no se calcule el prcio
                if (this.peso < 19){
                    this.precio +=10;
                } else if (this.peso >=20 && this.peso <50) {
                    this.precio +=50;
                } else if (this.peso >=50 && this.peso <80) {
                    this.precio +=80;
                } else this.precio +=100;
            }
        }
    }

    @Override
    public int compareTo(Object otro) {//tiene que ser objeto, porque sino romperias la firma
        if (this.precio< ((Electrodomestico) otro).precio) return -1;
        else if (this.precio> ((Electrodomestico) otro).precio) return +1;
        else return -1;
    }
}
