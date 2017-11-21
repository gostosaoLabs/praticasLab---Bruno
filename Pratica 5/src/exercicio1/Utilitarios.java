package exercicio1;
public class Utilitarios extends Veiculos {
    static int contUtilitarios;
    /*
    Utilitarios(double preco){
        super.setPreco(preco);
    }
    */
    Utilitarios(double preco) {
        super(preco);
        contUtilitarios = contUtilitarios + 1;
    }
}
