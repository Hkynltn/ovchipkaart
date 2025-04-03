package OvChipkaart;

import java.util.Date;

public class Reis {
    private Reiziger reiziger;
    private Date incheckTijd;
    private Date uitcheckTijd;
    private double reisKosten;

    // Constructor
    public Reis(Reiziger reiziger, Date incheckTijd) {
        this.reiziger = reiziger;
        this.incheckTijd = incheckTijd;
        this.reisKosten = 4.0; // Standaard prijs voor de reis
    }

    // Methode voor uitchecken
    public void uitchecken(Date uitcheckTijd) {
        this.uitcheckTijd = uitcheckTijd;
        reiziger.getOvChipkaart().uitchecken(); // Uitchecken via de OV-chipkaart
    }

    // Verkrijg de kosten van de reis
    public double getReisKosten() {
        return reisKosten;
    }

    // Verkrijg de duur van de reis
    public long getDuur() {
        if (uitcheckTijd != null) {
            return (uitcheckTijd.getTime() - incheckTijd.getTime()) / 1000; // Duur in seconden
        } else {
            return 0;
        }
    }
}
