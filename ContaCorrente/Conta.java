public class Conta{
  private Pessoa titular;
  private int accountNumber;
  private double balance;
  private int agency;

  //construtor
  public Conta(Pessoa titular, int accountNumber, int agency){
    this.titular = titular;
    this.accountNumber = accountNumber;
    this.agency = agency;
    this.balance = 0.0;
  }
  public void getDados(){
    System.out.println(accountNumber);
    System.out.println(balance);
    System.out.println(agency);
  }

  public void setTitular(Pessoa titular){
    this.titular = titular;
  }
  public Pessoa getTitular(){
    return this.titular;
  }

  public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
  }
  public int getAccountNumber(){
    return this.accountNumber;
  }

  public void setAgency(int agency){
    this.agency = agency;
  }
  public int getAgency(){
    return this.agency;
  }
  public double getBalance(){
    return this.balance;
  }

  public boolean depositar(double deposited){
    if (deposited > 0) {
      this.balance += deposited;
      return true;
    }
    return false;
  }

  public boolean sacar(double valor){
    if(valor > 0 && valor <= this.balance){
      balance -= valor;
      return true;
    }else{
      return false;
    }
  }
  
  public boolean tranferir(double value, Conta conta){
    if(this.sacar(value)){
      conta.depositar(value);
      return true;
    }else{
      return false;
    }
  }
  public void extrato(){
    System.out.println("<<=====Dados da conta=====>>");
    System.out.println("Nome titular: " + this.titular.getNome());
    System.out.println("CPF titular: " + this.titular.getCpf());
    System.out.println("Numero da conta: " + this.accountNumber);
    System.out.println("Saldo R$"+ this.balance);
    System.out.println("============================");
  }
} 