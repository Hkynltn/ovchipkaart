package OvChipkaart;

public class IncheckPaaltje {
    private String locatie;

    // Constructor
    public IncheckPaaltje(String locatie) {
        this.locatie = locatie;
    }

    // Methode voor inchecken van een reiziger
    public void inchecken(Reiziger reiziger) {
        System.out.println("Probeer in te checken bij " + locatie + "...");
        // Controleer of inchecken succesvol is
        if (reiziger.getOvChipkaart().inchecken()) {
            System.out.println(reiziger.getNaam() + " is succesvol ingecheckt.");
        }
    }

    // Methode voor uitchecken van een reiziger
    public void uitchecken(Reiziger reiziger) {
        reiziger.getOvChipkaart().uitchecken();
        System.out.println(reiziger.getNaam() + " is succesvol uitgecheckt.");
    }
}
