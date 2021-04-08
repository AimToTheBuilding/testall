public class Owner {

    private int ownerID;
    private String ownerName;
    private int ownerAge;

    public Owner(String ownerName, int ownerID, int ownerAge){
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
        this.ownerId = ownerID;
    }


    public int getOwnerAge() {
        return this.ownerAge;
    }

    public int getOwnerID() {
        return this.ownerID;
    }

}