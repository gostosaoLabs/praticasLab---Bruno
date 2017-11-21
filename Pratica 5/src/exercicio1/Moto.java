package exercicio1;
public class Moto extends Veiculos{
    static int contMotos;
    /*
    Moto(double preco){
        super.setPreco(preco*1.04);
    }
    */
    Moto(double preco) {
        super(preco * 1.04);
        contMotos = contMotos + 1; 
    }
}
