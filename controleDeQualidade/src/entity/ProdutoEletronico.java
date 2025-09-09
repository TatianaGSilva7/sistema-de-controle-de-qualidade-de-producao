package entity;

public class ProdutoEletronico extends Produto{

    private String tensao;
    private boolean aprovadoTeste;

    
    public ProdutoEletronico() {
    }
    public ProdutoEletronico(String codigo, String nome, String lote) {
        super(codigo, nome, lote);
    }
    public ProdutoEletronico(String tensao, boolean aprovadoTeste) {
        this.tensao = tensao;
        this.aprovadoTeste = aprovadoTeste;
    }
    public ProdutoEletronico(String codigo, String nome, String lote, String tensao, boolean aprovadoTeste) {
        super(codigo, nome, lote);
        this.tensao = tensao;
        this.aprovadoTeste = aprovadoTeste;
    }
    public String getTensao() {
        return tensao;
    }
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }
    public boolean isAprovadoTeste() {
        return aprovadoTeste;
    }
    public void setAprovadoTeste(boolean aprovadoTeste) {
        this.aprovadoTeste = aprovadoTeste;
    }

       
}
