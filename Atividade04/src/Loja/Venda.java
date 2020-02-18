
package Loja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Venda {
    

        private Date dataVenda;
        private Cliente cli = new Cliente();
        private Funcionario fun = new Funcionario();

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

    
        

        public Date getDataVenda() {
        return dataVenda;
        }

       public void setDataVenda(Date dataVenda) {
           this.dataVenda = dataVenda;
        }
        
        
        
        public Venda(){
        
            
        }
            
        
        public void realizarVenda(Cliente cliente, Funcionario funcionario){
            
            setCli(cliente);
            setFun(funcionario);
            
            
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
            try {
                setDataVenda(format.parse(JOptionPane.showInputDialog("Qual a data da Venda:")));
            } catch (ParseException ex) {
               JOptionPane.showMessageDialog(null, "Ocorreu um erro Digite assim: dd/mm/aaaa");
            }
            
        
        }


}