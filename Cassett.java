import java.util.*;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    int currSong = 0; //index of the current song

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String play() {
        if (currSong > songs.size()) {
            return "At the end of the cassett you need to rewind";
        }
        currSong++;
        return "Playing song "+(currSong)+": "+songs.get(currSong-1);
    }

    public String rewind() {
        if (currSong == 0) {
            return "Fully Re-Wound";
        }
        currSong--;
        return "Rewinding to "+(currSong+1);
    }

    public String ffwd() {
        if (currSong == songs.size()) {
            return "At the end of cassett you need to rewind";
        }
        currSong++;
        if (currSong == songs.size()) {
            return "Forwarded to the end of cassett";
        }
        return "Forwarding to song "+(currSong+1);
    }

    public String pause() {
        return "pausing";
    }

    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}
