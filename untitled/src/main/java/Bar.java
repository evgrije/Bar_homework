import java.util.List;

public class Bar {

    private String name;
    private List <Drinks> listOfDrinks;

    public List<Drinks> getListOfDrinks() {
        return listOfDrinks;
    }

    public void setListOfDrinks(List<Drinks> listOfDrinks) {
        this.listOfDrinks = listOfDrinks;
    }

    private List<Beer> listOfBeer;
    private List<Prosecco> listOfProsecco;
    private List<Cocktail> listOfCocktail;
    private List<Barman> listOfBarmen;
    private List<TesterAlcohol> listOfTesterAlcohol;
    private Manager manager;

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
        }
    }

    public List<Beer> getListOfBeer() {
        return listOfBeer;
    }

    public void setListOfBeer(List<Beer> listOfBeer) {
        this.listOfBeer = listOfBeer;
    }

    public List<Barman> getListOfBarmen() {
        return listOfBarmen;
    }

    public void setListOfBarmen(List<Barman> listOfBarmen) {
        this.listOfBarmen = listOfBarmen;
    }

    public List<TesterAlcohol> getListOfTesterAlcohol() {
        return listOfTesterAlcohol;
    }

    public void setListOfTesterAlcohol(List<TesterAlcohol> listOfTesterAlcohol) {
        this.listOfTesterAlcohol = listOfTesterAlcohol;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Prosecco> getListOfProsecco() {
        return listOfProsecco;
    }

    public void setListOfProsecco(List<Prosecco> listOfProsecco) {
        this.listOfProsecco = listOfProsecco;
    }

    public List<Cocktail> getListOfCocktail() {
        return listOfCocktail;
    }

    public void setListOfCocktail(List<Cocktail> listOfCocktail) {
        this.listOfCocktail = listOfCocktail;
    }
}
