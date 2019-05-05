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
public class Saque extends javax.swing.JFrame {

    /**
     * Creates new form Saque
     */
    public Saque() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saque");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Conta:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Valor do Saque");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("comfirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
              
        if(txtSaldo.getText().equals("")||txtNum.getText().equals("")){
            JOptionPane.showMessageDialog(null,"preencha todos os campos");
        }
        else{if(txtNum.getText().matches("[A-Z]*") ||txtSaldo.getText().matches("[A-Z]*")|| txtNum.getText().matches("[a-z]*") ||txtSaldo.getText().matches("[a-z]*")){
            JOptionPane.showMessageDialog(null,"preencha todos os campos CORRETAMENTE");
        }else{
             int num = Integer.parseInt(txtNum.getText());
             double valor = Double.parseDouble(txtSaldo.getText()); 
            if (Integer.parseInt(txtNum.getText()) != CadContas.c.getNumero()
                && Integer.parseInt(txtNum.getText()) != CadContPoupanca.p.getNumero()
                && Integer.parseInt(txtNum.getText()) != CadContEspecial.e.getNumero()){
                JOptionPane.showMessageDialog(null, ("conta inválida."));
            }
            else{            
            if(Integer.parseInt(txtNum.getText()) == CadContas.c.getNumero()) {
                Object[] btn = { "Confirmar", "Cancelar" };
                int resposta = JOptionPane.showOptionDialog(null,"Titular: "+CadContas.c.getNome()+"\nConfirme o saque","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn, btn[0]);
                if(resposta == 0) {
                    if(CadContas.c.getSaldo() >= valor) {
                        CadContas.c.setSaldo(CadContas.c.getSaldo() - valor);
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                    dispose();
                    new AplicBank().setVisible(true);
                } else if(resposta == 1) {
                    JOptionPane.showMessageDialog(null, "Saque cancelado com sucesso");
                    dispose();
                    new AplicBank().setVisible(true);
                }
            } 
            if(Integer.parseInt(txtNum.getText()) == CadContPoupanca.p.getNumero()) {        
                Object[] btn = { "Confirmar", "Cancelar" };
                int resposta = JOptionPane.showOptionDialog(null,"Titular: "+CadContPoupanca.p.getNome()+"\nConfirme o saque","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn, btn[0]);
                if(resposta == 0) {
                    if(CadContPoupanca.p.getSaldo() >= valor) {
                       CadContPoupanca.p.setSaldo(CadContPoupanca.p.getSaldo() - valor);
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                    dispose();
                    new AplicBank().setVisible(true);
                    } else if(resposta == 1) {
                    JOptionPane.showMessageDialog(null,"Saque cancelado com sucesso");
                    dispose();
                    new AplicBank().setVisible(true);
                }
    }
        if(Integer.parseInt(txtNum.getText()) == CadContEspecial.e.getNumero()) {
                Object[] btn = {"Confirmar","Cancelar" };
                int resposta = JOptionPane.showOptionDialog(null,"Titular: "+CadContEspecial.e.getNome()+"\nConfirme o saque","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn, btn[0]);
                if(resposta == 0) {
                    if(CadContEspecial.e.getSaldo() >= valor) {
                        CadContEspecial.e.setSaldo(CadContEspecial.e.getSaldo() - valor);
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
                        dispose();
                        new AplicBank().setVisible(true);
                    } else {
                        if((CadContEspecial.e.getLimite()+CadContEspecial.e.getSaldo())>=valor){
                            CadContEspecial.e.setSaldo((CadContEspecial.e.getSaldo()-valor)+(CadContEspecial.e.getSaldo()-valor)*CadContEspecial.e.getMulta()*0.01);                                              
                            JOptionPane.showMessageDialog(null,"Saque feito usando cheque especial");
                            dispose();
                            new AplicBank().setVisible(true);
                        }
                        else{
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                        dispose();
                        new AplicBank().setVisible(true);
                        }
                    }
                    dispose();
                    new AplicBank().setVisible(true);
                    } else if(resposta == 1) {
                        JOptionPane.showMessageDialog(null, "Saque cancelado com sucesso");
                        dispose();
                       new AplicBank().setVisible(true);
                }
    }
            }
            this.setVisible(false);
            dispose();
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new AplicBank().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
