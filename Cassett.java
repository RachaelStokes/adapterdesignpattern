/**
 * @author Rachael Stokes
 */
import java.util.*;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>(); //list of the songs on the album
    int currentIndex; //index of the current song

    /**
     * constructor method that sets the current song index to 0 and adds the song params to the list
     * @param song1 songs to add to the list
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        currentIndex = 0;
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * method that plays the song returns string what song it is playing or that the cassett needs to rewind
     * @return string playing song or at the end of the cassett
     */
    public String play() {
        if (currentIndex > songs.size()) {
            return "At the end of the cassett you need to rewind";
        }
        currentIndex++;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    /**
     * method that rewinds the cassett to the previous song
     * @return string which song it is rewinding to or that it is fully rewound
     */
    public String rewind() {
        if (currentIndex == 0) {
            return "Fully Re-Wound";
        }
        currentIndex--;
        return "Rewinding to "+(currentIndex+1);
    }

    /**
     * method that fast forwards to the next song and returns a string
     * @return string that reaches end of cassett, fastforwarded to the end of the cassett, or which song fastforwarded to
     */
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

    /**
     * method that returns a string that the cassett is paused
     * @return string pausing
     */
    public String pause() {
        return "pausing";
    }

    /**
     * method that returns that the cassett is stopping and ejecting
     * @return string stopping and ejecting
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}
