public class Beer extends Drinks{
    public Beer(String name, int price, double volume) {
        super(name, price, volume);
    }

    public String getStructureName() {
        return "Beer: " + super.getName();
    }
}
