/**
 * Klasa KredytInwestycyjny dziedziczy po klasie abstrakcyjnej Kredyt
 * Klasa posiada dodatkowo zmienna typu wyliczeniowego enum, ktora pokazuje sposoby zabezpieczenia kredytu
 */
public class KredytInwestycyjny extends Kredyt {
    enum Zabezpieczenie {
        wekselInBlanco,
        blokadaRachunku,
        wpisDoHipoteki,
        nieruchomosc,
        cesjaWierzytelnosci
    }
    Zabezpieczenie wybor;
    String biznesplan;

    public KredytInwestycyjny (int kwota, String okresKredyt, String terminSplaty, Zabezpieczenie zabezpieczenieK, String biznesplan) {
        super(kwota, okresKredyt, terminSplaty);
        this.wybor = zabezpieczenieK;
        this.biznesplan = biznesplan;
    }
}
