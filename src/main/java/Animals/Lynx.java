package Animals;

import Food.*;

public class Lynx extends Carnivorous {
    private static int count;
    private String name;

    public Lynx() {
        count++;
        name = "Рысь №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " ест " + food.getName());
        } else {
            System.out.println(name + " не ест такую еду");
        }
    }

}
