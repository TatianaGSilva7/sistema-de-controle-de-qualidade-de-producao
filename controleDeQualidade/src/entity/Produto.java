package entity;

public class Produto {
    private String codigo;
    private String nome;
    private String lote;
    private boolean estaAprovado;

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

    public String getDetalhes() {
        return codigo + " - " + nome + " (Lote: " + lote + ")";
    }

    public void inspecionarQualidade() {

    }

    public boolean isEstaAprovado() {
        return estaAprovado;
    }

    public void setEstaAprovado(boolean estaAprovado) {
        this.estaAprovado = estaAprovado;
    }

}
