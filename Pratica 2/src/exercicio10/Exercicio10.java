package exercicio10;
import java.util.Scanner;
public class Exercicio10 {

    public static void main(String[] args) {
        final float PI = 3.1416F;
        Scanner scanner = new Scanner(System.in);
        double raio, result;
        System.out.println("Informe o raio da esfera: ");
        raio = scanner.nextInt();
        result = (4 * PI * Math.pow(raio, 3)) / 3;
        System.out.println("Volume da esfera é: "+result);
    }
    
}
