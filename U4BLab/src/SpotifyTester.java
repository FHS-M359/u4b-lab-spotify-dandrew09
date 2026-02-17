import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Song> songs = new ArrayList<Song>();
        Scanner scanner = new Scanner(new File("spotify_unique_years_artists.txt"));
        Scanner user = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String unSplit = scanner.nextLine();
            String[] argList = unSplit.split(",");
            songs.add(new Song(argList[0], argList[1], argList[2], Integer.parseInt(argList[3]), Integer.parseInt(argList[4]), argList[5]));
        }
        System.out.println("=== Spotify Menu === \n1. Sort by Artist (A -> Z) \n2. Sort by Artist (Z -> A) \n3. Sort by year (Oldest -> Newest) \n4. Sort by year (Newest -> Oldest) \n5. Search by Genre \n6. Display all songs \n7. Quit");
        System.out.println("User Choice (1-7):");
        boolean validInput = false;
        int userChoice = -1;
        while (!validInput) {
            try {
                userChoice = user.nextInt();
                if (userChoice < 1 || userChoice > 7) {
                    System.out.println("Please enter a number between 1 and 10.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid Input! Please enter numbers only.");
                user.nextLine(); //Required so it doesn't pick up the enter key afterward.
            }
        }
        if (userChoice == 6){
            Playlist playlist = new Playlist(songs);
            System.out.println(playlist.toString(true));
        }
    }

}
