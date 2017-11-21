
package exercicio1;
import java.util.Scanner;
public class Exercicio1 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soma de dois números digitados");
        System.out.println("Digite um número ");      
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número ");
        int num2 = scanner.nextInt();
        System.out.println("A soma dos números digitados é "+(num1+num2));
      
    }
    
}
   
