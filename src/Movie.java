import java.util.ArrayList;

public class Movie {
    //instance variable
    String movieName;
    ArrayList<ShowTime> showTimes = new ArrayList<>();

    //constructor
    //O(1)
    public Movie(String movieName){
        this.movieName = movieName;
        ShowTime round1 = new ShowTime("12:00",12, ShowTime.Month.September,2022);
        ShowTime round2 = new ShowTime("15:00",12, ShowTime.Month.September,2022);
        ShowTime round3 = new ShowTime("17:00",12, ShowTime.Month.September,2022);
        ShowTime round4 = new ShowTime("19:00",12, ShowTime.Month.September,2022);
        ShowTime round5 = new ShowTime("21:00",12, ShowTime.Month.September,2022);
        showTimes.add(round1);
        showTimes.add(round2);
        showTimes.add(round3);
        showTimes.add(round4);
        showTimes.add(round5);
    }

    //O(1)
    public String toString(){
        return "Movie: " + this.movieName;
    }

    //O(n)
    public void printShowTimes(){
        int index = 1;
        for (ShowTime round: showTimes) {
            System.out.println("Round "+index+" : "+round.toString());
            index++;
        }
    }

}
