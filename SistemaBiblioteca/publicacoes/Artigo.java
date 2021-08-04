package publicacoes;

import autores.*;
import java.util.Date;
import java.util.ArrayList;

public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(Date DataPublicacao, String titulo, ArrayList<Publicacao> pubs, ArrayList<Autores> autores, String resumo, double multa){
        super(DataPublicacao, titulo, pubs, autores, multa);
        this.resumo = resumo;
        this.setLimiteDias(2);
    }
    
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getResumo() {
        return resumo;
    }
}
