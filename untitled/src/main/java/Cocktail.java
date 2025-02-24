public class Cocktail extends Drinks{

    public Cocktail(String name, int price, double volume) {
        super(name, price, volume);
    }

    public String getStructureName() {
        return "Cocktail: " + super.getName();
    }
}
