package classesOperacoes;

import exercicio2.Operacoes;

public class Soma implements Operacoes{
    private double a;
    private double b;

    public Soma(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double operacao(double a, double b) {
        double resultado = 0;
        resultado = a + b;
        return resultado;
    }
}
