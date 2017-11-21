package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        int i, limiteInferior, limiteSuperior;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um limite inferior ");
        limiteInferior = scanner.nextInt();

        System.out.println("Informe um limite superior ");
        limiteSuperior = scanner.nextInt();        

        for (i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                System.out.println("O número "+i+" é par!");
            }
        }

    }

}
