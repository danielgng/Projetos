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
public class Cliente extends Pessoa { 
  
    private Float cadastrar;

    public Float getCadastrar() {
        return cadastrar;
    }
    
    private Float limiteCompra;

    public Float getLimiteCompra() {
        return limiteCompra;
    }

    public void setCadastrar(Float cadastrar) {
        this.cadastrar = cadastrar;
    }

    public void setLimiteCompra(Float limiteCompra) {
        this.limiteCompra = limiteCompra;
    }
    
    public Cliente(){} /*este é um exemplo de método construtor. Ele serve para iniciar uma variável e é O ÚNICO MÉTODO QUE NÃO TEM
    RETORNO */
    
    public Cliente cadastrar(/*PARÂMETRO é o que VEM DENTRO DOS PARÊNTESES, OCUPAM ESSE ESPAÇO*/)/*O que mais se vê na
    programação são parâmetros*/{
        setCpf(JOptionPane.showInputDialog("Digite o CPF do Cliente: "));
        setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente:"));
        setCelular(JOptionPane.showInputDialog("Digite o número de Celular do Cliente: "));
        setDataNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento do Cliente: ")));
        setLimiteCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da compra")));
                
    return null;
    }

    public String getCPF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    }

