import java.util.ArrayList;

public class DrinkMachine extends VendingMachine{

    private ArrayList<Drink> drinkList;
    
    public DrinkMachine() {
        drinkList = new ArrayList<Drink>();
    }
    public void addDrink(Drink dr){
        drinkList.add(dr);
    }
    public Drink returnProduct(String name){
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
}