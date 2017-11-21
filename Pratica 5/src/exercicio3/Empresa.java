package exercicio3;
public class Empresa {
    Vendas[] vendas;
    private final int TAM = 15;

    Empresa() {
        vendas = new Vendas[TAM];
    }
    public void adicionarVenda(String nome, int quant,double precoUnidade){
        for (int i = 0; i < TAM; i++){
            if (vendas[i] == null){
                 vendas[i] = new Vendas();
                 vendas[i].produto = new Produto(nome, quant,precoUnidade);
                 vendas[i].setValor(precoUnidade*quant);
                 break;                 
            }
        }
    }  
      
    public int quantidadeDeProdutos(){
        int quant = 0;
        for(int i = 0; i < TAM; i++){
            if(vendas[i] != null){
            quant = vendas[i].produto.getQuant() + quant;
            }
        }
        return quant;
    }
    public int quantidadeDeVendas(){
        int quant = 0;
        for(int i = 0; i < TAM; i++){
           if(vendas[i]!=null){
               quant = quant + 1;
           }
        }
        return quant;
    }
    public double metodoPagamento(int opcao,int p){
        double total = 0;
        switch (opcao) {
            case 1:
                vendas[p].dinheiro(vendas[p].getValor());
                total = vendas[p].getValor();
                break;
            case 2:
                vendas[p].cartaoDebito(vendas[p].getValor());
                total = vendas[p].getValor();
                break;
            case 3:
                vendas[p].cartaoCredito(vendas[p].getValor());
                total = vendas[p].getValor();
                break;
            default:
                break;
        }
          return total;
    }
    
    
}
