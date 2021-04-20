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
        // TODO Auto-generated method stub
        return null;
    }

    public String rewind() {
        // TODO Auto-generated method stub
        return null;
    }

    public String ffwd() {
        // TODO Auto-generated method stub
        return null;
    }

    public String pause() {
        // TODO Auto-generated method stub
        return null;
    }

    public String stopEject() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
