package Animals;

import Food.*;

public class Ostrich extends Herbivore {

    public Ostrich() {
        count++;
        name = "Страус №" + count;
    }

    @Override
    public String getName() {
        return name;
    }


}
