/**
 * @author Rachael Stokes
 */
import java.util.*;
public class CD implements DigitalAlbum{
    
    private ArrayList<String> songs = new ArrayList<String>(); //list of the songs in the CD
    int currentIndex; //index of the current song

    /**
     * constructor adds the song parameters to the song list
     * @param song1 songs to add to the list
     * @param song2 
     * @param song3 
     * @param song4 
     * @param song5 
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
        currentIndex = 0;
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * method that increases the index of the current song and prints that it is playing from beginning of the list 
     * @return string playing first song and which song that is 
     */
    public String playFromBeginning() { 
        currentIndex = 0;
        currentIndex++;
        return "Playing song 1: "+songs.get(currentIndex-1);
    }

    /**
     * method to play a certain song based on the song number
     * @param num index of the song to play from the list
     * @return string playing song title, or that it is not a valid song number
     */
    public String playSong(int num) {
        currentIndex = num-1;
        if (currentIndex > songs.size()) {
            return "Not a valid song number";
        }
        currentIndex++;
        return "Playing "+songs.get(currentIndex-1);
    }

    /**
     * method that skips back to the previous song or if it is at the beginning it stays there
     * @return string skipping back and playing whatever song was previous
     */
    public String prevSong() {
        if(currentIndex == 1) {
            return "Skipping back and playing "+songs.get(currentIndex-1);
        }
        currentIndex--;
        return "Skipping back and playing "+songs.get(currentIndex-1);
    }

    /**
     * method that moves the index to the next song 
     * @return string that prints what song it has been moved to 
     */
    public String nextSong() {
        if (currentIndex+1 > songs.size()) {
            currentIndex = 1;
            return "Playing: "+currentIndex+": "+songs.get(currentIndex-1);
        }
        currentIndex++;
        return "Playing: "+currentIndex+": "+songs.get(currentIndex-1);
    }

    /**
     * method that returns string pausing
     * @return string that it is pausing
     */
    public String stop() {
        return "Pausing...";
    }

    /**
     * method that returns string for pause
     * @return string that cd is being stopped and ejected
     */
    public String pause() {
        return "Stopping cassett and ejecting";
    }
    
}