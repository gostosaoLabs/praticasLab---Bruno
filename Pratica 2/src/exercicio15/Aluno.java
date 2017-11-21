package exercicio15;
public class Aluno {
    String nome, dataNascimento, curso;
    double nota;
    
    public Aluno() {
    }

    public Aluno(String nome, String dataNascimento, String curso, double nota) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
