public class HotDrink extends Drink{
    
    protected int temperature;

    public HotDrink(String name, int price) {
        super(name, price);
    }

    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        return "Название: " + name + ", Цена: " + price + ", Объем: " + volume + ", Температура: " + temperature;
    }

    public void consume(){
        System.out.println("Ай, горячо!");
    }
}
