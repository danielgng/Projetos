
package Loja;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
    
    
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    
    public Funcionario() {
        
      
        
        
    }
    
    @Override
    public void cadastrar(){
        
        setNome(JOptionPane.showInputDialog("Nome do funcionário: "));
        //setCpf(JOptionPane.showInputDialog("CPF do funcionário: "));
        //setCelular(JOptionPane.showInputDialog("Telefone do funcionário: "));
        
    
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
       
        try {
            setDataNascimento(format.parse(JOptionPane.showInputDialog("Data de nascimento do Funcionário: ")));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data Errada Formato é : dd/mm/aaaa");
        }
             
        //setSalario(JOptionPane.showInputDialog("Salário do funcionário: "));
        
        
        
    
    }
    
}