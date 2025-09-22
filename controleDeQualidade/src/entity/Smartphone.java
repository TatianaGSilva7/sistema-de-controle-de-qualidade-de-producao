package entity;

public class Smartphone extends ProdutoEletronico {
    private String capacidadeDaBateria;
    private boolean conectividade5G;

    public Smartphone() {
    }

    public Smartphone(String codigo, String nome, String lote, String tensao, String capacidadeDaBateria, boolean conectividade5G) {
        super(codigo, nome, lote, tensao);
        this.capacidadeDaBateria = capacidadeDaBateria;
        this.conectividade5G = conectividade5G;
    }

    public String getCapacidadeDaBateria() {
        return capacidadeDaBateria;
    }

    public void setCapacidadeDaBateria(String capacidadeDaBateria) {
        this.capacidadeDaBateria = capacidadeDaBateria;
    }

    public boolean isConectividade5G() {
        return conectividade5G;
    }

    public void setConectividade5G(boolean conectividade5G) {
        this.conectividade5G = conectividade5G;
    }

    public boolean testarBateria() {
        return capacidadeDaBateria != null && !capacidadeDaBateria.isEmpty();
    }

    @Override
    public void inspecionarQualidade() {
        setEstaAprovado(isConectividade5G() && testarBateria() && super.isExisteTensao());
    }
}
