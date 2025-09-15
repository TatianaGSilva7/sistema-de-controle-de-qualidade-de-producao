package entity;

public class Smartphone extends ProdutoEletronico{
    private String capacidadeDaBateria;
    private boolean conectividade5G;

    
    public Smartphone() {
    }

    public Smartphone(String nome, double preco, String marca, String capacidadeDaBateria, boolean conectividade5G) {
    super(capacidadeDaBateria , conectividade5G); // Chama o construtor da superclasse ProdutoEletronico
    this.capacidadeDaBateria = capacidadeDaBateria;
    this.conectividade5G = conectividade5G;
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


    @Override
public boolean inspecionarQualidade() {
    return conectividade5G && capacidadeDaBateria != null && !capacidadeDaBateria.isEmpty();

    
}
}
