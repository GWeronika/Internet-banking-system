/**
 * PrzelewZUS dziedziczy po klasie abstrakcyjnej Transakcja.
 * Posiada takze dodatkowe pole NIP.
 */
public class PrzelewZUS extends Transakcja {
    long NIP;
    public PrzelewZUS(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul, long NIP) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
        this.NIP = NIP;
    }
}
