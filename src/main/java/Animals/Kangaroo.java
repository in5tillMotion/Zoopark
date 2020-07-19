package Animals;

import Food.*;

public class Kangaroo extends Herbivore {

    public Kangaroo() {
        count++;
        name = "Кенгуру №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}


