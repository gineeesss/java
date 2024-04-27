public abstract class Electrodomestico implements Comparable{
    private String marca;
    private float precio;
    private int peso;
    private char consumo;
    public enum Tipo_Color {BLANCO, ROJO, NEGRO, AZUL,GRIS};
    private  Tipo_Color color;

    public Electrodomestico(String marca, float precio, int peso, char consumo, Tipo_Color color) {
        this.marca=marca;
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        ComprobarConsumoEnergetico(consumo);
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "precio=" + precio +
                ", peso=" + peso +
                ", consumo=" + consumo +
                ", color=" + color;
    }

    private void ComprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A','B','C','D','E':
                this.consumo=letra;
                break;
            default:
                this.consumo='F';
                break;
        }
    }

    public void precioFinal(){
        switch (this.consumo){
            case 'A':
                this.precio+=100;
                break;
            case 'B':
                this.precio+=80;
                break;
            case 'C':
                this.precio+=60;
                break;
            case 'D':
                this.precio+=50;
                break;
            case 'E':
                this.precio+=30;
                break;
            case 'F':
                this.precio+=10;
                break;
        }

        if (this.peso>=0 && this.peso<20) this.precio+=10;
        else if (this.peso>=20 && this.peso<49) this.precio+=50;
        else if (this.peso>=50 && this.peso<79) this.precio+=80;
        else if (this.peso>=80) this.precio+=100;
    }

    public int compareTo(Object o){
        Electrodomestico otro = (Electrodomestico) o;
        if (this.precio< otro.precio) return -1;
        else if (this.precio> otro.precio) return 1;
        else return 0;
    }
}
