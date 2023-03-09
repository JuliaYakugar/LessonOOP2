import java.util.ArrayList;

public class VendingMachine<T extends Product> {

    protected ArrayList<T> productList;

    public VendingMachine() {
        this.productList = new ArrayList<T>();
    }

    public T getProduct(String name){
        for (T el: productList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

    public void addProduct (T product){
        productList.add(product);
    }
    
    public void printProducts(){
        for (var el: this.productList) {
            System.out.println(el);
        }
    }

}
