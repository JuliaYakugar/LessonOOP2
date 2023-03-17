import java.util.ArrayList;

import javax.xml.validation.Validator;

public class HotDrinkVendingMachine extends VendingMachine<HotDrink>{

    public HotDrink getHotDrink(String volume) {
        for (HotDrink el: productList) {
            if (el.getName().equals((String)volume)) return el;
        }
        return null;
    }

    public HotDrink getHotDrink(Integer volume) {
        for (HotDrink el: productList) {
            if (el.getVolume() == (int)volume || el.getTemperature() == (int)volume) return el;
        }
        return null;
    }

}
