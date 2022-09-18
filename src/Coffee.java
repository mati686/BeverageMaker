import java.util.Arrays;

public class Coffee implements Preparable{
    String[] ingredients = {"coffee powder", "watter"};

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getIngeredients() {
        return Arrays.toString(ingredients);
    }

}
