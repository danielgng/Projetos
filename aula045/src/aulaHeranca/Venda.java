/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaHeranca; //pacote aulaHeranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class Venda {
    
    private Date dataVenda;
    private final Pessoa p = new Pessoa() {
        @Override
        public void Cadastrar() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    private Cliente c = new Cliente();
    private Funcionario f = new Funcionario() ; 
  
            
    public Funcionario getF(){
       return f;
    }
    
    public void setF(Funcionario f){
       this.f = f;
    }
    
    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
   
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
   public void realizarVenda(Cliente cliente,  Funcionario funcionario) throws ParseException{
        
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        setDataVenda(format.parse(JOptionPane.showInputDialog("Digite a data da Venda")));
     
        setC(cliente);
        setF(funcionario);
  
    }

    public void realizarVenda(Cliente c, Pessoa p, Funcionario f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getcadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
}
