package Animals;
import Food.*;
public class Bear extends Carnivorous {

    public Bear() {
        count++;
        name = "Медведь №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}

