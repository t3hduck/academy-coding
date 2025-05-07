public abstract class Articolo {
    //attributi. protected o senza modificatore?
    protected String marca;
    protected String modello;
    protected double costo;
    //costruttore per evitare di inizializzare gli attributi nella sottoclasse
    public Articolo(String marca, String modello, double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo  = costo;
    }
    //GETTER e SETTER
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public double getCosto() {
        return costo;
    }
    //metodo astratto per il calcolo del prezzo
    public abstract double calcolaPrezzo();
}
