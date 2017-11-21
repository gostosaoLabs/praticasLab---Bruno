package exercicio1;
public abstract class Veiculos {
    static int cont;
    private double preco;
   
    Veiculos(double preco){
        this.preco = preco;
        cont = cont + 1 ;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}

