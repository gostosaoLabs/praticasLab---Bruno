package exercicio16;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Aluno a1;
        Aluno a2;
        Aluno a3;
        Scanner teclado = new Scanner(System.in);
        
        a1 = new Aluno();
        a2 = new Aluno();
        a3 = new Aluno();
        
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
        
        a1 = null;
        a2 = null;
        a3 = null;       
      
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
