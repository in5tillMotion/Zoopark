package Animals;
import Exception.FoodException;
import Food.*;

//Травоядные
public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) throws FoodException {
        if (food instanceof Vegetable) {
            System.out.println(name + " ест " + food);
        } else {
            throw new FoodException (name + " не ест такую еду");
        }
    }
}