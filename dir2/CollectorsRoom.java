public class CollectorsRoom {
    public void meeting(Owner owner, Collector collector, Item itemToCollect){
        greetings(owner, collector);

        collector.showCollection();

        collector.itemsBuy(itemToCollect);


    }

    public void greetings(Owner owner, Collector collector){

    }
}