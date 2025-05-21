import java.util.Scanner;
import java.util.Arrays;

public class Magazzino {
    private Articolo[] articoli;
    private int count = 0;
    private boolean checkError = true;

    public Magazzino(int num_art) {;
        articoli = new Articolo[num_art];
    }

    public boolean isCheckError() {
        return checkError;
    }

    public void aggiungiArticolo(Articolo articolo) {
        if (count < articoli.length) {
            articoli[count++] = articolo;
        } else {
            System.out.println("Magazzino pieno");
        }
    }

    public void stampaArticoli() {
        System.out.println("Articoli in magazzino: ");
        if (articoli.length > 0) {
            for (int i = 0; i < articoli.length; i++) {
                System.out.println("Marca: " + articoli[i].getMarca() + " | Modello: " + articoli[i].getModello() + " | Costo:" + articoli[i].getCosto());
            }
        } else {
            System.out.println("MAGAZZINO VUOTO");
        }
    }

    public double calcolaCostoTotale() {
        double somma = 0;
        for (int i = 0; i < count; i++) {
            somma += articoli[i].getCosto();
        }
        return somma;
    }

    public double calcolaRicavoTotale() {
        double somma = 0;
        for (int i = 0; i < count; i++) {
            somma += articoli[i].calcolaPrezzo();
        }
        return somma;
    }

    public Articolo[] rimuoviArticolo() throws NegativeArraySizeException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero di articoli da rimuovere: ");
        int removeIndex = Integer.valueOf(scan.nextLine());
            if (removeIndex < articoli.length) {
                checkError = false;
                throw new NegativeArraySizeException("Non puoi rimuovere più articoli di quelli esistenti");
            }
        articoli = Arrays.copyOf(articoli, articoli.length - removeIndex);
        return articoli;
    }

}
