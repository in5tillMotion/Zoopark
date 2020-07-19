package Animals;
import Food.*;
public class Bear extends Carnivorous {
    private static int count;
    private String name;

    public Bear() {
        count++;
        name = "Медведь №" + count;
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

