import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Theatre> theatres = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Theatre selectTheatre;
        ShowTime selectShowTime;
        Seat selectSeat;

        Movie movie1 = new Movie("REMINISCENCE");
        Theatre theatre1 = new Theatre("Theatre_1",movie1);
        theatres.add(theatre1);

        Movie movie2 = new Movie("SPACE JAM A NEW LEGACY");
        Theatre theatre2 = new Theatre("Theatre_2",movie2);
        theatres.add(theatre2);

        Movie movie3 = new Movie("THE CONJURING THE DEVIL MADE ME DO IT");
        Theatre theatre3 = new Theatre("Theatre_3",movie3);
        theatres.add(theatre3);

        while (true){
            System.out.println("--Welcome to Meng's Cinema--");
            System.out.println("Select your movies: ");
            for (int i = 0; i < theatres.size(); i++) {
                System.out.println((i+1) + ": " + theatres.get(i).printMovie());
            }
            System.out.print("Input number of movie: ");
            while (true){
                String movieNo = input.nextLine();
                if (Integer.parseInt(movieNo) > theatres.size()){
                    System.out.print("Please enter number again: ");
                } else {
                    selectTheatre = theatres.get((Integer.parseInt(movieNo)-1));
                    break;
                }
            }
                System.out.println("   "+selectTheatre.printMovie());
                selectTheatre.movie.printShowTimes();
                System.out.print("Please select show time : ");
            while (true){
                String selectedTime = input.nextLine();
                if (Integer.parseInt(selectedTime) > selectTheatre.movie.showTimes.size()){
                    System.out.print("Please enter number again: ");
                } else {
                    selectShowTime = selectTheatre.movie.showTimes.get(Integer.parseInt(selectedTime)-1);
                    System.out.println(selectShowTime.toString());
                    break;
                }
            }
            selectShowTime.printSeat();
            System.out.print("Please select your seat: ");
            while (true){
                String seatNo = input.nextLine();
                if (!(selectShowTime.reserveSeatsTheatre(seatNo))){
                    System.out.print("Please enter number again: ");
                } else {
                    System.out.println("Seat ID : "+ seatNo);
                    selectSeat = selectShowTime.getSelectSeat(seatNo);
                    break;
                }
            }
            //Create Ticket
            Ticket ticket = new Ticket(selectTheatre,selectShowTime,selectSeat);
            tickets.add(ticket);
            System.out.println("""
                    Do you want to buy another ticket?
                    Press A: If you want to reserve another ticket.
                    Press X: If you want exit this program.""");
            String ans = input.nextLine();
            if (ans.equals("X")){
                break;
            }
        }
        System.out.println("====Order Summary====");
        for (int num = 0; num < tickets.size(); num++) {
            System.out.println("Ticket "+(num+1)+" : "+tickets.get(num).toString());
            System.out.println("=====================");
        }
    }
}
