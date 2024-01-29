package calculadora;

public class Calculadoraa {
    private int n;
    private int auxiliar;

    public Calculadoraa(int n) {
        this.n = n;
    }
    public Calculadoraa() {
        this(0);
    }
    public int Sumar(int n){
        return this.n += n;
    }
    public int Restar(int n){
        return this.n -= n;
    }
    public int Multiplicar(int n){
        return this.n *= n;
    }
    public int Dividir(){
        return this.n = n;
    }
    /*public int Factorial(){
        resultado = 1;
        for (int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }
    public void inicializar() {
        int n = src.nextInt();
        this.n = n;
    }*/
}
