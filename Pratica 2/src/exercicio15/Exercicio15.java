package exercicio15;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Scanner teclado = new Scanner(System.in);
        
        recebeDados(a1);
        recebeDados(a2);
        recebeDados(a3);       
        
        System.out.println("Aluno com maior nota: ");
        if (((a1.getNota() > a2.getNota()) && (a2.getNota() > a3.getNota()))
                || ((a1.getNota() > a3.getNota()) && (a3.getNota() > a2.getNota()))) {
            imprimeDados(a1);
        } else if (((a2.getNota() > a1.getNota()) && (a1.getNota() > a3.getNota()))
                || ((a2.getNota() > a3.getNota()) && (a3.getNota() > a1.getNota()))) {
            imprimeDados(a2);
        } else if (((a3.getNota() > a1.getNota()) && (a1.getNota() > a2.getNota()))
                || ((a3.getNota() > a2.getNota()) && (a2.getNota() > a1.getNota()))) {
            imprimeDados(a3);
        }
       
    }
    public static void recebeDados(Aluno aluno){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dados do aluno");
        System.out.println("Infome o nome do aluno: ");
        aluno.setNome(teclado.nextLine());
        System.out.println("Infome a data de nascimento do aluno: ");
        aluno.setDataNascimento(teclado.nextLine());
        System.out.println("Infome o curso do aluno: ");
        aluno.setCurso(teclado.nextLine());
        System.out.println("Infome a nota do aluno: ");
        aluno.setNota(teclado.nextDouble());
    }
    public static void imprimeDados(Aluno aluno){
         System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nascimento: " + aluno.getDataNascimento());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Nota: " + aluno.getNota());
    }

}
