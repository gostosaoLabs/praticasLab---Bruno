package exercicio14;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Dados do aluno");
        System.out.println("Infome o nome do aluno: ");
        a1.setNome(teclado.nextLine());
        System.out.println("Infome a data de nascimento do aluno: ");
        a1.setDataNascimento(teclado.nextLine());
        System.out.println("Infome o curso do aluno: ");
        a1.setCurso(teclado.nextLine());
        System.out.println("Infome a nota do aluno: ");
        a1.setNota(teclado.nextDouble());

        System.out.println("Dados do aluno");
        System.out.println("Infome o nome do aluno: ");
        a2.setNome(teclado.nextLine());
        System.out.println("Infome a data de nascimento do aluno: ");
        a2.setDataNascimento(teclado.nextLine());
        System.out.println("Infome o curso do aluno: ");
        a2.setCurso(teclado.nextLine());
        System.out.println("Infome a nota do aluno: ");
        a2.setNota(teclado.nextDouble());

        System.out.println("Dados do aluno");
        System.out.println("Infome o nome do aluno: ");
        a3.setNome(teclado.nextLine());
        System.out.println("Infome a data de nascimento do aluno: ");
        a3.setDataNascimento(teclado.nextLine());
        System.out.println("Infome o curso do aluno: ");
        a3.setCurso(teclado.nextLine());
        System.out.println("Infome a nota do aluno: ");
        a3.setNota(teclado.nextDouble());

        System.out.println("------------ Apresentar dados do aluno com maior nota: ------------");
        if (((a1.getNota() > a2.getNota()) && (a2.getNota() > a3.getNota()))
                || ((a1.getNota() > a3.getNota()) && (a3.getNota() > a2.getNota()))) {
            System.out.println("Nome: " + a1.getNome());
            System.out.println("Nascimento: " + a1.getDataNascimento());
            System.out.println("Curso: " + a1.getCurso());
            System.out.println("Nota: " + (a1.getNota()));
        } else if (((a2.getNota() > a1.getNota()) && (a1.getNota() > a3.getNota()))
                || ((a2.getNota() > a3.getNota()) && (a3.getNota() > a1.getNota()))) {
            System.out.println("Nome: " + a2.getNome());
            System.out.println("Nascimento: " + a2.getDataNascimento());
            System.out.println("Curso: " + a2.getCurso());
            System.out.println("Nota: " +(a2.getNota()));
        } else if (((a3.getNota() > a1.getNota()) && (a1.getNota() > a2.getNota()))
                || ((a3.getNota() > a2.getNota()) && (a2.getNota() > a1.getNota()))) {
            System.out.println("Nome: " + a3.getNome());
            System.out.println("Nascimento: " + a3.getDataNascimento());
            System.out.println("Curso: " + a3.getCurso());
            System.out.println("Nota: " + (a3.getNota()));
        }
       
    }

}
