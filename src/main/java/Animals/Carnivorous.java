package Animals;
import Food.*;
public abstract class Carnivorous extends Animal {
    private String name;

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " ест " + food);
        } else {
            System.out.println(name + " не будет такое есть!");
        }
    }
}
}
