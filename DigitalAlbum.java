/**
 * @author Rachael Stokes
 * Digital Album interface states methods that classes that implement digital album must have
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
    
}
