package Model;

public class Flour extends Item{
    private String type;

    public Flour(int price, String type) {
        super(price);
        this.type = type;
    }

    public Flour(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flour{" +
                "price=" + price + " type " + type +
                '}';
    }
}
