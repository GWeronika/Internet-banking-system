/**
 * abstrakcyjna klasa, ktora jest "kontenerem" dla atrybutow uzywanych w jej podklasach
 */
public abstract class Kredyt {
    int kwota;
    String okresKredytowania;
    String terminSplaty;

    protected Kredyt (int kwota, String okresKredytowania, String terminSplaty) {
        char pierwsza_kropka = terminSplaty.charAt(2), druga_kropka = terminSplaty.charAt(5);
        for(int i=0; i<10; i++) {
            if(i == 2 || i == 5) {
                if(!((pierwsza_kropka == '.') || (druga_kropka == '.')))
                    throw new IllegalArgumentException("Format daty to \"DD.MM.RRRR\"");
            }
            else if(terminSplaty.charAt(i) < 48 || terminSplaty.charAt(i) > 57)
                System.out.println("Data sklada sie z cyfr");
        }

        this.kwota = kwota;
        this.okresKredytowania = okresKredytowania;
        this.terminSplaty = terminSplaty;
    }

    public String toString() {
        return getClass() + ": kwota " + kwota + ", okres kredytowania " + okresKredytowania + ", termin splaty " + terminSplaty + "\n";
    }
}
