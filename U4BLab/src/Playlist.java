import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Playlist {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private final String header = String.format("%-25s %-30s %-35s %-37s %-40s %-42s", "Title", "Artist", "Album", "Duration", "Year", "Genre") + "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
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
    public Playlist sortYearON(){
        Playlist tempSongs = new Playlist(songs);
        for (int i = 0; i < tempSongs.songs.size(); i++){
            int minIndex = i;

            for (int j = i + 1; j < tempSongs.songs.size(); j++){
                if (tempSongs.songs.get(minIndex).getYear() < tempSongs.songs.get(j).getYear()){
                    minIndex = j;
                }
            }
            int temp = tempSongs.songs.get(i).getYear();
            tempSongs.songs.set(i, tempSongs.songs.get(minIndex).getYear());
            list.size
        }
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
