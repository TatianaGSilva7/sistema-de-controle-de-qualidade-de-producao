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

}
