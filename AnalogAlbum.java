/**
 * @author Rachael Stokes
 * Analog album interface states methods that classes that implement Analog album must have
 */
public interface AnalogAlbum {
    public String play();
    public String rewind();
    public String ffwd();
    public String pause();
    public String stopEject();
}
