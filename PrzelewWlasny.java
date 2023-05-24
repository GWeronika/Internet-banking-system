/**
 * PrzelewWlasny dziedziczy po klasie abstrakcyjnej Transakcja.
 */
public class PrzelewWlasny extends Transakcja {
    public PrzelewWlasny(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
    }
}
