package OvChipkaart;

public class uitchecken {
    public static void main(String[] args) {
        // Maak een OVChipkaart aan en zet saldo erop
        OVChipkaart mijnKaart = new OVChipkaart();
        mijnKaart.voegSaldoToe(10); // Voeg saldo toe zodat inchecken mogelijk is

        // Maak een incheckpaaltje aan
        IncheckPaaltje paaltje = new IncheckPaaltje("Station Centraal");

        // Probeer in te checken
        paaltje.inchecken(mijnKaart);

        // Probeer uit te checken
        paaltje.uitchecken(mijnKaart);
    }
}
