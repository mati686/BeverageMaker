import java.util.ArrayList;

public class BeverageMaker {

    ArrayList<Preparable> availableBeverages = new ArrayList<>();
    CupSize size;
    public void addBeverage(Preparable beverage){
        availableBeverages.add(beverage);

    }

    public void prepare(int indexOfBeverage){
        try {
        String ingredients = availableBeverages.get(indexOfBeverage).getIngeredients();
        System.out.printf("Preparing %s cup of %s from %s%n",
                size.getCupSize(), availableBeverages.get(indexOfBeverage).getName(), ingredients);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void setCupSize(CupSize sizeOfCup) {
        size = sizeOfCup;
    }
}
