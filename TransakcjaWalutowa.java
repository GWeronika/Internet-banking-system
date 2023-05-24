/**
 * TransakcjaWalutowa dziedziczy po klasie abstrakcyjnej Transakcja.
 * Posiada takze dodatkowe pole waluta.
 */
public class TransakcjaWalutowa extends Transakcja {
    String waluta;
    public TransakcjaWalutowa(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul, String waluta) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
        this.waluta = waluta;
    }
}
