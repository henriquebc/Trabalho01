
package trabalho01;

import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class ContaPoupanca extends Contas {
     private double taxa;
     
    public void setTaxa(double taxa)
    {
        this.taxa = taxa;
    }
        public double getTaxa()
    {
        return this.taxa;
    }  
    public void reajustar(double taxa)

    {
        double reajuste = this.getSaldo()*this.taxa;

        this.setSaldo(this.getSaldo() + reajuste);

        JOptionPane.showMessageDialog(null, "Reajuste Realizado com sucesso!");
    }
    public void reajustar ()

    {
        double reajuste = this.getSaldo()*0.1;
        this.setSaldo(this.getSaldo() + reajuste);
        JOptionPane.showMessageDialog(null, "Reajuste Realizado com a taxa padrão!");
    }
    public String tipoconta(){
         return "conta pounpança";
    }
}
