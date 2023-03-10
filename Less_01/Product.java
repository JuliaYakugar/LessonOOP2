public class Product {

    protected String name;
    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Название: " + name + ", Цена: " + price;
    }

    public void consume(){
        System.out.println("Продукт потреблен");
    }
}
