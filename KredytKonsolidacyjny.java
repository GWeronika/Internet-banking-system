/**
 * KredytKonsolidacyjny dziedziczy po klasie Kredyt.
 * Dodaje takze nowe pole: biezaceZadluzenie.
 */

public class KredytKonsolidacyjny extends Kredyt {
    int biezaceZadluzenie;
    public KredytKonsolidacyjny (int kwota, String okresKred, String terminSplaty, int zadluzenie) {
        super(kwota, okresKred, terminSplaty);
        this.biezaceZadluzenie = zadluzenie;
    }
}
