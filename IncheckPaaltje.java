package OvChipkaart;

public class IncheckPaaltje {
    private String locatie;

    public IncheckPaaltje(String locatie) {
        this.locatie = locatie;
    }

    public void inchecken(OVChipkaart kaart) {
        if (kaart.inchecken()) {
            System.out.println("Kaart succesvol ingecheckt bij " + locatie);
        }
    }

    public void uitchecken(OVChipkaart kaart) {
        kaart.uitchecken();
        System.out.println("Kaart succesvol uitgecheckt bij " + locatie);
    }
}
