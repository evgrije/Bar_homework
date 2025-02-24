import java.util.List;

public class Main {
    public static void main (String[] args){
        Bar bar = new Bar("Bobr-kurva");

        bar.setListOfBarmen(List.of(
                new Barman("Musya", "Trofimova", 2),
                new Barman("Kolyan", "Petrov", 1)
        ));

        bar.setManager(
                new Manager("Tom", "Necruze", 5)
        );

        bar.setListOfTesterAlcohol(List.of(
                new TesterAlcohol("George", "Necluni", 4),
                new TesterAlcohol("Boris", "Gigi", 2)
        ));

        bar.setListOfDrinks(List.of(
                new Beer("Corona", 154, 0.3),
                new Beer("kozel", 72, 0.5),
                new Prosecco("Mondoro", 1491, 0.75),
                new Prosecco("Martini", 1205, 0.75),
                new Prosecco("Cava", 2000, 0.75),
                new Cocktail("negroni", 690, 0.3),
                new Cocktail("white_russian", 550, 0.3)
        ));

        int sum = 0;
        for (int i=0; i<bar.getListOfDrinks().size(); i++ ){
           System.out.println(bar.getListOfDrinks().get(i).getStructureName());
           sum += bar.getListOfDrinks().get(i).getPrice();

        }
        System.out.println("Итого:"+ " "+sum);



    }
}
