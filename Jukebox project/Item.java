/**
 * Creates an Item's class for Jukebox project.
 * @author Ben Arviv
 * @version 16/12/2020
 */
public abstract class Item {
    protected String _title;
    protected int _publishYear;

    /**
     * A constructor for Item
     * @param title The title of the item
     * @param year The year the item has been published
     */
    public Item(String title, int year){
        _title = title;
        _publishYear = year;
    }

    /**
     * A copy constructor for item
     * @param other An item to copy
     */
    public Item(Item other){
        _title = other._title;
        _publishYear = other._publishYear;
    }

    /**
     * Returns the title of the item
     * @return The title of the item
     */
    public String getTitle(){
        return _title;
    }

    /**
     * Returns the year the item has been published
     * @return The year the item has been published
     */
    public int getPublishYear(){
        return _publishYear;
    }

    /**
     * Sets a new title for the item
     * @param newTitle The new title
     */
    public void setTitle(String newTitle){
        _title = newTitle;
    }

    /**
     * Sets a new publish year for the item
     * @param newYear The new publish year
     */
    public void setPublishYear(int newYear){
        _publishYear = newYear;
    }

    /**
     * Returns a string representation of the item
     * @return String representation of the item
     */
    public String toString(){
        return (_title + "\t Published at: " + _publishYear);
    }

    /**
     * An abstract method, will be implemented in CD and Video
     */
    public abstract void play();
}
