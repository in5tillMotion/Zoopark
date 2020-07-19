package Animals;
import Food.*;
import Exception.FoodException;
public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) throws FoodException {
        if (!food.isVegetable()) {
            System.out.println(name + " ест " + food);
        } else {
            throw new FoodException (name + " не ест такую еду");
        }
    }
}

