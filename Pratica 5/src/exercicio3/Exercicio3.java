package exercicio3;
import java.util.Scanner;
public class Exercicio3 {   
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int opcao;
       int posicao;
       Empresa vendas = new Empresa();
       vendas.adicionarVenda("Pao",6,0.50);
       vendas.adicionarVenda("Leite",1,2.50);
       System.out.println("Quantidade de Produtos Vendidos: "+vendas.quantidadeDeProdutos());
       System.out.println("Quantidade de Vendas: "+vendas.quantidadeDeVendas());
       System.out.println("---- Metodo de pagamento ---- ");
       System.out.println("1 - Dinheiro\n"
               + "2 - Cartão de Débito\n"
               + "3 - Cartão de Crédito");
       opcao = teclado.nextInt();
       System.out.println("Digite o número da venda que deseja");
       posicao = teclado.nextInt();       
       System.out.println("Total a pagar: "+vendas.metodoPagamento(opcao, posicao));
       
    }
    
}
