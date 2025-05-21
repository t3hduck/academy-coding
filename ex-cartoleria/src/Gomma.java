public class Gomma extends Articolo{
    private String dimensione;
    private String forma;

    public Gomma(String marca, String modello, double costo, String dimensione, String forma){
        super(marca, modello, costo);
        this.dimensione = dimensione;
        this.forma = forma;
    }

    @Override
    public double calcolaPrezzo(){
        return super.getCosto() * 2;
    }

}
