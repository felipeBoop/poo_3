package aulagui.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*classe responsavel por persistir e recuperar os dados de um aluno*/

public class AlunoDAO {
    
    private static List<Aluno> alunos = null;
    
    public AlunoDAO(){
        if(alunos==null){
            alunos = new ArrayList<>();
        }
        
    }
    
    public boolean insere(Aluno aluno){
        return alunos.add(aluno);
    }
    
    public Aluno getAluno(String ra){
        Aluno procurado = null;
        //Dado o Ra, busque o aluno
        
        /*Metodo Ineficiente*/
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).getRa().equals(ra)){
                procurado = alunos.get(i);
            }   
        }
        
        /*Metodo Eficiente*/
        Iterator<Aluno> obj = alunos.iterator();
        while(obj.hasNext()){
            Aluno aluno = obj.next();
            if(aluno.getRa().equals(ra)){
                procurado = aluno;
            }
            
        }
        
        return procurado;
        
    }
    
    public List<Aluno> getAllAlunos(){
        return alunos;
    }
    
}
