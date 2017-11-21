package exercicio17;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {     
        Scanner teclado = new Scanner(System.in);   
        Aluno [] alunos = new Aluno[3];
        recebeDados(alunos);
        imprimeMenorNota(alunos);    
    }
    public static void imprimeMenorNota(Aluno[] alunos) {
        double menor = alunos[0].getNota();
        int posicao = 0;
        for (int i = 0; i < 3; i++) {
            if (alunos[i].getNota() < menor) {
                menor = alunos[i].getNota();
                posicao = i;
            }
        }
        System.out.println("Nome: " + alunos[posicao].getNome());
        System.out.println("Nascimento: " + alunos[posicao].getDataNascimento());
        System.out.println("Curso: " + alunos[posicao].getCurso());
        System.out.println("Nota: " + alunos[posicao].getNota());
    }

    public static void recebeDados(Aluno[] alunos) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Dados do aluno");
            System.out.println("Infome o nome do aluno: ");
            alunos[i].setNome(teclado.nextLine());
            System.out.println("Infome a data de nascimento do aluno: ");
            alunos[i].setDataNascimento(teclado.nextLine());
            System.out.println("Infome o curso do aluno: ");
            alunos[i].setCurso(teclado.nextLine());
            System.out.println("Infome a nota do aluno: ");
            alunos[i].setNota(teclado.nextDouble());
        }
    }


}
