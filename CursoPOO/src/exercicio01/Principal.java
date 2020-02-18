/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author MATHEUS
 */
public class Principal {
    
    public static void main(String[] args) {
       
      String nome = null;
      Float idade = null;
      Float alvo ;
      Float juros = 0f;
      Float contribuicao = 0f;
      Float anos = null;
      Float saldo = 0f;   
      
      
       
       nome = JOptionPane.showInputDialog("Digite seu nome :");
       idade = Float.parseFloat(JOptionPane.showInputDialog("Digite sua idade :"));
       alvo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor em dinheiro que deseja aposentar :"));
       juros = Float.parseFloat(JOptionPane.showInputDialog("Digite o juros que sera aplicado :"));
       contribuicao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor annual aplicado :"));
       anos = Float.parseFloat(JOptionPane.showInputDialog("Digite o total de anos que sera preciso a pessoa realizar a contribuicao :"));
       saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor acumulado ano a ano :"));
       
       juros = juros /100;
       
       while (saldo < alvo) {
       saldo = (saldo + contribuicao) * (1 + juros);
 anos++;
 
  StringBuffer resultado = new StringBuffer();
  resultado.append("nome" +nome+ "\n");
  resultado.append("idade" +idade+ "\n");
  resultado.append("alvo" +alvo+ "\n");
  resultado.append("juros" +juros+ "\n");
  resultado.append("contribuicao" +contribuicao+ "\n");
  resultado.append("anos" +anos+ "\n");
  resultado.append("saldo" +saldo+ "\n");
  JOptionPane.showMessageDialog(null, resultado);
       }
      
    }

    




   
    
    
}
