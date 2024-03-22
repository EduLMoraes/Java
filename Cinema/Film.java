public class Film {
    private String title;
    private int time;
    private MovieTheater room;

    public Film(){}
    public Film(String title, int time, MovieTheater room){
        this.title = title;
        this.room = room;
        this.time = time;
    }

    public MovieTheater getRoom() {
        return this.room;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setRoom(MovieTheater room) {
        this.room = room;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
}
