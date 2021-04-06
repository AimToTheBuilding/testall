public class Collector extends Owner {

    private Owner thisPerson;
    private double budget;
    private ArrayList <Item> itemsCollection;

    public Collector(Owner person, double budget){
        this.thisPerson = person;
        this.budget = budget;
        this.itemsCollection = new ArrayList<Item>();
    }



    public double itemBuy(Item itemToCollect){

        double priceToPay = itemToCollect.getItemPrice();

        if(this.budget < priceToPay) {
            System.out.println("Sorry, I can't afford this thing");
            return 0;
        }

        System.out.println("Deal with it");

        itemsCollection.add(itemToCollect);

        this.budget -= priceToPay;

        return priceToPay;
    }


    public ArrayList<Item> showCollection() {
        return itemsCollection;
    }
}