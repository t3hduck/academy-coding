public class Penna extends Articolo{
    private String colore;

    //costruttore
    public Penna (String marca, String modello, double costo, String colore) {
        super(marca, modello, costo);
        this.colore = colore;
    }

    //override getPrezzo
    @Override
    public double getPrezzo() {
        costo = costo * 3;
        return costo;
    }

    //getter e setter
    public String getColore(){
        return colore;
    }
    public void setColore(){
        this.colore = colore;
    }
}
