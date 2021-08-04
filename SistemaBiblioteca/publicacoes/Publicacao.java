package publicacoes;
import autores.*;


import java.util.Date;
import java.util.ArrayList;


public abstract class Publicacao {
    private Date DataPublicacao;
    private String titulo;
    private boolean status = false; 
    private int renovacoes;
    private double multa;
    private double totalMulta;
    private long dataImprestimo;
    private long dataEntrega;
    private int limiteDias;
    private ArrayList<Publicacao> pubs = new ArrayList<Publicacao>();
    private ArrayList<Autores> autores = new ArrayList<Autores>();

    public Publicacao(){};
    public Publicacao(Date DataPublicacao, String titulo, ArrayList<Publicacao> pubs, ArrayList<Autores> autores, double multa){
        this.DataPublicacao = DataPublicacao;
        this.titulo = titulo;
        this.pubs = pubs;
        this.autores = autores;
        this.multa = multa;
    }

    public void setAutores(Autores autores) {
        this.autores.add(autores);
    }
    public ArrayList<Autores> getAutores() {
        return autores;
    }

    public void setPubs(Publicacao pubs) {
        this.pubs.add(pubs);
    }
    public ArrayList<Publicacao> getPubs() {
        return pubs;
    }
    
    public void setDataPublicacao(Date dataPublicacao) {
        DataPublicacao = dataPublicacao;
    }
    public Date getDataPublicacao() {
        return DataPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }
    public int getRenovacoes() {
        return renovacoes;
    }
    
    public void setDataEntrega(long dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public long getDataEntrega() {
        return dataEntrega;
    }
    
    public void setDataImprestimo(long dataImprestimo) {
        this.dataImprestimo = dataImprestimo;
    }
    public long getDataImprestimo() {
        return dataImprestimo;
    }
    
    public void setMulta(double multa) {
        this.multa = multa;
    }
    public double getMulta() {
        return multa;
    }
    
    public void setTotalMulta(double totalMulta) {
        this.totalMulta = totalMulta;
    }
    public double getTotalMulta() {
        return totalMulta;
    }
    
    public void setLimiteDias(int limiteDias) {
        this.limiteDias = limiteDias;
    }
    public int getLimiteDias() {
        return limiteDias;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }
}
