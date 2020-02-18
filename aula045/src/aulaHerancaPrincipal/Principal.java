/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaHerancaPrincipal;

import aulaHeranca.Cliente;
import aulaHeranca.Funcionario;
import aulaHeranca.Pessoa;
import aulaHeranca.Venda;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Pessoa p = new Pessoa() {
            @Override
            public void Cadastrar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        } 
                ;
        
        
        Cliente c = new Cliente();
        Cliente cadastrar = c.cadastrar();
        
        Funcionario f = new Funcionario();

        Venda v = new Venda();
        v.realizarVenda(c,p, f );
        
        StringBuilder resultado = new StringBuilder();
        
        StringBuilder append = resultado.append("Nome do cliente: "+v.getC() .getNome()+"\n"+
                "CPF do cliente: "+v.getC() .getCPF()+"\n"+
                "Celular do cliente: "+v.getC() .getCelular()+"\n"+
                "Data de nascimento do Cliente: "+v.getC() .getDataNascimento()+"\n"+
                "Limite de compra do Cliente: "+v.getC() .getLimiteCompra()+"\n"+
                "Nome do Funcionario: "+v.getF() .getNome()+"\n"+
                "Cpf do funcionario: "+v.getF() .getCpf()+"\n"+
                "Celular do funcionário: "+v.getF() .getCelular()+"\n"+
                "Data de nascimento do funcionário: "+v.getF() .getDataNascimento()+"\n"+
                "Salário do funcionário: "+v.getF() .getSalario()+"\n"+
                "cadastrar" +v.getcadastrar ()+"\n" );
         
        JOptionPane.showMessageDialog(null, resultado);
   
                
  
                
               
            
    }         
    }

    

