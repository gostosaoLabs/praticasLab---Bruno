package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp,result;
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        temp = scanner.nextInt();
        result = ((double) 5 / (double) 9) * (temp - 32);
        System.out.println("Temperatura em graus Celsius: "+result);
        
        
    }

}
