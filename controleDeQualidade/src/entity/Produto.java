package entity;

public class Produto {
    private String codigo;
    private String nome;
    private String lote;

    public Produto() {
    }

    public Produto(String codigo, String nome, String lote) {
        this.codigo = codigo;
        this.nome = nome;
        this.lote = lote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public abstract class produto {
    protected String codigo;
    protected String nome;
    protected String lote;
    protected boolean aprovado;
    protected String motivoReprovacao;

    public produto(String codigo, String nome, String lote) {
        this.codigo = codigo;
        this.nome = nome;
        this.lote = lote;
        this.aprovado = false;
        this.motivoReprovacao = "";
    }

    public abstract void inspecionar();

    public boolean estaAprovado() {
        return aprovado;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getLote() { return lote; }
    public String getMotivoReprovacao() { return motivoReprovacao; }

    public String getDetalhes() {
        return codigo + " - " + nome + " (Lote: " + lote + ")";
    }
}

    public boolean inspecionarQualidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inspecionarQualidade'");
    }

}
