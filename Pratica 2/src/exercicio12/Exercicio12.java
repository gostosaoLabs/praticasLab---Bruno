package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, media;
        System.out.print("Informe o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        num2 = scanner.nextInt();

        System.out.print("Informe o terceiro valor: ");
        num3 = scanner.nextInt();
        
        media=(num1 + num2 + num3) / 3;
        
        System.out.println("A média dos valores digitados é "+media);

    }

}
