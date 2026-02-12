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

    public String toString(){
            return String.format("%-21s %-30s %-20s %-23d %-27d %-30s", title, artist, album, sales, year, genre);}
    }

