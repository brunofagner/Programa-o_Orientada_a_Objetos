package usuarios;

public class UsuarioComum extends Usuario{
    private int limite = 3;
    public UsuarioComum(String nome, String telefone, String email, String cpf){
        super(nome, telefone, email, cpf);
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }
    public int getLimite() {
        return limite;
    }
}