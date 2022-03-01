package model;

public class Pessoa {

    private double peso;
    private int meta;

    public Pessoa() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    //switch é usado em testes de igualdades( int / String)
    public String simularPeso() {
        String novoPeso;
        switch (this.meta) {
            case 1:
                novoPeso = "\nNovo Peso: " + (peso + (peso * 0.15));
                break;
            case 2:
                novoPeso = "\nNovo Peso: " + (peso - (peso * 0.2));
                break;
            default:
                novoPeso = "\nContinue tentando...";
                break;
        }
        return novoPeso;
    }
    public String toString(){
        return "Peso anterior: "+this.peso+" Kg."+
                "\nResultado ↓ ↓"+this.simularPeso()+" Kg";
    }
}
