import java.util.EmptyStackException;
import java.util.List;

public class Bar {

    private String name;
    private List <Drinks> listOfDrinks;
    private List<Staff> listOfStaff;


    public Bar(String name) {
        this.name = name;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new EmptyStackException();
        }
    }

    public List<Drinks> getListOfDrinks() {
        return listOfDrinks;
    }

    public void setListOfDrinks(List<Drinks> listOfDrinks) {
        this.listOfDrinks = listOfDrinks;
    }
    public List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(List<Staff> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }
}
