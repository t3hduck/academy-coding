public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino(2);
        Penna penna1 = new Penna("Stabilo","fine",0.5, "rosso");
        Gomma gomma1 = new Gomma("Stadler","doublegomma",1.4, "4cm","rettangolare");
        magazzino.aggiungiArticolo(penna1);
        magazzino.aggiungiArticolo(gomma1);
        magazzino.stampaArticoli();
        System.out.println("Costo Totale:"+magazzino.calcolaCostoTotale());
        System.out.println("Ricavo Totale:"+ magazzino.calcolaRicavoTotale());
    }
}