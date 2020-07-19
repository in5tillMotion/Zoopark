package ZooMain;

import Animals.*;
import Food.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        //Создаём хранилище с едой.
        Food[] foods = new Food[] {new Bull(), new Grass(), new Pork(), new Wheat()};

        //Создаём вольеры и указываем их размеры.
        AviaryCarnivorous aviaryCarnivorous1 = new AviaryCarnivorous(5);
        AviaryCarnivorous aviaryCarnivorous2 = new AviaryCarnivorous(4);

        AviaryHerbivore aviaryHerbivore1 = new AviaryHerbivore(6);
        AviaryHerbivore aviaryHerbivore2 = new AviaryHerbivore(3);

        //Загоняем животных в вольеры.
        for (int i = 0; i < aviaryCarnivorous1.getSize(); i++) {
            aviaryCarnivorous1.addAnimal(new Tiger());
        }
        for (int i = 0; i < 2; i++) {
            aviaryCarnivorous2.addAnimal(new Bear());
        }

        for (int i = 0; i < 2; i++) {
            aviaryHerbivore1.addAnimal(new Lama());
        }

        for (int i = 0; i < aviaryHerbivore2.getSize(); i++) {
            aviaryHerbivore2.addAnimal(new Kangaroo());
        }


        List<Aviary> aviaries = new ArrayList<Aviary>();
        aviaries.add(aviaryHerbivore1);
        aviaries.add(aviaryHerbivore2);
        aviaries.add(aviaryCarnivorous1);
        aviaries.add(aviaryCarnivorous2);

        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getCount(); i++) {
                int random = (int) (Math.random() * foods.length);
                Food food = foods[random];
                Animal animal = aviary.getAnimalByIndex(i);
                System.out.println("Работник зоопарка для " + animal.getName() + " наложил еды: "
                        + food.getName());
                animal.eat(food);
            }
        }

    }
}
