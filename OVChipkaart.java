package OvChipkaart;

public class OVChipkaart {
    private int saldo;
    private boolean ingecheckt;

    public OVChipkaart() {
        this.saldo = 0;
        this.ingecheckt = false;
    }

    public int getSaldo() {
        return saldo;
    }

    public void voegSaldoToe(int bedrag) {
        saldo += bedrag;
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }

    public boolean inchecken() {
        if (saldo >= 5) {
            ingecheckt = true;
            System.out.println("Je bent ingecheckt.");
            return true;
        } else {
            System.out.println("Saldo te laag om in te checken.");
            return false;
        }
    }

    public void uitchecken() {
        if (ingecheckt) {
            System.out.println("Je bent uitgecheckt.");
            ingecheckt = false;
        } else {
            System.out.println("Je was niet ingecheckt.");
        }
    }
}