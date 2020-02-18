package LojaPrincipal;

import Loja.Cliente;
import Loja.Funcionario;
import Loja.Venda;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws ParseException {
    
        
        Cliente c = new Cliente();
        c.cadastrar();
        
        Funcionario f = new Funcionario();
        f.cadastrar();
        
        Venda v = new Venda();
        v.realizarVenda(c, f);
        
        
        StringBuffer cadastro = new StringBuffer();
        
        cadastro.append("++++++++Cliente++++++++"  +  ""+"\n"+
              
                "Nome do Cliente: "+v.getCli().getNome()+"\n"+
                 "CPF do Cliente: "+v.getCli().getCpf()+"\n"+
                  "Telefone do Cliente:"+v.getCli().getCelular()+"\n"+
                   "Data de nascimento do Cliente:"+v.getCli().getDataNascimento()+"\n"+
                    "Limite de compra do Cliente:"+v.getCli().getLimiteCompra()+"\n"+" R$"+"\n"+""
                
               
                
                + "Nome do Funcionário: "+v.getFun().getNome()+"\n"+
                    "CPF do Funcionário: "+v.getFun().getCpf()+"\n"+
                     "Telefone do Funcionario: "+v.getFun().getCelular()+"\n"+
                      "Data de nascimento do Funcionário: "+v.getFun().getDataNascimento()+"\n"+
                       "Salário do Funcionário: "+v.getFun().getSalario()+"\n"+
                              
                "Venda"+"\n"+
                
                    "Data da venda: "+v.getDataVenda()
                );
        
        
        JOptionPane.showMessageDialog(null, cadastro);
        
    
    }
    
}
