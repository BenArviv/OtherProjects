/**
 * Creates a Video class of type Item.
 * @author Ben Arviv
 * @version 16/12/2020
 */
public class Video extends Item {
    private String _director;

    /**
     * A constructor for Video
     * @param title The title of the video
     * @param year The year it has been published
     * @param director The director of the video
     */
    public Video(String title, int year, String director){
        super(title, year);
        _director = director;
    }

    /**
     * A copy constructor for Video
     * @param other Other video to copy from
     */
    public Video(Video other){
        this(other.getTitle(), other.getPublishYear(), other._director);
    }

    /**
     * Returns the director of the movie
     * @return The director of the movie
     */
    public String getDirector(){
        return _director;
    }

    /**
     * Sets the director's name
     * @param director The name of the director
     */
    public void setDirector(String director){
        _director = director;
    }

    /**
     * Returns a string representation of the video
     * @return String representation of the video
     */
    public String toString(){
        return "Video - " + this.getTitle() + " \t Published at: " + this.getPublishYear() +
        " \t directed by: " + this.getDirector();
    }

    /**
     * Plays the video
     */
    public void play(){
        System.out.println("Now playing " + this.getTitle() + " directed by " + this.getDirector() + 
        ", enjoy watching...");
    }

    /**
     * Checks if this video is older than a recieved year
     * @param year The year to compare with
     * @return True if video has been published earlier
     */
    public boolean isOlder(int year){
        return this.getPublishYear() > year;
    }
}
