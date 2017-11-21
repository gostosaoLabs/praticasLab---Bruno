package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int vet[];
        vet = new int[5];

        for (i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            vet[i] = scanner.nextInt();
        }

        for (i = 0; i < 5; i++) {
            System.out.println("O vetor vet["+i+"] = "+vet[i]+" com desconto de 10% é: "+(vet[i]*0.9));          
        }

    }

}
