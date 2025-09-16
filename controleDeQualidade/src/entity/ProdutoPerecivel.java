package entity;

public class ProdutoPerecivel  extends ProdutoAlimenticio{
    private String temperaturaArmazenamento;
    private String temperaturaMax;
    private String temperaturaMin;

    
    public ProdutoPerecivel() {
    }

    public ProdutoPerecivel(String temperaturaArmazenamento, String temperaturaMax, String temperaturaMin) {
        this.temperaturaArmazenamento = temperaturaArmazenamento;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public String getTemperaturaArmazenamento() {
        return temperaturaArmazenamento;
    }

    public void setTemperaturaArmazenamento(String temperaturaArmazenamento) {
        this.temperaturaArmazenamento = temperaturaArmazenamento;
    }

    public String getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(String temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public String getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(String temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public boolean testarTemperatura(String i){
        i = temperaturaArmazenamento;
        if(this.getTemperaturaMax().equals(i) && this.getTemperaturaMin().equals(i)){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void inspecionarQualidade(){
        
    }
}
