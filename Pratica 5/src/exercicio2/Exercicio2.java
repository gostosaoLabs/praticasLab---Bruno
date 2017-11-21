package exercicio2;
import classesOperacoes.*;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double a;
        double b;
        int continuar = 0;
        while (continuar == 0) {
            System.out.println(" ---- Menu -----");
            System.out.println("1 - Adição\n"
                    + "2 - Subtração\n"
                    + "3 - Multiplicação\n"
                    + "4 - Divisão\n"
                    + "5 - Potenciação\n"
                    + "0 - Sair");
            System.out.println("Digite a operação que deseja realizar: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" ---- ADIÇÃO -----");
                    System.out.println("Digite o primeiro número: ");
                    a = teclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    b = teclado.nextDouble();
                    Soma soma = new Soma(a, b);
                    System.out.println("Resultado: " + soma.operacao(a, b));
                    break;
                case 2:
                    System.out.println(" --- SUBTRAÇÃO ----");
                    System.out.println("");
                    System.out.println("Digite o Minuendo: ");
                    a = teclado.nextDouble();
                    System.out.println("Digite o Subtraendo: ");
                    b = teclado.nextDouble();
                    Subtracao sub = new Subtracao(a, b);
                    System.out.println("Resultado: " + sub.operacao(a, b));
                    break;
                case 3:
                    System.out.println(" ---- MULTIPLICAÇÃO -----  ");
                    System.out.println("");
                    System.out.println("Digite o Multiplicando: ");
                    a = teclado.nextDouble();
                    System.out.println("Digite o Multiplicador: ");
                    b = teclado.nextDouble();
                    Multiplicacao mult = new Multiplicacao(a, b);
                    System.out.println("Resultado: " + mult.operacao(a, b));
                    break;
                case 4:
                    System.out.println(" ----- DIVISÃO ----");
                    System.out.println("");
                    System.out.println("Digite o Dividendo: ");
                    a = teclado.nextDouble();
                    System.out.println("Digite o Divisor: ");
                    b = teclado.nextDouble();
                    Divisao div = new Divisao(a, b);
                    System.out.println("Resultado: " + div.operacao(a, b));
                    break;
                case 5:
                    System.out.println(" ----- POTÊNCIAÇÃO ----");
                    System.out.println("");
                    System.out.println("Digite a Base: ");
                    a = teclado.nextDouble();
                    System.out.println("Digite o Expoente");
                    b = teclado.nextDouble();
                    Potencia pot = new Potencia(a, b);
                    System.out.println("Resultado: " + pot.operacao(a, b));
                    break;
                case 0:
                    continuar = 2;

            }
        }
    }

}
