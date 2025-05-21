public class Penna extends Articolo{
    private String colore;

    public Penna (String marca, String modello, double costo, String colore) {
        super(marca, modello, costo);
        this.colore = colore;
    }

    @Override
    public double calcolaPrezzo() {
        return super.getCosto() * 3;
    }

}
