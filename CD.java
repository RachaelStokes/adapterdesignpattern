/**
 * @author Rachael Stokes
 */
import java.util.*;
public class CD implements DigitalAlbum{
    
    private ArrayList<String> songs = new ArrayList<String>();
    int currSong = 0; //index of the current song

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning() { //??????
        currSong++;
        return "Playing song 1: "+songs.get(0);
    }

    public String playSong(int num) {
        if (currSong > songs.size()) {
            return "Not a valid song number";
        }
        currSong++;
        return "Playing "+songs.get(currSong-1);
    }

    public String prevSong() {
        if(currSong == 0) {
            return "Skipping back and playing "+songs.get(currSong);
        }
        currSong--;
        return "Skipping back and playing "+songs.get(currSong-1);
    }

    public String nextSong() {
        if (currSong+1 > songs.size()) {
            currSong = 1;
            return "Playing: "+currSong+": "+songs.get(currSong-1);
        }
        currSong++;
        return "Playing: "+currSong+": "+songs.get(currSong-1);
    }

    public String stop() {
        return "Pausing...";
    }

    public String pause() {
        return "Stopping cassett and ejecting";
    }
    
}