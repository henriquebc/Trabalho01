/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class Trabalho01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JOptionPane.showMessageDialog(null,"Bem vindo(a) cliente");
      CadContas jn=new CadContas();
      jn.setVisible(true);
      jn.setLocationRelativeTo(null);
    }
    
}
