import java.util.ArrayList;
import publicacoes.*;
import usuarios.*;
import java.util.Date;

public class Biblioteca{
    private String nome;
    private String endereco;
    private ArrayList<Publicacao> publis = new ArrayList<Publicacao>(); 
    //private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    Biblioteca(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    void novaPublicacao(Publicacao publi){
        publis.add(publi);
    }

    public void emprestimo(UsuarioComum user, Publicacao pub){
        if (user.getLimite() == 0) {
            System.out.println("Limite de renovações atingido!");
        }else{
            if(!pub.getStatus()){
                user.setLimite(user.getLimite() - 1);
                user.registrarImprestimo(pub);
                pub.setRenovacoes(3);
                pub.setStatus(true);
            }else{
                System.out.println("Não disponivel para emprestimo!");
            }
        }
    }

    public void emprestimo(UsuarioEspecial user, Publicacao pub){
        if(!pub.getStatus()){
            Date data = new Date();
            pub.setDataImprestimo(data.getTime());
            user.registrarImprestimo(pub);
            pub.setRenovacoes(5);
            pub.setStatus(true);
        }else{
            System.out.println("Não disponivel para emprestimo!");
        }
    }

    public void renovar(Usuario user, String titulo){
        ArrayList<Publicacao> pubs = user.getPublisEmprestadas();
        for (int i = 0; i < pubs.size(); i++) {
            if (titulo.equals(pubs.get(i).getTitulo())) {
                if (pubs.get(i).getRenovacoes() > 0) {
                    pubs.get(i).setRenovacoes((pubs.get(i).getRenovacoes() - 1));
                    System.out.println("Renovado com sucesso");
                }else{
                    pubs.get(i).setTotalMulta(pubs.get(i).getMulta() + pubs.get(i).getTotalMulta());
                    System.out.println("Renovado com multa");
                }
            }
        }
    }
    
    public void devolução(Usuario user, String titulo){
        ArrayList<Publicacao> pubs = user.getPublisEmprestadas();
        for (int i = 0; i < pubs.size(); i++) {
            if (titulo.equals(pubs.get(i).getTitulo())) {
                Date data = new Date();
                pubs.get(i).setDataEntrega(data.getTime());
                long mili = pubs.get(i).getDataImprestimo() - pubs.get(i).getDataEntrega();
                int dias = (int)(mili/86400000);
                if(dias > pubs.get(i).getLimiteDias()){
                    double calcMulta = (dias-pubs.get(i).getLimiteDias())*pubs.get(i).getMulta();
                    pubs.get(i).setTotalMulta(pubs.get(i).getTotalMulta() + calcMulta);
                }
                pubs.get(i).setStatus(false);
                System.out.println("Multa a ser paga: "+ pubs.get(i).getTotalMulta());
                pubs.get(i).setTotalMulta(0);
                pubs.remove(i);
            } 
        }
    }

}