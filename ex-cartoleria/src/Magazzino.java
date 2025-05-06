public class Magazzino {
    private Articolo[] articoli;
    private int count;

    public Magazzino(int count) {
        this.count = count;
    }

    // Caricamento pezzi in magazzino
    public void aggiungiArticolo(Articolo articolo) {
        if (count < articoli.length) {
            articoli[count++] = articolo;
        } else {
            System.out.println("Magazzino pieno");
        }
    }

    // Stampa articoli presenti
    public void stampaArticoli() {
        System.out.println("Articoli in magazzino:");
        for (int i = 0; i < count; i++) {
            System.out.println(articoli[i]);
        }
    }

    // Calcola costo totale
    public float calcolaCostoTotale() {
        float somma = 0;
        for (int i = 0; i < count; i++) {
            somma += articoli[i].getCosto();
        }
        return somma;
    }

    // Calcola ricavo totale
    public double calcolaRicavoTotale() {
        double somma = 0;
        for (int i = 0; i < count; i++) {
            somma += articoli[i].getPrezzo();
        }
        return somma;
    }

}
