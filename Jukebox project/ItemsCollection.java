/**
 * Creates a class that contains an array of Items
 * @author Ben Arviv
 * @version 16/12/2020
 */
public class ItemsCollection {
    private Item[] itemsList;
    private final int MAX_ITEMS = 20;
    private int numOfItems;

    /**
     * A constructor for ItemsCollection. Construct a new max sized array
     */
    public ItemsCollection(){
        itemsList = new Item[MAX_ITEMS];
        numOfItems = 0;
    }

    /**
     * Adds an item to the array
     * @param newItem Item to add to the array
     * @return True if item has been added
     */
    public boolean addItem(Item newItem){
        if ((newItem == null)||(numOfItems == MAX_ITEMS))
            return false;
        for (int i = 0; i < MAX_ITEMS; i++){
            if (itemsList[i] == null){
                if (newItem instanceof CD){
                    itemsList[i] = new CD((CD)newItem);
                    numOfItems++;
                    return true;
                }
                if (newItem instanceof Video){
                    itemsList[i] = new Video((Video)newItem);
                    numOfItems++;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Plays the item by the class of it
     * @param itemNumber The number of the item in the array
     */
    public void playItem(int itemNumber){
        if (itemNumber < 0 || itemNumber >= numOfItems)
            System.out.println("Item no. " + itemNumber + " doesn't exist in the collection.");
        else{
            itemsList[itemNumber].play();
        }
    }

    /**
     * Returns the number of CDs in the array
     * @return The number of CDs in the array
     */
    public int getNumberOfCDs(){
        int num = 0;
        for (int i = 0; i < numOfItems; i++){
            if (itemsList[i] instanceof CD)
                num++;
        }
        return num;
    }

    /**
     * Prints a list of all the items that has been published prior to recieved year
     * @param year The year to compare publish year with
     */
    public void oldiesButGoldies(int year){
        for (int i = 0; i < numOfItems; i++){
            if (itemsList[i].getPublishYear() < year)
                System.out.println(itemsList[i]);
        }
    }

    /**
     * Returns a string representation of the array
     * @return String representation of ItemsCollection
     */
    public String toString(){
        String str = "The items in the collection are: \n";
        for (int i = 0; i < numOfItems; i++){
            str += itemsList[i] + "\n";
        }
        return str;
    }
}
