package exercicio2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        double log,base,logaritmo;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Informe o logaritmando (deve ser maior que zero): ");
            log = scanner.nextInt();
        } while (log <= 0);
        do {
            System.out.println("Informe a base (deve ser maior que zero): ");
            base = scanner.nextInt();
        } while (base <= 0);
        logaritmo = Math.log(log)/Math.log(base);
       System.out.println("O logaritmo de "+log+" na base "+base+" é "+logaritmo);
    }
}
