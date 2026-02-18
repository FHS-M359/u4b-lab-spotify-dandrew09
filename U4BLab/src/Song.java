public class Song {
    private String title;
    private String artist;
    private String album;
    private int sales;
    private int year;
    private String genre;

    public Song(String title, String artist,String album, int sales, int year, String genre){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.sales = sales;
        this.year = year;
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

    public String toString(){
            return String.format("%-25s %-30s %-35s %-37d %-40d %-42s", title, artist, album, sales, year, genre);
    }

    public int getYear(){
        return this.year;
    }

}


