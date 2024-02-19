package electrodoesticos;

public class Electrodomestico {

    //PROPERTIES
    public enum Color{blanco,negro,rojo,azul,gris}
    private String marca;
    private float precio;
    private float peso;
    private char consumoEnergetico;
    private Color color;

    public Electrodomestico(String marca, float precio,float peso, char consumoEnergetico, Color color) {
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", consumoEnergetico=" + consumoEnergetico +
                ", color=" + color +
                '}';
    }
    public char comprobarConsumoEnergetico(char consumo){
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
            if (this.peso <=19)
        }
    }
}
