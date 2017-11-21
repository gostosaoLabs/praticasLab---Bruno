package exercicio1;
public class ListaCarro {
     static Veiculos [] listaCarros; 
     int TAM;
    
     ListaCarro(int TAM) {
        listaCarros = new Veiculos[TAM];               
        this.TAM = TAM;
    }
     //CARROS
    public void alugarCarro(double preco){
        if(quantCarroDisponivel() > 0){
        listaCarros[Carro.contCarro] = new Carro(preco);
        }
    }  
    public int quantCarroAlugados(){
         return Carro.contCarro;       
    }
    public int quantCarroDisponivel(){
         return TAM - Carro.contCarro;        
    }     
    public double precoCarros(){
        double soma = 0;
        for(int i=0;i<TAM;i++){
            soma = listaCarros[i].getPreco() + soma;
           // System.out.println(soma);
        }
        return soma;       
    }
}
