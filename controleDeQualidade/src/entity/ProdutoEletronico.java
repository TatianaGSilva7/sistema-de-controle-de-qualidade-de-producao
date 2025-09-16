package entity;

public class ProdutoEletronico extends Produto{

    private String tensao;
    private boolean existeTensao;
    

    
    public ProdutoEletronico() {
    }
    public ProdutoEletronico(String codigo, String nome, String lote) {
        super(codigo, nome, lote);
    }
    public ProdutoEletronico(String tensao) {
        this.tensao = tensao;
 
    }
    public ProdutoEletronico(String codigo, String nome, String lote, String tensao) {
        super(codigo, nome, lote);
        this.tensao = tensao;
    }
    public String getTensao() {
        return tensao;
    }
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }
    public boolean isExisteTensao() {
        return existeTensao;
    }
    public void setExisteTensao(boolean existeTensao) {
        this.existeTensao = existeTensao;
    }
       
}
