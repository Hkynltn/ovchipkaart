package OvChipkaart;

public class OvChipkaart
{
    // Dit nummer houdt bij hoeveel kaarten er zijn gemaakt
    public static int kaartnummer = 1000;
    
    // Eigenschappen van de OV-chipkaart
    private int kaartNummer;  // Uniek nummer voor elke kaart
    private double saldo;     // Hoeveel geld er op de kaart staat
    private boolean ingecheckt; // Of de kaart is ingecheckt of niet

    // Als je een nieuwe kaart maakt, geef je een startbedrag mee
    public OvChipkaart(double saldo)
    {
        this.kaartNummer = ++kaartnummer; // Elke nieuwe kaart krijgt een nieuw nummer
        this.ingecheckt = false; // De kaart is eerst niet ingecheckt
        this.saldo = saldo; // Zet het startbedrag op de kaart
    }

    // Geeft het kaartnummer terug
    public int getKaartNummer()
    {
        return kaartNummer;
    }

    // Geeft het saldo terug
    public double getSaldo()
    {
        return saldo;
    }

    // Zet een nieuw saldo op de kaart
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    // Geeft terug of de kaart is ingecheckt
    public boolean getIngecheckt()
    {
        return ingecheckt;
    }

    // Zet de status van inchecken aan of uit
    public void setIngecheckt(boolean ingecheckt)
    {
        this.ingecheckt = ingecheckt;
    }

    // Hiermee check je in bij het openbaar vervoer
    public void inchecken()
    {
        if (saldo >= 4) // Controleer of er minimaal 4 euro op de kaart staat
        {
            this.ingecheckt = true; // Zet de kaart op ingecheckt
            saldo -= 4; // Haal 4 euro van het saldo af
        }
        else
        {
            System.out.println("Te weinig saldo. Laad je kaart op."); // Bericht als er te weinig saldo is
        }
    }

    // Hiermee check je uit bij het openbaar vervoer
    public void uitchecken()
    {
        if (ingecheckt) // Controleer of de kaart is ingecheckt
        {
            this.ingecheckt = false; // Zet de kaart op uitgecheckt
            saldo += 4; // Voeg 4 euro terug aan het saldo toe
        }
        else
        {
            System.out.println("Je moet eerst inchecken."); // Bericht als je nog niet was ingecheckt
        }
    }

    // Hiermee voeg je geld toe aan de kaart
    public void toevoegenSaldo(double bedrag)
    {
        if (bedrag > 0) // Controleer of het bedrag positief is
        {
            this.saldo += bedrag; // Voeg het bedrag toe aan het saldo
        }
        else
        {
            System.out.println("Ongeldig bedrag. Vul een positief getal in."); // Bericht bij fout bedrag
        }
    }
}
