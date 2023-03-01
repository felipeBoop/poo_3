/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import aulagui.View.AlunoModel;
import aulagui.model.Aluno;
import aulagui.model.AlunoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author lipec
 */
public class ControllerAluno {
    
    static AlunoDAO dao = new AlunoDAO();
    public static boolean Cadastrar(String nome, String ra){
        
        try{
            Aluno aluno = new Aluno(nome, ra);
            dao.insere(aluno);
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex);
            return false;
        }
    }
    
}
