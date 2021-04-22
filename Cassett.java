/**
 * @author Rachael Stokes
 */
import java.util.*;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    int currentIndex; //index of the current song

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        currentIndex = 0;
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String play() {
        if (currentIndex > songs.size()) {
            return "At the end of the cassett you need to rewind";
        }
        currentIndex++;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    public String rewind() {
        if (currentIndex == 0) {
            return "Fully Re-Wound";
        }
        currentIndex--;
        return "Rewinding to "+(currentIndex+1);
    }

    public String ffwd() {
        if (currentIndex == songs.size()) {
            return "At the end of cassett you need to rewind";
        }
        currentIndex++;
        if (currentIndex == songs.size()) {
            return "Forwarded to the end of cassett";
        }
        return "Forwarding to song "+(currentIndex+1);
    }

    public String pause() {
        return "pausing";
    }

    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}
