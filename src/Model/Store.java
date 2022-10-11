package Model;
import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<Item> items;

    public Store(){
        this.items=new ArrayList<Item>();

    }
    public void add(Item new_item){
        this.items.add(new_item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
