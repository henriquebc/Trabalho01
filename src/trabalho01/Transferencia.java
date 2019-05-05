
package trabalho01;

import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class Transferencia extends javax.swing.JFrame {

    /**
     * Creates new form Transferencia
     */
    public Transferencia() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transferência");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Conta 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Conta 2:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("valor:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("Cancelar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addComponent(txtNum2)
                        .addComponent(txtNum1)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jToggleButton1))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        if(txtValor.getText().equals("")||txtNum1.getText().equals("")||txtNum2.getText().equals(""))
           JOptionPane.showMessageDialog(null,"Preencha todos os campos para prosseguir!!");
         else{if(txtValor.getText().matches("[a-z]*")||txtNum1.getText().matches("[a-z]*")||txtNum2.getText().matches("[a-z]*")||txtValor.getText().matches("[A-Z]*")||txtNum1.getText().matches("[A-Z]*")||txtNum2.getText().matches("[A-Z]*")){             
           JOptionPane.showMessageDialog(null,"Preencha todos os campos CORRETAMENTE");
         }else{
               int c1= Integer.parseInt(txtNum1.getText());
               int c2 = Integer.parseInt(txtNum2.getText());
               double valor = Double.parseDouble(txtValor.getText()); 
            if(c1==CadContas.c.getNumero()){
                if(CadContas.c.getSaldo()>=valor){
                    if(c2 == CadContPoupanca.p.getNumero()){
                      Object[] btn = {"Confirmar","Cancelar"};
                        int res = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContas.c.getNome()+"\nDeja confirmar a transferência para  "+CadContPoupanca.p.getNome()+"\n","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn, btn[0]);
                        switch(res){
                            case 0:
                                CadContas.c.setSaldo(CadContas.c.getSaldo() - valor);
                                CadContPoupanca.p.setSaldo(CadContPoupanca.p.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null,"Transferência realizada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null,"Operação cancelada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                     if(c2 == CadContEspecial.e.getNumero()){
                        Object[] btn = {"Confirmar","Cancelar" };
                        int res = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContas.c.getNome()+"\nDeseja confirmar a transferência para "+CadContEspecial.e.getNome()+"\n","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);
                        switch(res){
                            case 0:
                                CadContas.c.setSaldo(CadContas.c.getSaldo() - valor);
                                CadContEspecial.e.setSaldo(CadContEspecial.e.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null,"Transferência realizada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null,"Operação cancelada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Titular:"+CadContas.c.getNome()+" possui saldo insuficiente!!!");
                }          
            }     
       if(c1 == CadContEspecial.e.getNumero()){
                if(CadContEspecial.e.getSaldo()>=valor){
                     if(c2 == CadContas.c.getNumero()){
                        Object[] btn= {"Confirmar","Cancelar" };
                        int r = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContPoupanca.p.getNome()+"\nDeseja confirmar a transferência para "+CadContas.c.getNumero()+"\n","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);
                        switch(r){
                            case 0:
                                CadContEspecial.e.setSaldo(CadContEspecial.e.getSaldo() - valor);
                                CadContas.c.setSaldo(CadContas.c.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null,"Transferência realizada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null,"Operação cancelada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                   if(c2 == CadContPoupanca.p.getNumero()){
                        Object[] btn= {"Confirmar","Cancelar" };
                        int r = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContPoupanca.p.getNome()+"\nDeseja confirmar a tranferência para "+CadContas.c.getNumero()+"\n", "Confirmação",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn,btn[0]);
                        switch(r){
                            case 0:
                                CadContEspecial.e.setSaldo(CadContEspecial.e.getSaldo() - valor);
                                CadContPoupanca.p.setSaldo(CadContPoupanca.p.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                }
               if((CadContEspecial.e.getLimite()+CadContEspecial.e.getSaldo())>=valor){
                   if(c2 == CadContas.c.getNumero()){
                        Object[] btn= {"Confirmar","Cancelar" };
                        int r = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContPoupanca.p.getNome()+"\nDeseja confirmar a transferência para "+CadContas.c.getNumero()+"\n","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);
                        switch(r){
                            case 0:
                                CadContEspecial.e.setSaldo((CadContEspecial.e.getSaldo()-valor)+(CadContEspecial.e.getSaldo()-valor)*CadContEspecial.e.getMulta()*0.01);
                                CadContas.c.setSaldo(CadContas.c.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null,"Transferência realizada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null,"Operação cancelada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                   if(c2 == CadContPoupanca.p.getNumero()){
                        Object[] btn= {"Confirmar","Cancelar" };
                        int r = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContPoupanca.p.getNome()+"\nDeseja confirmar a tranferência para "+CadContas.c.getNumero()+"\n", "Confirmação",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,btn,btn[0]);
                        switch(r){
                            case 0:
                                CadContEspecial.e.setSaldo((CadContEspecial.e.getSaldo()-valor)+(CadContEspecial.e.getSaldo()-valor)*CadContEspecial.e.getMulta()*0.01);
                                CadContPoupanca.p.setSaldo(CadContPoupanca.p.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null,"Transferência realizada com sucesso com limite especial");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null,"Operação cancelada com sucesso com limite");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Titular:"+CadContEspecial.e.getNome()+" possui saldo insuficiente!!!");
            } 
          }  
            if(c1 == CadContPoupanca.p.getNumero()){
                if(CadContPoupanca.p.getSaldo()>=valor){
                    if(c2 == CadContas.c.getNumero()){
                       Object[] btn = {"Confirmar","Cancelar" };
                        int res= JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContPoupanca.p.getNome()+"\nDeseja realizar a transferêcia para "+CadContas.c.getNumero()+"\n","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);
                        switch(res){
                            case 0:
                                CadContPoupanca.p.setSaldo(CadContPoupanca.p.getSaldo() - valor);
                                CadContas.c.setSaldo(CadContas.c.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null, "Transferência realizada");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null, "Operação cancelada");
                                this.setVisible(false);
                                dispose();
                                break;
                        }
                    }
                     if(c2 == CadContEspecial.e.getNumero()){
                        Object[] btn = {"Confirmar","Cancelar" };
                        int res = JOptionPane.showOptionDialog(null,"Senhor(a) "+CadContPoupanca.p.getNome()+"\nDeseja confirmar a transferência para "+CadContas.c.getNumero()+"\n","Confirmação",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);
                        switch(res){
                            case 0:
                                CadContPoupanca.p.setSaldo(CadContPoupanca.p.getSaldo() - valor);
                                CadContEspecial.e.setSaldo(CadContEspecial.e.getSaldo() + valor);
                                JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                            case 1:    
                                JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso");
                                this.setVisible(false);
                                dispose();
                                break;
                          }
                    }
                }else{
                   JOptionPane.showMessageDialog(null,"Titular:"+CadContPoupanca.p.getNome()+" possui saldo insuficiente!!!"); 
                }          
            }
        }
      }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
