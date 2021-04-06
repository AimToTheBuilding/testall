public class Item{

    private int itemID;
    private String itemName;
    private Owner itemOwner;
    private double itemPrice;


    public Item (int itemID, String itemName, Owner itemOwner, double itemPrice){
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemOwner = itemOwner;
        this.itemPrice = itemPrice;

    }


    public double getItemPrice() {
        return this.itemPrice;
    }

    public int getItemID(){
        return this.itemID;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Owner getItemOwner() {
        return this.itemOwner;
    }
}