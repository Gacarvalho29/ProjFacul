package Lab;

public class Main {
    public static void main(String[] args) {
        

        Aluno a = new Aluno();
        a.setNome("Carlos");
        a.setIdade(18);

        Aluno b = new Aluno();
        b.setNome("Gabriel");
        b.setIdade(19);

        Aluno c = new Aluno();
        c.setNome("Luigi");
        c.setIdade(20);

        Aluno d = new Aluno();
        d.setNome("Augusto");
        d.setIdade(21);

        Aluno e = new Aluno();
        e.setNome("Pedro");
        e.setIdade(19);

        Disciplina web = new Disciplina();
        web.setNome("Web");
        web.getAluno().add(a);
        web.getAluno().add(d);
        web.getAluno().add(e);

        Disciplina so = new Disciplina();
        so.setNome("SO");
        so.getAluno().add(a);
        so.getAluno().add(b);
        so.getAluno().add(c);

        Disciplina po = new Disciplina();
        po.setNome("PO");
        po.getAluno().add(d);
        po.getAluno().add(b);
        po.getAluno().add(e);
        

        Curso ti = new Curso();
        ti.getDisciplina().add(po);

        System.out.println(ti);
        

    }
}
