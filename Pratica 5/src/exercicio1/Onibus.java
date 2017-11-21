package exercicio1;
public class Onibus extends Veiculos {
    static int contOnibus;
    /*
    Onibus(double preco){
        super.setPreco(preco*0.97);
    }
    */
    Onibus(double preco) {
        super(preco * 0.97);
        contOnibus = contOnibus + 1; 
    }
}
