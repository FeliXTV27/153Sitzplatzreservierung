import java.util.Scanner;

public class Controller {
    SeatReservation seatReservation = new SeatReservation();
    Guest guest = new Guest();

    public String scan() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void startMenu() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|   Willkommen in der Sitzplatzreservierung            |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Was möchten Sie tun?                                 |");
        System.out.println("| 1) Neuer Gast registrieren                           |");
        System.out.println("| 2) Sitzplatz reservieren                             |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Geben Sie Ihre Auswahl ein! [1/2]                    |");
        System.out.println("+------------------------------------------------------+");
        startMenuSwitch(scan());
    }

    private void startMenuSwitch(String input) {
        switch(input){
            case "1":
                guest.register();
                break;
            case "2":
                seatReservation.makeReservation();
                break;
            default:
                startMenu();
        }
    }
}
