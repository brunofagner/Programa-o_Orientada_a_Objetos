
public class Main {
  public static void main(String[] args) {

    Conta conta1 = new Conta();
    Conta conta2 = new Conta();
    //Criando as contas
    conta1.setDados("Bruno", 123, "111.111.111-11", 1234);
    conta1.setDados("Chico", 321, "222.222.222-22", 4321);
    //Adquirindo dados da conta
    conta2.getDados();
    //Depositando dinheiro na conta
    conta1.depositar(1000);
    //Sacando dinheiro
    conta1.sacar(100);
    conta1.getDados();
    //Transferindo dados da conta
    conta1.tranferir(1, 100);
    conta2.tranferir(0, 100);
    conta2.getDados();
  }
}
