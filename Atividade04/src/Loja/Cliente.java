
package Loja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class Cliente extends Pessoa{
        
    private float limiteCompra;

    public float getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(float limiteCompra) {
        this.limiteCompra = limiteCompra;
    }
    
    
    
    public Cliente(){
    
    
    }

    @Override
    public void cadastrar(){
       
        setNome(JOptionPane.showInputDialog("Nome do cliente: "));
        setCpf(JOptionPane.showInputDialog("CPF do cliente: "));
        setCelular(JOptionPane.showInputDialog("Telefone do cliente: "));
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        
        try {
            setDataNascimento(format.parse(JOptionPane.showInputDialog("Data de nascimento do cliente: ")));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro na data Formato é : dd/mm/aaaa");
        
            
        }
        setLimiteCompra(Float.parseFloat(JOptionPane.showInputDialog("Limite de compra do cliente: ")));
    
    }
}