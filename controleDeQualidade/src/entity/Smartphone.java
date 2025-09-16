package entity;

public class Smartphone extends ProdutoEletronico{
    private String capacidadeDaBateria;
    private boolean conectividade5G;

    
    public Smartphone() {
    }
    public Smartphone(String codigo, String nome, String lote, String capacidadeDaBateria, boolean conectividade5g) {
        super(codigo, nome, lote);
        this.capacidadeDaBateria = capacidadeDaBateria;
        conectividade5G = conectividade5g;
    }

    public Smartphone(String tensao, String capacidadeDaBateria, boolean conectividade5g) {
        super(tensao);
        this.capacidadeDaBateria = capacidadeDaBateria;
        conectividade5G = conectividade5g;
    }

    public Smartphone(String codigo, String nome, String lote, String tensao, String capacidadeDaBateria,
            boolean conectividade5g) {
        super(codigo, nome, lote, tensao);
        this.capacidadeDaBateria = capacidadeDaBateria;
        conectividade5G = conectividade5g;
    }




    public Smartphone(String capacidadeDaBateria, boolean conectividade5g) {
        this.capacidadeDaBateria = capacidadeDaBateria;
        conectividade5G = conectividade5g;
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


    public void setConectividade5G(boolean conectividade5g) {
        conectividade5G = conectividade5g;
    }
    public boolean testarBateria(boolean valor){
        return valor;
    }


    @Override
    public void inspecionarQualidade() {
        if(this.isConectividade5G() && this.testarBateria(true) && super.isExisteTensao()){
            setEstaAprovado(true);
        }
        else{
            setEstaAprovado(false);
        }
        
}
}
