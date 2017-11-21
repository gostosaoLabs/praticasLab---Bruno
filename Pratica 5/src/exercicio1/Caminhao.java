package exercicio1;
public class Caminhao extends Veiculos {
    static int contCaminhao;
    /*
    Caminhao(double preco){
        super.setPreco(preco*0.96);
    }
    */
    Caminhao(double preco) {
        super(preco * 0.96);
        contCaminhao = contCaminhao + 1;
    }
}
