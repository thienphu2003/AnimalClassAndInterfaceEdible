import Animal.Chicken;
import Animal.Animal;
import Animal.Tiger;
import Animal.Chicken1;
import edible.Edible;
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        animals[2]= new Chicken1();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken1) {
                Edible edibler = (Chicken1) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
