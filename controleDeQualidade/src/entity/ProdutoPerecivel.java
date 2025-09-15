package entity;

public class ProdutoPerecivel  extends ProdutoAlimenticio{
    private String temperaturaArmazenamento;
    private String temperatuaMax;
    private String temperaturaMin;

    
    public ProdutoPerecivel() {
    }

    public ProdutoPerecivel(String temperaturaArmazenamento, String temperatuaMax, String temperaturaMin) {
        this.temperaturaArmazenamento = temperaturaArmazenamento;
        this.temperatuaMax = temperatuaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public String getTemperaturaArmazenamento() {
        return temperaturaArmazenamento;
    }

    public void setTemperaturaArmazenamento(String temperaturaArmazenamento) {
        this.temperaturaArmazenamento = temperaturaArmazenamento;
    }

    public String getTemperatuaMax() {
        return temperatuaMax;
    }

    public void setTemperatuaMax(String temperatuaMax) {
        this.temperatuaMax = temperatuaMax;
    }

    public String getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(String temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    @Override
public String toString() {
    return super.toString() +
           ", Temp. Armazenamento: " + temperaturaArmazenamento +
           ", Temp. Máx: " + temperatuaMax +
           ", Temp. Mín: " + temperaturaMin;
}
    
}
