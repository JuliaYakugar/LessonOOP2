package Less_01;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Пирожки", 100));
        vm.addProduct(new Product("Пицца Школьница", 50));

        Drink coffee = new Drink("Кофе", 100);
        coffee.setVolume(200);
        Drink cola = new Drink("Кока-кола", 150);
        cola.setVolume(320);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Пирожки", 100));
        products.add(new Product("Пицца Школьница", 50));
        products.add(coffee);
        products.add(cola);
        for (Product el: products) {
            el.consume();
        }
    }
}