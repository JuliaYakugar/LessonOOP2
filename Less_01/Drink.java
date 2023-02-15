public class Drink extends Product{

    protected int volume;

    public Drink(String name, int price) {
        super(name, price);
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "Название: " + name + ", Цена: " + price + ", Объем: " + volume;
    }

    public void consume(){
        System.out.println("Напиток выпит");
    }
}
