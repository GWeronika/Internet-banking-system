/**
 * SzybkaTransakcja dziedziczy po klasie abstrakcyjnej Transakcja.
 * Posiada takze dodatkowe pole oplata.
 */
public class SzybkaTransakcja extends Transakcja {
    short oplata;
    public SzybkaTransakcja(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul, short oplata) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
        this.oplata = oplata;
    }
}
