package publicacoes;

import autores.*;
import java.util.Date;
import java.util.ArrayList;
public class Livro extends Publicacao{
    private int edicao;
    private String editora;
    private String ISBN;
    public Livro(Date DataPublicacao, String titulo, ArrayList<Publicacao> pubs, ArrayList<Autores> autores,
    int edicao, String editora, String ISBN, double multa){
        super(DataPublicacao, titulo, pubs, autores, multa);
        this.edicao = edicao;
        this.editora = editora;
        this.ISBN = ISBN;
        setLimiteDias(9);
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public int getEdicao() {
        return edicao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getISBN() {
        return ISBN;
    }
}
