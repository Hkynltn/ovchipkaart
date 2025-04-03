package OvChipkaart;

import java.util.Scanner;

public class oplaadpunt {
    public static void opwaarderen(OVChipkaart kaart) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Hoeveel wil je opwaarderen?");
            int opwaarderen = input.nextInt();

            // Validatie van het ingevoerde bedrag
            if (opwaarderen <= 0) {
                System.out.println("Het opwaardeerbedrag moet groter dan 0 zijn.");
            } else {
                kaart.voegSaldoToe(opwaarderen);
                System.out.println("Succesvol: je nieuwe saldo is €" + kaart.getSaldo() + "!");
            }
        } catch (Exception e) {
            System.out.println("Ongeldige invoer, probeer het opnieuw.");
        } finally {
            input.close();  // Sluit de scanner om geheugenlekken te voorkomen
        }
    }
}
