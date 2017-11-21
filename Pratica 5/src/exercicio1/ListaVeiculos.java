package exercicio1;
public class ListaVeiculos {    
    static Veiculos [] listaCarros; 
    static Veiculos [] listaMotos;
    static Veiculos [] listaCaminhoes;
    static Veiculos [] listaOnibus;
    static Veiculos [] listaUtilitarios;
    int TAM;
    
    ListaVeiculos(int TAM) {
        listaCarros = new Veiculos[TAM];
        listaMotos = new Veiculos[TAM];
        listaCaminhoes = new Veiculos[TAM];
        listaOnibus = new Veiculos[TAM];
        listaUtilitarios = new Veiculos[TAM];        
        this.TAM = TAM;
    }
    
    //VEICULOS
    public int quantVeiculosAlugados(){
        return Veiculos.cont;
    }
    public int quantVeiculosDisponivel(){
        return (TAM*5) - Veiculos.cont;
    }
    public double totalLocacoes(){
        return precoCarros()+precoCaminhoes()+precoMotos()+precoUtilitarios()+precoOnibus();
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
        }
        return soma;       
    }
    
    //CAMINHÃO
    public void alugarCaminhao(double preco){
        if(quantCaminhaoDisponivel() > 0){
        listaCaminhoes[Caminhao.contCaminhao] = new Caminhao(preco);
        }
    }  
    public int quantCaminhaoAlugados(){
         return  Caminhao.contCaminhao;     
    }
    public int quantCaminhaoDisponivel(){
        return TAM - Caminhao.contCaminhao;       
    } 
    public double precoCaminhoes(){
        double soma = 0;
        for(int i=0;i<TAM;i++){
            soma = listaCaminhoes[i].getPreco();
        }
        return soma;
    }
    
    //MOTOS
    public void alugarMoto(double preco){
        if(quantMotoDisponivel() > 0){
            double soma = 0;        
        }
    }  
    public int quantMotoAlugados(){
         return Moto.contMotos;       
    }
    public int quantMotoDisponivel(){
       return TAM - Moto.contMotos;        
    } 
    public double precoMotos(){
        double soma = 0;
        for(int i=0;i<TAM;i++){
            soma = listaMotos[i].getPreco();
        }
        return soma;
    }
    
    //ONIBUS
    public void alugarOnibus(double preco){
        if(quantMotoDisponivel() > 0){
        listaOnibus[Onibus.contOnibus] = new Onibus(preco);
        }
    }  
    public int quantOnibusAlugados(){
         return Onibus.contOnibus;       
    }
    public int quantOnibusDisponivel(){
        return TAM - Onibus.contOnibus;        
    } 
    public double precoOnibus(){
        double soma = 0;
        for(int i=0;i<TAM;i++){
            soma = listaOnibus[i].getPreco();
        }
        return soma;        
    }
    //UTILITÁRIOS
    public void alugarUtilitarios(double preco){
        if(quantMotoDisponivel() > 0){
        listaUtilitarios[Utilitarios.contUtilitarios] = new Utilitarios(preco);
        }
    }  
    public int quantUtilitariosAlugados(){
         return Utilitarios.contUtilitarios;       
    }
    public int quantUtilitariosDisponivel(){
        return TAM - Utilitarios.contUtilitarios;        
    } 
    public double precoUtilitarios(){
        double soma = 0;
        for(int i=0;i<TAM;i++){
            soma = listaUtilitarios[i].getPreco();
        }
        return soma;
    }
    
    
    
   
    
    
    
    
    
   /* public boolean temCarroDisponivel(){
        boolean disponivel = false;
        if(Carro.contCarro < TAM){
            disponivel = true;
        }
        return false;
    }*/
    
    
      
    
    
    
}


