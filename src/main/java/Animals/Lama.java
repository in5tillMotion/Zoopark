package Animals;

import Food.*;

public class Lama extends Herbivore {

    public Lama() {
        count++;
        name = "Лама №" + count;
    }

    @Override
    public String getName() {
        return name;
    }


}