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
        // TODO Auto-generated method stub
        return null;
    }

    public String prevSong() {
        // TODO Auto-generated method stub
        return null;
    }

    public String nextSong() {
        // TODO Auto-generated method stub
        return null;
    }

    public String stop() {
        // TODO Auto-generated method stub
        return null;
    }

    public String pause() {
        // TODO Auto-generated method stub
        return null;
    }
    
}