package View;

import Controller.PriceFilterController;
import Model.Item;
import java.util.List;
import Model.Store;
import Model.Flour;
import Model.Salt;
import Model.Sugar;

public class View {
    public void printGreaterWeight(PriceFilterController mycontroller){
        Store store= new Store();
        store.add(new Flour(25,"brown"));
        store.add(new Salt(19,"good"));
        store.add(new Sugar(100,250));
        store.add(new Flour(30,"brown"));
        store.add(new Salt(10,"good"));
        store.add(new Sugar(90,250));
        List<Item> result=mycontroller.filterByPrice(store);

        for(Item item: result){
            System.out.println(item.toString());

        }

    }
}
