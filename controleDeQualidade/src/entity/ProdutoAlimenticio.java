package entity;

public class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    private Boolean embalagemIntegra;

    public ProdutoAlimenticio() {
    }

    public ProdutoAlimenticio(String codigo, String nome, String lote, String dataValidade, Boolean embalagemIntegra) {
        super(codigo, nome, lote);
        this.dataValidade = dataValidade;
        this.embalagemIntegra = embalagemIntegra;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Boolean getEmbalagemIntegra() {
        return embalagemIntegra;
    }

    public void setEmbalagemIntegra(Boolean embalagemIntegra) {
        this.embalagemIntegra = embalagemIntegra;
    }

    public boolean testarEmbalagem() {
        return embalagemIntegra;
    }

    @Override
    public void inspecionarQualidade() {
        setEstaAprovado(testarEmbalagem());
    }
}
