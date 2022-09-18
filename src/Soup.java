import java.util.Arrays;

public class Soup implements Preparable{
    String[] ingredients = {"soup powder", "instant noodles", "watter"};

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getIngeredients() {
        return Arrays.toString(ingredients);
    }

}
