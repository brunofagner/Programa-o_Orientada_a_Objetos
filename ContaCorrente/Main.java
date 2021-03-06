import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    ArrayList<Conta> listaContas = new ArrayList<Conta>();
    Scanner input = new Scanner(System.in);
    boolean existencia = false;
    int option, numeroAuxiliar, agenciaAuxiliar, contaT, contaR;
    double valorSaque, valorDeposito, valorTransferir;
    String nomeAuxiliar, cpfAuxiliar;
    do{
      System.out.println("<<===Bem vindo ao banco Cromz===>>");
      System.out.println("Oque deseja fazer?");
      System.out.println("1-Criar uma conta");
      System.out.println("2-Exibir saldo ou extrato");
      System.out.println("3-Sacar");
      System.out.println("4-Depositar");
      System.out.println("5-Transferir");
      System.out.println("============================");
      option = input.nextInt();
      if (option == 1) {
        System.out.println("Entre com o seu nome:");
        nomeAuxiliar = input.next();
        System.out.println("Entre com o CPF:");
        cpfAuxiliar = input.next();
        // listaPessoas.add(new Pessoa(nomeAuxiliar, cpfAuxiliar));
        System.out.println("Entre com o numero da conta;");
        numeroAuxiliar = input.nextInt();
        System.out.println("Entre com a agencia:");
        agenciaAuxiliar = input.nextInt();
        listaContas.add(new Conta(new Pessoa(nomeAuxiliar, cpfAuxiliar), numeroAuxiliar,
        agenciaAuxiliar));
        System.out.println("Conta Cadastrada com sucesso.");
      }else if (option == 2) {
        System.out.println("Informe o numero da conta:");
        numeroAuxiliar = input.nextInt();
        for (Conta conta : listaContas) {
          if(conta.getAccountNumber() == numeroAuxiliar){
            conta.extrato();
            existencia = true;
          }
        }
        if (!existencia) {
          System.out.println("Conta inexistente!!");
        }
        existencia = false;
      }else if (option == 3)  {
        System.out.println("Informe o numero da conta:");
        numeroAuxiliar = input.nextInt();
        for (Conta conta : listaContas) {
          if(conta.getAccountNumber() == numeroAuxiliar){
            System.out.println("Quanto quer sacar?");
            valorSaque = input.nextDouble();
            if (conta.sacar(valorSaque)) {
              System.out.println("Saque realizado com sucesso!");
            }else{
              System.out.println("Falha ao realizar saque");
            }
            existencia = true;
            break;
          }
        }
        if (!existencia) {
          System.out.println("Conta inexistente");
        }
        existencia = false;
      }else if (option == 4) {
        System.out.println("Informe o numero da conta:");
        numeroAuxiliar = input.nextInt();
        for (Conta conta : listaContas) {
          if(conta.getAccountNumber() == numeroAuxiliar){
            System.out.println("Quanto quer depositar?");
            valorDeposito = input.nextDouble();
            if (conta.depositar(valorDeposito)) {
              System.out.println("Deposito realizado com sucesso!");
            }else{
              System.out.println("Falha ao realizar deposito");
            }
            existencia = true;
            break;
          }
        }
        if (!existencia) {
          System.out.println("Conta inexistente");
        }
        existencia = false;
      }else if (option == 5) {
        System.out.println("Informe o numero da conta que enviara:");
        contaT = input.nextInt();
        for (Conta conta : listaContas) {
          if(conta.getAccountNumber() == contaT){
            System.out.println("Informe o numero da conta que recebera:");
            contaR = input.nextInt();
            System.out.println("Entre com o valor da transferencia: ");
            valorTransferir = input.nextDouble();
            for (Conta conta2 : listaContas) {
              if(conta2.getAccountNumber() == contaR){
                System.out.println("Texte01 "+ conta2.getAccountNumber());
                System.out.println("Texte02 "+ contaR);
                conta.tranferir(valorTransferir, conta2);
                System.out.println("Transferido com sucesso");
                existencia = true;
              }
            }
            break;
          }
        }
        if (!existencia) {
          System.out.println("Transferencia n??o concluida");
        }
        existencia = false;
      }else{break;}
    }while(true);
    input.close();
    
  }
}