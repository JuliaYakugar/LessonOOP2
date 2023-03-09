import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // VendingMachine vm = new VendingMachine();
        // vm.addProduct(new Product("Пирожки", 100));
        // vm.addProduct(new Product("Пицца Школьница", 50));

        // Drink coffee = new Drink("Кофе", 100);
        // coffee.setVolume(200);
        // Drink cola = new Drink("Кока-кола", 150);
        // cola.setVolume(320);

        // HotDrink cacao = new HotDrink("Какао", 145);
        // cacao.setVolume(400);
        // cacao.setTemperature(46);

        // HotDrink tea = new HotDrink("Чай", 90);
        // tea.setVolume(1000);
        // tea.setTemperature(95);

        // ArrayList<Product> products = new ArrayList<>();
        // products.add(new Product("Пирожки", 100));
        // products.add(new Product("Пицца Школьница", 50));
        // products.add(coffee);
        // products.add(cola);
        // products.add(cacao);
        // for (Product el: products) {
        //     el.consume();
        // }

        // System.out.println("-----------");

        // HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        // hdvm.addProduct(cacao);
        // hdvm.addProduct(tea);

        // System.out.println(hdvm.getProduct("Чай"));
        // System.out.println(hdvm.getProduct("Какао", 400, 46));

        HotDrinkVendingMachine coffeBar = new HotDrinkVendingMachine();
        coffeBar.addProduct(new HotDrink("Капучино", 160, 350, 87));
        coffeBar.addProduct(new HotDrink("Латте", 210, 450, 68));
        coffeBar.printProducts();
        
        System.out.println("=============");
        System.out.println(coffeBar.getHotDrink("Латте"));
        
    }
}