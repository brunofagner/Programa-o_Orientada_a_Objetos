package Contas;
import Pessoas.*;

public abstract class Conta{
  private Pessoa titular;
  private int accountNumber;
  protected double balance;
  private int agency;

  //construtor
  public Conta(Pessoa titular, int accountNumber, int agency){
    this.titular = titular;
    this.accountNumber = accountNumber;
    this.agency = agency;
    this.balance = 0.0;
  }
  public void getDados(){
    System.out.println(titular.getNome());
    System.out.println(accountNumber);
    System.out.println(agency);
    System.out.println(balance);
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
  //Logica para deposito
  public boolean depositar(double deposited){
    if (deposited > 0) {
      this.balance += deposited;
      return true;
    }
    return false;
  }

  public void extrato(){
    System.out.println("<<=====Dados da conta=====>>");
    getDados();
    System.out.println("============================");
  }
  public abstract boolean sacar(double valor);
  
  public abstract boolean tranferir(double value, Conta conta);
} 