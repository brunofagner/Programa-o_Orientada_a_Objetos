package Contas;
import Pessoas.*;

public class ContaEmpresarial extends Conta{//Classe nova
  private double chequeEspecial;
  public ContaEmpresarial(Pessoa titular, int accountNumber, int agency, double chequeEspecial) {
    super(titular, accountNumber, agency);
    this.chequeEspecial = chequeEspecial;
  }
    //Logica para saque
    public boolean sacar(double valor){
      if(valor <= (chequeEspecial+balance)){
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
