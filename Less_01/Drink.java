package Less_01;

public class Drink extends Product{

    private int volume;

    Drink(String name, int price) {
        super(name, price);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void consume(){
        System.out.println("Напиток выпит");
    }
}
