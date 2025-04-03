package OvChipkaart;

public class uitchecken {
    public static void main(String[] args) {
        // Maak een nieuwe OvChipkaart aan met een kaartnummer en saldo
        OvChipkaart mijnKaart = new OvChipkaart(123456, 10.0);
        
        // Probeer in te checken
        if (mijnKaart.inchecken()) {
            System.out.println("Ingecheckt! Huidig saldo: " + mijnKaart.getSaldo());
        }
        
        // Probeer uit te checken
        mijnKaart.uitchecken();
        System.out.println("Uitgecheckt! Huidig saldo: " + mijnKaart.getSaldo());
    }
}
