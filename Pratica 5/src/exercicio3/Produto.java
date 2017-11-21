package exercicio3;
public class Produto {
    private String nome;
    private int quant;
    private double precoUnidade;
    //Produto produto = Lista Encadeada.
    
    Produto(String nome,int quant,double precoUnidade){
        this.nome = nome;
        this.quant = quant;
        this.precoUnidade = precoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
    
}
