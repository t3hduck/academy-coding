public class Penna extends Articolo{
    private String colore;

    //costruttore
    public Penna (String marca, String modello, double costo, String colore) {
        super(marca, modello, costo);
        this.colore = colore;
    }

    //override calcolaPrezzo
    public double calcolaPrezzo() {
        double costopenna;
        costopenna = super.getCosto() * 3;
        return costopenna;
    }

    //getter e setter
    public String getColore(){
        return colore;
    }
    public void setColore(){
        this.colore = colore;
    }
}
