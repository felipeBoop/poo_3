package aulagui.model;

import java.util.List;
import javax.swing.JOptionPane;

public class Aluno {
    
    private String nome;
    private String ra;

    public Aluno(){
    
    }
    
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public boolean add(Aluno alunos) {
        try{
            AlunoDAO daoAluno = new AlunoDAO();
            return daoAluno.insere(alunos);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex);
            return false;
        }
    }
    
    public List<Aluno> getAllAlunos(){
        try{
            AlunoDAO daoAluno = new AlunoDAO();
            return daoAluno.getAllAlunos();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao carregar aluno: " + ex);
            return null;
        }
    }
    
}
