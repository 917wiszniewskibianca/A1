package Controller;
import Model.Item;

import java.util.ArrayList;
import java.util.List;
import Model.Store;

public class PriceFilterController {
    public PriceFilterController() {
    }

    public List<Item> filterByPrice(Store store){
        List<Item> good_items=new ArrayList<>();
        List<Item> all_items=store.getItems();
        for(Item current_item:all_items){
            if(current_item.getPrice()>20){
                good_items.add(current_item);
            }
        }
        return good_items;
    }

}
