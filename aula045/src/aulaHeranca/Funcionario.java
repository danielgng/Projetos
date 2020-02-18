/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaHeranca;

import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class Funcionario extends Pessoa { 
  
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
 
    
    public Funcionario cadastrar(){
        setCpf(JOptionPane.showInputDialog("Digite o CPF do Funcionario: "));
        setNome(JOptionPane.showInputDialog("Digite o nome do Funcionario: "));
        setCelular(JOptionPane.showInputDialog("Digite o número de celular do Funcionario: "));
        setDataNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento do Funcionario: ")));
        setSalario(JOptionPane.showInputDialog("Digite o salário do Funcionário: "));
        
        return this;
    }

    @Override
    public void Cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 
