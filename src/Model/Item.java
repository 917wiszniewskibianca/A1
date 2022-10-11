package Model;

public class Item {
    protected int price;

    public Item(int price){
        this.price=price;

    }
    public Item(){
        this.price=0;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
