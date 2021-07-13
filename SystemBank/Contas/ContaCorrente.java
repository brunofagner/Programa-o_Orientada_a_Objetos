package Contas;
import Pessoas.*;

public class ContaCorrente extends Conta{//Classe Nova

  public ContaCorrente(Pessoa titular, int accountNumber, int agency) {
    super(titular, accountNumber, agency);
     
  }
    //Logica para saque
    public boolean sacar(double valor){
      if(valor > 0 && valor <= this.balance){
         this.balance -= valor;
         return true;
      }
      return false;
   }
    
    //Logica para transferencia 
    public boolean tranferir(double value, Conta conta){
      if(this.sacar(value)){
        conta.depositar(value);
        return true;
      }else{
        return false;
      }
    }
    
}
