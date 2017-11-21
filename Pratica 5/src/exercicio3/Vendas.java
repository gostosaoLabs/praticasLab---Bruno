package exercicio3;
public class Vendas implements VendasInterface{    
    private double valor;
    Produto produto;

    @Override
    public void dinheiro(double valor) {
       this.valor = valor;
    }

    @Override
    public void cartaoDebito(double valor) {
       this.valor = valor;
    }

    @Override
    public void cartaoCredito(double valor) {
        this.valor = valor + 1.05; // aumento de 5%
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public Produto getProduto(){
        return produto;
    }

    
    
    
}
