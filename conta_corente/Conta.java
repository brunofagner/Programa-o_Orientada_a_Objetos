public class Conta{
  String userName;
  int accountNumber;
  double balance = 0;
  String cpf;
  int agency;

  void setDados(String _userName, int _accountNumber, String _cpf, int _agency){
    this.userName = _userName;
    this.accountNumber = _accountNumber;
    this.cpf = _cpf;
    this.agency = _agency;
  }
  void getDados(){
    System.out.println(userName);
    System.out.println(accountNumber);
    System.out.println(balance);
    System.out.println(cpf);
    System.out.println(agency);
  }
  void depositar(double deposited){
    balance += deposited;
    System.out.println("Depositou " +deposited+ ", saldo atual:"+ balance);
  }
  void sacar(double valor){
    if(valor > balance){
      System.out.println("Saldo insuficiente!");
    }else{
      balance -= valor;
    }
  }
  void tranferir(int request, double value){
    if(request == 0){
      balance += value;
    }else{
      balance -= value;
    }
  }
} 