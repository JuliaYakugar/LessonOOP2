import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine{

    public HotDrinkVendingMachine() {
    }

    public Product getProduct(String name, int volume, int temperature){
        for (Product el: productList) {
            if (el instanceof HotDrink) { 
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) return el;
            }
        }
        return null;
    }
}
