import java.util.ArrayList;
import java.util.Scanner;
import Contas.*;
import Pessoas.*;

public class Programa {
  public static void main(String[] args) {
    ArrayList<Conta> contas = new ArrayList<Conta>();
    Scanner input = new Scanner(System.in);

    /* Facilitar sua vida <3
    contas.add(new ContaCorrente(new PessoaFisica("Cabron", "111.111.111-11"), 111, 123));
    contas.add(new ContaPoupanca(new PessoaFisica("Chico", "222.222.222-22"), 222, 123));
    contas.add(new ContaEspecial(new PessoaFisica("Bel", "333.333.333-33"), 333, 123, 1000));
    contas.add(new ContaEmpresarial(new PessoaJuridica("Chica", "44.444.444/0001-44"),
     444, 123, 1000));
     */
    
    do{
      System.out.println("<<===Bem vindo ao banco Cromz===>>");
      System.out.println("Oque deseja fazer?");
      System.out.println("1-Criar uma conta");
      System.out.println("2-Exibir saldo ou extrato");
      System.out.println("3-Sacar");
      System.out.println("4-Depositar");
      System.out.println("5-Transferir");
      System.out.println("6-Render");
      System.out.println("7-Finalizar");
      System.out.println("============================");
      int option = input.nextInt();

      if (option == 1) {
        System.out.println("Uma conta para:");
        System.out.println("1-Pessoa fisica:");
        System.out.println("2-Pessoa juridica:");
        option = input.nextInt();

        if (option == 1) {
          System.out.println("Qual conta deseja cadastrar:");
          System.out.println("1-Conta Corrente");
          System.out.println("2-Conta Poupança");
          System.out.println("3-Conta Especial");
          option = input.nextInt();

          System.out.println("Entre com o seu nome:");
          String nomeAuxiliar = input.next();
          System.out.println("Entre com o CPF:");
          String cpfAuxiliar = input.next();
          System.out.println("Entre com o numero da conta;");
          int numeroAuxiliar = input.nextInt();
          System.out.println("Entre com a agencia:");
          int agenciaAuxiliar = input.nextInt();
          if (option == 1) {
            contas.add(new ContaCorrente(new PessoaFisica(nomeAuxiliar, cpfAuxiliar), numeroAuxiliar,
            agenciaAuxiliar));
          }else if (option == 2) {
            contas.add(new ContaPoupanca(new PessoaFisica(nomeAuxiliar, cpfAuxiliar), numeroAuxiliar,
            agenciaAuxiliar));
          }else if (option == 3) {
            System.out.println("Entre com o cheque especial:");
            double chequeEspecial = input.nextDouble();
            contas.add(new ContaEspecial(new PessoaFisica(nomeAuxiliar, cpfAuxiliar), numeroAuxiliar,
            agenciaAuxiliar, chequeEspecial));
          }else{
            System.out.println("Opção invalida");
          }
        
        }else if (option == 2) {
          System.out.println("Entre com o seu nome:");
          String nomeAuxiliar = input.next();
          System.out.println("Entre com o CNPJ:");
          String cnpjAuxiliar = input.next();
          System.out.println("Entre com o numero da conta;");
          int numeroAuxiliar = input.nextInt();
          System.out.println("Entre com a agencia:");
          int agenciaAuxiliar = input.nextInt();
          System.out.println("Entre com o cheque especial:");
          double chequeEspecial = input.nextDouble();
          contas.add(new ContaEmpresarial(new PessoaJuridica(nomeAuxiliar, cnpjAuxiliar), numeroAuxiliar,
          agenciaAuxiliar, chequeEspecial));
          System.out.println("Conta Cadastrada com sucesso.");
        } else {
          System.out.println("Opção invalida!!");
        }
      }else if (option == 2) {
        Conta contaSelecionada = selecionarConta(contas);
        if (contaSelecionada != null) {
          System.out.println("<<<<< Dados da Conta >>>>>");
          System.out.println("Nome titular: "+contaSelecionada.getTitular().getNome());
          System.out.println("Número conta: "+contaSelecionada.getAccountNumber());
          System.out.println("Saldo R$"+contaSelecionada.getBalance());
          System.out.println("==========================\n\n");
        }else{
          System.out.println("Conta não encontrada. Tente novamente!");
       }
      }else if(option == 3){
        Conta contaSelecionada = (ContaPoupanca) selecionarConta(contas);
        if(contaSelecionada != null){
           System.out.println("Digite o valor do saque: ");
           double valor = input.nextDouble();
           boolean retorno = contaSelecionada.sacar(valor);
           if(retorno){
              System.out.println("Saque realizado com sucesso!");
           }else{
              System.out.println("Erro ao realizar o saque.");
           }
        }else{
           System.out.println("Conta não encontrada. Tente novamente!");
        }
     }else if(option == 4){
      Conta contaSelecionada = selecionarConta(contas);
      if(contaSelecionada != null){
         System.out.println("Digite o valor do deposito: ");
         double valor = input.nextDouble();
         boolean retorno = contaSelecionada.depositar(valor);
         if(retorno){
            System.out.println("Deposito realizado com sucesso!");
         }else{
            System.out.println("Erro ao realizar o deposito.");
         }
      }else{
         System.out.println("Conta não encontrada. Tente novamente!");
      }
   }else if(option == 5){
    Conta c1 = selecionarConta(contas);
    if(c1 != null){
       Conta c2 = selecionarConta(contas);
       if(c2 != null){
          System.out.println("Digite o valor da transferência: ");
          double valor = input.nextDouble();
          boolean retorno = c1.tranferir(valor, c2);

          if(retorno){
             System.out.println("Transferência realizada com sucesso.");
          }else{
             System.out.println("Erro ao realizar a transferência. Tente novamente.");
          }
       }else{
          System.out.println("Conta C2 não encontrada. Tente novamente.");
       }
    }else{
       System.out.println("Conta C1 não encontrada. Tente novamente.");
    }
 }else if (option == 6) {
    ContaPoupanca c1 = (ContaPoupanca) selecionarConta(contas);
    c1.render();
 }else if (option == 7) {
   System.out.println("Finalizando programa!");
   break;
 }else{
   System.out.println("Opção invalida!!");
 }
    }while(true);
  }

  private static Conta selecionarConta(ArrayList<Conta> contas){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o número da conta: ");
    int nroConta = input.nextInt();

    for(int i=0; i<contas.size(); i++){
       Conta c = contas.get(i);
       if(c.getAccountNumber() == nroConta){
          return c;
       }
    }
    return null;
 }
}
