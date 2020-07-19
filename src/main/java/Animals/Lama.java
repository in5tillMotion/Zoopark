package Animals;

import Food.*;

public class Lama extends Herbivore {
    private static int count;
    private String name;

    public Lama() {
        count++;
        name = "Лама №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println(name + " ест " + food.getName());
        } else {
            System.out.println(name + " не ест такую еду");
        }
    }
}