public class Theatre {
    String theatre_ID;
    Movie movie;

    //O(1)
    public Theatre(String theatre_ID,Movie movie){
        this.theatre_ID = theatre_ID;
        this.movie = movie;
    }

    //O(1)
    public String printMovie(){
        return this.movie.toString() +
                "\n   Theatre: " + this.theatre_ID;
    }

    //O(1)
    public String toString() {
        return this.movie.toString() +
                "\nTheatre: " + this.theatre_ID;
    }

}
