/**
 * Klasa PrzelewZewnetrzny dziedziczy po klasie abstrakcyjnej Transakcja.
 * Posiada ona dodatkowo zmienna typu wyliczeniowego enum, ktora pokazuje rodzaje sesji Elixir.
 * Sesji Elixir uzywa sie wlasnie przy przelewach zewnetrznych.
 */
public class PrzelewZewnetrzny extends Transakcja {
    enum sesjaElixir {
        I,
        II,
        III
    }
    sesjaElixir ktoraSesja;
    public PrzelewZewnetrzny(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul, sesjaElixir wybor) {
        super(dataPrzelewu, nrRachunkuOdbiorcy, kwota, nrRachunkuZleceniodawcy, tytul);
        this.ktoraSesja = wybor;
    }
}
