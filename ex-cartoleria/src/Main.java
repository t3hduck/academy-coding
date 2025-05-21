public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino(3);

            Penna penna1 = new Penna("Stabilo","fine",0.5, "rosso");
            Gomma gomma1 = new Gomma("Stadler","doublegomma",1.4, "4cm","rettangolare");
            Penna penna2 = new Penna("Bic","stilo",0.8, "nero");

                magazzino.aggiungiArticolo(penna1);
                magazzino.aggiungiArticolo(gomma1);
                magazzino.aggiungiArticolo(penna2);

                    magazzino.stampaArticoli();

                    System.out.println("Costo Totale:"+magazzino.calcolaCostoTotale());
                    System.out.println("Ricavo Totale:"+ magazzino.calcolaRicavoTotale());
                do {
                    try {
                        magazzino.rimuoviArticolo();
                    } catch (NegativeArraySizeException e) {
                        System.out.println("Errore");
                    }
                } while (magazzino.isCheckError());

                        System.out.println("NUOVO MAGAZZINO");
                        magazzino.stampaArticoli();

    }
}