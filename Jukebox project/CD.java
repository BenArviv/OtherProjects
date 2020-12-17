/**
 * Creates a CD class of type Item.
 * @author Ben Arviv
 * @version 16/12/2020
 */
public class CD extends Item {
    private String _artist;
    private int _numberOfTracks;

    /**
     * A constructor for CD
     * @param title The title of the CD
     * @param year The publishing year 
     * @param artist The artist of the CD
     * @param Tracks Amount of tracks in the CD
     */
    public CD(String title, int year, String artist, int Tracks){
        super(title, year);
        _artist = artist;
        _numberOfTracks = Tracks;
    }

    /**
     * A copy constructor for CD
     * @param other Other CD to copy from
     */
    public CD(CD other){
        this(other.getTitle(), other.getPublishYear(), other._artist, other._numberOfTracks);
    }

    /**
     * Returns the artist that made the CD
     * @return The artist that made the CD
     */
    public String getArtist(){
        return _artist;
    }

    /**
     * Returns the amount of tracks in the CD
     * @return The amount of tracks in the CD
     */
    public int getNumberOfTracks(){
        return _numberOfTracks;
    }

    /**
     * Sets the name of the artist
     * @param artist The artist's name
     */
    public void setArtist(String artist){
        _artist = artist;
    }

    /**
     * Sets the amount of tracks in the CD
     * @param tracks The amount of tracks in the CD
     */
    public void setNumberOfTracks(int tracks){
        _numberOfTracks = tracks;
    }

    /**
     * Returns a string representation of CD
     * @return String representation of CD
     */
    public String toString(){
        return "CD – "+ this.getTitle() + " \t Published at: "+this.getPublishYear() +
        " \t by: " + this.getArtist() + " \t Number of tracks: " + this.getNumberOfTracks();
    }

    /**
     * Plays the CD
     */
    public void play(){
        System.out.println("Now playing " + this.getTitle() + " by " + this.getArtist() +
        ", enjoy listening...");
    }
}
