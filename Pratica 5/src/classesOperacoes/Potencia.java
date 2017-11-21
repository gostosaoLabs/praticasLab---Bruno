package classesOperacoes;
import exercicio2.Operacoes;
public class Potencia implements Operacoes{
    private double a;
    private double b;

    public Potencia(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double operacao(double a, double b) {
        double resultado;
        if (b == 0) {
            resultado = 1;
        } else if (b < 0) {
            resultado = 0;
        } else {
            resultado = a * operacao(a, b - 1);
        }
        return resultado;
    }
    
}
