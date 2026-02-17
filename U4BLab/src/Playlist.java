import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Playlist {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private final String header = String.format("%-25s %-30s %-35s %-37s %-40s %-42s", "Title", "Artist", "Album", "Sales (Million)", "Year", "Genre") + "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
    public String toString(boolean useHeader){
        String ret = "";
        if (useHeader){
            ret += header;
        }
        for (int i = 0; i < songs.size(); i++){
            ret += "\n" + songs.get(i).toString();
        }
        return ret;
    }
    public Playlist(ArrayList<Song> songs){
        this.songs = songs;
    }

    public void sortArtistAZ(){

    }
    public void sortArtistZA(){

    }
    public void sortYearON(){

    }
    public void sortYearNO(){

    }
    public Playlist searchGenre(String target){
        Playlist tempSongs = new Playlist(songs);
        for (int i = 0; i < songs.size(); i++){
            if (!songs.get(i).getGenre().toUpperCase().equals(target)){
                tempSongs.Remove(i);
                i--;
            }
        }
        return tempSongs;
    }

    public void Remove(int i){
        this.songs.remove(i);
    }
    public void displayAll(){
        System.out.println(songs.toString());
    }
}
