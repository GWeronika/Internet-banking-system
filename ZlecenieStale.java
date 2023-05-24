/**
 * ZlecenieStale dziedziczy po klasie abstrakcyjnej Transakcja.
 * Posiada takze dodatkowe pole cyklicznosc.
 */
public class ZlecenieStale extends Transakcja {
    String cyklicznosc;
    public ZlecenieStale(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul, String cyklicznosc) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
        this.cyklicznosc = cyklicznosc;
    }
}
