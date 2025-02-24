import java.util.List;

public class Drinks {
    private String name;
    private int price;
    private double volume;


    public Drinks(String name, int price, double volume) {
        this.name = name;
        setName(name);

        this.price = price;
        setPrice(price);

        this.volume = volume;
        setVolume(volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price != 0){
            this.price = price;
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume != 0 ){
            this.volume = volume;
        }
    }

    public String getStructureName() {
        return "Пустая бутылка";
    }
}
