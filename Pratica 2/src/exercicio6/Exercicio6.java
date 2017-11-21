
package exercicio6;
import java.util.Scanner;
public class Exercicio6 {    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int op;
        char resp = 's';
        double base, altura, raio, maior, menor;

        while (resp == 's') {
            System.out.println("Digite: ");
            System.out.println("1 - Para calcular a area de um retangulo.");
            System.out.println("2 - Para calcular a area de um triangulo.");
            System.out.println("3 - Para calcular a area de um circulo.");
            System.out.println("4 - Para calcular a area de um trapezio.\n\n ");
            System.out.println("Opção selecionada: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n\n\nInforme a base do retangulo");
                    base = scanner.nextInt();
                    System.out.println("Informe a altura do retangulo: ");
                    altura = scanner.nextInt();
                    System.out.println("A área do retangulo é" + (base * altura));
                    break;

                case 2:
                    System.out.println("Informe a base do triangulo");
                    base = scanner.nextInt();
                    System.out.println("Informe a altura do triangulo: ");
                    altura = scanner.nextInt();
                    System.out.println("A área do triangulo é " + (base * altura));
                    break;

                case 3:
                    System.out.println("Informe o rario do círculo");
                    raio = scanner.nextInt();
                    System.out.println("A área do círculo é " + (3.14 * raio * raio));
                    break;

                case 4:
                    System.out.println("Informe a base maior do trapezio: ");
                    maior = scanner.nextInt();

                    System.out.println("Informe a base menor do trapezio: ");
                    menor = scanner.nextInt();

                    System.out.println("Informe a altura do trapezio: ");
                    altura = scanner.nextInt();

                    System.out.println("A área do trapézio é " + ((maior + menor) * altura / 2));
                    break;

                default:
                    System.out.println("Codigo invalido!");
            }
            System.out.println("\n\n\nDeseja executar novamente? ");
            resp = scanner.next().charAt(0);
        }
       
    }
    
}
