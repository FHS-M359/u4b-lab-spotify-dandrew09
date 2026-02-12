import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Playlist {
    private ArrayList<Song> songs = new ArrayList<Song>();

    public String toString(){
        String ret = "--------------------------------------------------------------------------------------------------------------------------------------------";
        for (int i = 0; i < songs.size(); i++){
            ret += "\n" + songs.get(i).toString();
        }
        return ret;
    }
}
