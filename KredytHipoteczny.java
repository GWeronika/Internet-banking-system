/**
 * KredytHipoteczny dziedziczy po klasie Kredyt.
 * Dodaje takze dwa nowe pola: cel i zdolnoscKredytowa.
 */
public class KredytHipoteczny extends Kredyt {
    String cel;
    String zdolnoscKredytowa;
    public KredytHipoteczny (int kwota, String okresKred, String terminSplaty, String cel, String zdolnoscKredytowa) {
        super(kwota, okresKred, terminSplaty);
        this.cel = cel;
        this.zdolnoscKredytowa = zdolnoscKredytowa;
    }
}
