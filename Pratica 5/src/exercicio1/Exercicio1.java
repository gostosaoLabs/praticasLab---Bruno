package exercicio1;
public class Exercicio1 {
    public static void main(String[] args) {
        ListaVeiculos lista = new ListaVeiculos(5);
        lista.alugarCarro(200);
        lista.alugarCarro(600);
        System.out.println("Há " +lista.quantCarroDisponivel()+" carros disponíveis.");
        System.out.println("Há " +lista.quantCarroAlugados()+" carros alugados.");
       // System.out.println("O valor de aluguel total da categoria é "+lista.precoCarros());
        lista.alugarCaminhao(600);
        System.out.println("Há " +lista.quantVeiculosDisponivel()+" veiculos disponíveis.");
        System.out.println("Há " +lista.quantVeiculosAlugados()+" veiculos alugados.");
       // System.out.println("O valor total de locações é "+lista.totalLocacoes());
       /*ListaCarro c = new ListaCarro(5);
       c.alugarCarro(200);
       c.alugarCarro(600);
       System.out.println("Há " +c.quantCarroDisponivel()+" carros disponíveis.");
       System.out.println("Há " +c.quantCarroAlugados()+" carros alugados.");
       System.out.println("O valor de aluguel total da categoria é "+c.precoCarros());
       */
       

        
    }

}

// STATIC faz com que os valores/métodos estejam no escopo da classe, e não da instancia
// essa varíavel será incrementada quando sempre que o contrutor for executado.

