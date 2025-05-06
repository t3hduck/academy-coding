public class Gomma extends Articolo{
    private String dimensione;
    private String forma;

    public Gomma(String marca, String modello, double costo, String dimensione, String forma){
        super(marca, modello, costo);
        this.dimensione = dimensione;
        this.forma = forma;
    }

    //override
    public double getPrezzo(){
        costo = costo * 2;
        return costo;
    }
    // Getter e setter
    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

}
