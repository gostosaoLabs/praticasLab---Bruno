/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número ");      
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("O número "+num1+" é maior.");
        }
        else 
            System.out.println("O número "+num2+"é maior");
      

    }

}
