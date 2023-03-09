import java.util.ArrayList;

import javax.xml.validation.Validator;

public class HotDrinkVendingMachine extends VendingMachine<HotDrink>{

    public <T> HotDrink getHotDrink(T volume) {
        if (volume instanceof Integer) {
            for (HotDrink el: productList) {
                if (el.getVolume() == (int)volume || el.getTemperature() == (int)volume) return el;
            }
        } else {
            for (HotDrink el: productList) {
                if (el.getName().equals((String)volume)) return el;
            }
        }
        return null;
    }
}
