//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino(2);
        magazzino.aggiungiArticolo(new Penna("Bic", "Cristal", 0.5F, "blu"));
        magazzino.aggiungiArticolo(new Gomma("Faber-Castell", "Gomma Buona", 2, "2cm", "rettangolare"));
        magazzino.stampaArticoli();
        System.out.println("Costo totale:" + magazzino.calcolaCostoTotale());
        System.out.println("Ricavo totale:" + magazzino.calcolaRicavoTotale());
    }
}