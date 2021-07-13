package Pessoas;

public class PessoaFisica extends Pessoa{
  private String cpf;
  public PessoaFisica(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
