package Model;

public class Sugar extends Item{
    private int calories;

    public Sugar(int price, int calories) {
        super(price);
        this.calories = calories;
    }
    public Sugar (int calories){
        this.calories=calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "price=" + price + " calories " + calories+
                '}';
    }
}
