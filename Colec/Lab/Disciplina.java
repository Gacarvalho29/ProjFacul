package Lab;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    
    private String nome;
    private List<Aluno> aluno;

    public Disciplina(){
        aluno = new ArrayList<>();
    }
    
    
    @Override
    public String toString() {
        return "Disciplina [aluno=" + this.aluno + ", nome=" + this.nome + "]";
    }


    public List<Aluno> getAluno() {
        return aluno;
    }
    public void setAluno(List<Aluno> aluno) {
        for (Aluno a : aluno) {
            this.aluno.add(a);
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
}
