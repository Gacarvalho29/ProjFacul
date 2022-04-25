package Lab;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Disciplina> disciplina;
    
    public Curso() {
        disciplina = new ArrayList<>();
    }

    
    @Override
    public String toString() {
        return disciplina.toString();
    }


    public List<Disciplina> getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(List<Disciplina> disciplina) {
        for (Disciplina a : disciplina) {
            this.disciplina.add(a);
        }
    }

    
}
