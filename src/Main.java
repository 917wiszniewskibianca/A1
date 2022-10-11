import Controller.PriceFilterController;

import View.View;
public class Main {
    public static void main(String[] args) {

        PriceFilterController myController=new  PriceFilterController();
        View myView= new View();
        myView.printGreaterWeight(myController);
    }
}