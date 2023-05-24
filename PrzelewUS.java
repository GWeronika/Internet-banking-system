/**
 * PrzelewUS dziedziczy po klasie abstrakcyjnej Transakcja.
 * Posiada takze dodatkowe pole NIP.
 */
public class PrzelewUS extends Transakcja {
    long NIP;
    public PrzelewUS(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul, long nrNIP) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
        this.NIP = nrNIP;
    }
}
