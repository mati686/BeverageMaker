import java.util.Arrays;

public class Tea implements Preparable {

    String[] ingredients = {"syrup", "watter"};

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getIngeredients() {
        return Arrays.toString(ingredients);
    }
}
