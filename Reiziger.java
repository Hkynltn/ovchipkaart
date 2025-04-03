package OvChipkaart;

public class Reiziger {
    private String naam;
    private String geboortedatum;
    private OvChipkaart ovChipkaart;

    // Constructor
    public Reiziger(String naam, String geboortedatum, OvChipkaart ovChipkaart) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
        this.ovChipkaart = ovChipkaart;
    }

    // Getter voor naam
    public String getNaam() {
        return naam;
    }

    // Getter voor geboortedatum
    public String getGeboortedatum() {
        return geboortedatum;
    }

    // Getter voor de OV-chipkaart
    public OvChipkaart getOvChipkaart() {
        return ovChipkaart;
    }

    // Zet een nieuwe OV-chipkaart voor de reiziger
    public void setOvChipkaart(OvChipkaart ovChipkaart) {
        this.ovChipkaart = ovChipkaart;
    }
}
