package Model;

public class Salt extends Item{
    private String quality;

    public Salt(int price, String quality){
        super(price);
        this.quality=quality;
    }

    public Salt(String quality){
        this.quality=quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Salt{" +
                "price=" + price + " quality "+ quality+
                '}';
    }
}
