package OvChipkaart;

public class OvChipkaart {
    private int kaartNummer;  
    private double saldo;     
    private boolean ingecheckt; 

    // Constructor
    public OvChipkaart(int kaartNummer, double saldo) {
        this.kaartNummer = kaartNummer;
        this.saldo = saldo;
        this.ingecheckt = false;
    }

    // Getter voor saldo
    public double getSaldo() {
        return saldo;
    }

    // Zet saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Getter voor ingecheckt status
    public boolean isIngecheckt() {
        return ingecheckt;
    }
    			
    // Zet de ingecheckt status
    public void setIngecheckt(boolean ingecheckt) {
        this.ingecheckt = ingecheckt;
    }

    // Methode voor inchecken
    public boolean inchecken() {
        if (saldo >= 4 && !ingecheckt) { // Controleer of het saldo voldoende is en of de reiziger nog niet ingecheckt is
            saldo -= 4; // Trek 4 euro af
            ingecheckt = true; // Markeer de kaart als ingecheckt
            return true; // Inchecken succesvol
        } else if (saldo < 4) {
            System.out.println("Te weinig saldo. Laad je kaart op.");
            return false; // Inchecken mislukt door te weinig saldo
        } else {
            System.out.println("Je bent al ingecheckt.");
            return false; // Inchecken mislukt omdat de reiziger al ingecheckt is
        }
    }

    // Methode voor uitchecken
    public void uitchecken() {
        if (ingecheckt) {
            ingecheckt = false;
            saldo += 4; // Voeg 4 euro terug aan het saldo toe
        } else {
            System.out.println("Je moet eerst inchecken.");
     
        }
    }
}
