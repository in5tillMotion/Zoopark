package Animals;

import Food.*;

public class Lynx extends Carnivorous {

    public Lynx() {
        count++;
        name = "Рысь №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}
