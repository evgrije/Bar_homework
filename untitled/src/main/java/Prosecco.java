public class Prosecco extends Drinks{
    public Prosecco(String name, int price, double volume) {
        super(name, price, volume);
    }

    public String getStructureName() {
        return "Processo: " + super.getName();
    }
}
