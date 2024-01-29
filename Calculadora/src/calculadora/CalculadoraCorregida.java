package calculadora;

// cuando no se crea manualmente un constructor en una clase
// java crea automaticamente un constructor vacio()
// si tengo crear un constructor, el de por defecto() desaparece
// entonce spara crear otra vacio hay que construir uno () con this.resultado = 0;
public class CalculadoraCorregida {
    //propiedades
    private int resultado;
    //metodos

    public CalculadoraCorregida(int operando){
        this.resultado = operando;
    }
    public CalculadoraCorregida(){
        this.resultado = 0;
    }
    public int getResultado() {
        return th4is.resultado;
    }
    public int sumar(int n){
        return this.resultado +=n;
    }
    public int restar(int n){
        return this.resultado -=n;
    }
    public int multipliar(int n){
        return this.resultado *=n;
    }
    public int dividir(int n){
        this.resultado /=n;
        return this.resultado;
    }
    public void inicializar (){
        this.resultado = 0;
    }
    public void factorial(){
        for (int i = this.resultado; i>1; i--){
            this.resultado *=i-1;
        }
    }

}
