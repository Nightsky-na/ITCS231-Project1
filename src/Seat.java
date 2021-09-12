public class Seat {
    //instance variable
    String Seat_ID;
    boolean seatStatus; // True if seat had Reserve

    //constructor
    //O(1)
    public Seat(String Seat_ID){
        this.Seat_ID = Seat_ID;
        this.seatStatus = false;
    }
    //O(1)
    public String toString(){
        return "Seat_ID: "+ this.Seat_ID;
    }

    //O(1)
    public void reserveSeat(boolean reserve){
        this.seatStatus = reserve;
    }

    //O(1)
    public String getSeat_ID() {
        return Seat_ID;
    }

    //O(1)
    public boolean isSeatStatus() {
        return seatStatus;
    }

}
