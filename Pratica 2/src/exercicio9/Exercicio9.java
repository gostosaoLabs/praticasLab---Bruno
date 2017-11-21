package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j, i;
        int mat1[][] = new int[4][4];
        int mat2[][] = new int[4][4];
        int mat3[][] = new int[4][4];

        System.out.println("Informando a primeira matriz:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("\nInforme um numero: ");
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n\n\nInformando a segunda matriz:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("\nInforme um numero: ");
                mat2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n\n\nSomando os valores das matrizes");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("\nValores somados!");
        System.out.println("\n\n\nApresentando a matriz resultante");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Matriz resultante["+i+"]["+j+"]:"+mat3[i][j]);
            }   
            }
        }

    }
