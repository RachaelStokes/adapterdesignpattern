/**
 * @author Rachael Stokes
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album; //instance of a digital album used to call the digital album's methods

    /**
     * constructor sets album to the param album
     * @param album used to set album
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * method that returns a call to the album's next song method
     * @return string call to album's next song
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * method that returns a call to the album's previous song
     * @return String from album's previous song method
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * method that returns a call to the album's next song method
     * @return string from album's next song method
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * method that returns a call to the album's pause method
     * @return string from album's pause method
     */
    public String pause() {
        return album.pause();
    }

    /**
     * method that returns a call to the album's stop method
     * @return string from album's stop method
     */
    public String stopEject() {
        return album.stop();
    }
}
