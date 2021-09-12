import java.util.ArrayList;

public class ShowTime {
    enum Month {January, February, March, April, May,
        June, July, August, September, October, November, December}
    Month month;
    int date;
    int year;
    String time;
    ArrayList<Seat> seats = new ArrayList<>(); //Create seats

    //O(1)
    public ShowTime(String time,int date,Month month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
        this.time = time;
        createSeat();
    }

    //O(n^2)
    public void createSeat(){
        for (char row = 'A'; row < 'N'; ++row) {
            for (int col = 1; col <=10; col++) {
                String seat_ID = Character.toString(row) + Integer.toString(col);
                Seat seat = new Seat(seat_ID);
                seats.add(seat);
            }
        }
    }

    //O(n^2)
    public void printSeat(){
        System.out.println("____________SCREEN____________");
        int count = 0;
        for (int row = 0; row < 13; row++) {
            for (int col = 0; col < 10; col++) {
                if (!(seats.get(count).seatStatus)){
                    System.out.print(seats.get(count).Seat_ID+" ");
                } else {
                    System.out.print("XX ");
                }
                count++;
            }
            System.out.println();
        }
    }

    // O(n)
    public boolean reserveSeatsTheatre(String seat_ID){
        for (Seat seat: seats) {
            if (seat.getSeat_ID().equals(seat_ID) && !seat.isSeatStatus()){
                seat.reserveSeat(true);
                return true;
            }
        }
        return false;
    }

    // O(n)
    public Seat getSelectSeat(String seatID){
        Seat selectSeat;
        for (Seat seat:seats) {
            if (seat.getSeat_ID().equals(seatID)){
                selectSeat = seat;
                return selectSeat;
            }
        }
        return seats.get(0);
    }

    // O(1)
    @Override
    public String toString() {
        return "ShowTime: "+this.time +" Date: "+this.date+"/"+this.month+"/"+this.year;
    }
}
