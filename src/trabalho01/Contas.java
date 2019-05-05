
package trabalho01;

/**
 *
 * @author henri
 */
public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    void depositar(double valor){
        this.saldo=this.saldo+valor;
    }       
    boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return(true);
        }
        else{
            return false;
      }
    }
    public void transferir(Contas conta, double valor) {
        if(valor <= this.getSaldo()) {
            this.saldo -= valor;
            conta.saldo += valor;
        }
    }
    public String tipoconta(){
         return "conta comum";
    }
}