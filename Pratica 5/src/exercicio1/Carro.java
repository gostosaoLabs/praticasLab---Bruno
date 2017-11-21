package exercicio1;
public class Carro extends Veiculos{
    static int contCarro = 0;
    /*
    Carro(double preco){
        super.setPreco(preco*1.03);
    }
    */
    Carro(double preco) {
        super(preco * 1.03);
        contCarro = contCarro + 1;
    }
}
