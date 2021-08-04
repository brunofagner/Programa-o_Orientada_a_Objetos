package usuarios;

import java.util.ArrayList;

import publicacoes.Publicacao;

public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private ArrayList<Publicacao> publisImprestadas = new ArrayList<Publicacao>();
    public Usuario(){};
    public Usuario(String nome, String telefone, String email, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void registrarImprestimo(Publicacao pub){
        publisImprestadas.add(pub);
    }
    public ArrayList<Publicacao> getPublisEmprestadas(){
        return publisImprestadas;
    }
}
