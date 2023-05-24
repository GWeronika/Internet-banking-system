/**
 * PrzelewWewnetrzny dziedziczy po klasie abstrakcyjnej Transakcja.
 */
public class PrzelewWewnetrzny extends Transakcja {
    public PrzelewWewnetrzny(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
    }
}
