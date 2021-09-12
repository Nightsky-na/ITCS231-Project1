public class Ticket {
    Theatre theatre;
    Movie movie;
    ShowTime showTime;
    Seat seat;

    // O(1)
    public Ticket(Theatre theatre,ShowTime showTime, Seat seat){
        this.theatre = theatre;
        this.showTime = showTime;
        this.seat = seat;
        this.movie = theatre.movie;
    }
    //O(1)
    public String toString(){
        return this.theatre.toString()+"\n"+this.showTime.toString()+
                "\n"+seat.toString();
    }
}
