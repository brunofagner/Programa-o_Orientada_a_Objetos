package publicacoes;

import autores.*;

import java.util.Date;
import java.util.ArrayList;

public class Tese extends Publicacao{
    private int nroPaginas;
    private String resumo;
    private Date dataDefesa;
    private String instituicao;

    public Tese(Date DataPublicacao, String titulo, ArrayList<Publicacao> pubs, ArrayList<Autores> autores,
    int nroPaginas, String resumo, Date dataDefesa, String instituicao, double multa){
        super(DataPublicacao, titulo, pubs, autores, multa);
        this.nroPaginas = nroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
        setLimiteDias(5);
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getResumo() {
        return resumo;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }
    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public String getInstituicao() {
        return instituicao;
    }
    
}
