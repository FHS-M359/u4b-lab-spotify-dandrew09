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

    public Playlist sortArtistAZ(){
        Playlist tempSongs = new Playlist(songs);
        for (int i = 0; i < tempSongs.songs.size(); i++){
            int minIndex = i;

            for (int j = i + 1; j < tempSongs.songs.size(); j++){
                if (tempSongs.songs.get(minIndex).getArtist().toUpperCase().compareTo(tempSongs.songs.get(j).getArtist().toUpperCase()) > 0){
                    minIndex = j;
                }
            }
            String temp = tempSongs.songs.get(i).getArtist();
            tempSongs.songs.get(i).setArtist(tempSongs.songs.get(minIndex).getArtist());
            tempSongs.songs.get(minIndex).setArtist(temp);
        }
        return tempSongs;
    }
    public Playlist sortArtistZA(){
        Playlist tempSongs = new Playlist(songs);
        for (int i = 0; i < tempSongs.songs.size(); i++){
            int minIndex = i;

            for (int j = i + 1; j < tempSongs.songs.size(); j++){
                if (tempSongs.songs.get(minIndex).getArtist().toUpperCase().compareTo(tempSongs.songs.get(j).getArtist().toUpperCase()) < 0){
                    minIndex = j;
                }
            }
            String temp = tempSongs.songs.get(i).getArtist();
            tempSongs.songs.get(i).setArtist(tempSongs.songs.get(minIndex).getArtist());
            tempSongs.songs.get(minIndex).setArtist(temp);
        }
        return tempSongs;
    }
    public Playlist sortYearON(){
        /*Playlist tempSongs = new Playlist(songs);
        for (int i = 0; i < tempSongs.songs.size(); i++){
            int minIndex = i;

            for (int j = i + 1; j < tempSongs.songs.size(); j++){
                if (tempSongs.songs.get(minIndex).getYear() > tempSongs.songs.get(j).getYear()){
                    minIndex = j;
                }
            }
            int temp = tempSongs.songs.get(i).getYear();
            tempSongs.songs.get(i).setYear(tempSongs.songs.get(minIndex).getYear());
            tempSongs.songs.get(minIndex).setYear(temp);
        }
        return tempSongs;*/
        Playlist tempSongs = new Playlist(songs);
           for (int i = 1; i< tempSongs.songs.size(); i++){
                int tempVal = tempSongs.songs.get(i).getYear();
                int position = i;

                while(position > 0 && tempSongs.songs.get(position - 1).getYear()> tempVal){
                    tempSongs.songs.get(position).setYear(tempSongs.songs.get(position-1).getYear());
                    position--;
                }
               tempSongs.songs.get(position).setYear(tempVal);
           }


        return tempSongs;


    }

    public Playlist sortYearNO(){
        Playlist tempSongs = new Playlist(songs);
           for (int i = 1; i< tempSongs.songs.size(); i++){
                int tempVal = tempSongs.songs.get(i).getYear();
                int position = i;

                while(position > 0 && tempSongs.songs.get(position - 1).getYear()< tempVal){
                    tempSongs.songs.get(position).setYear(tempSongs.songs.get(position-1).getYear());
                    position--;
                }
               tempSongs.songs.get(position).setYear(tempVal);
           }


        return tempSongs;
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
