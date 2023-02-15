package Less_01;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> productList;

    public VendingMachine() {
        this.productList = new ArrayList<Product>();
    }

    public Product getProductByName(String name){
        for (Product el: productList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

    public void addProduct (Product product){
        productList.add(product);
    }
    
    public void printProducts(){
        for (var el: this.productList) {
            System.out.println(el);
        }
    }

}
