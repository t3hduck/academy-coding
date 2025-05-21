public abstract class Articolo {

    private String marca;
    private String modello;
    private double costo;
    private double prezzo;

    public Articolo(String marca, String modello, double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo  = costo;
        this.prezzo = calcolaPrezzo();
    }

    public String getMarca() {
        return marca;
    }

    public double getCosto (){
        return costo;
    }

    public String getModello() {
        return modello;
    }

    public abstract double calcolaPrezzo();
}
