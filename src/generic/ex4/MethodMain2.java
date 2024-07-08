package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog biggered = AnimalMethod.bigger(new Dog("멍멍이2", 200), dog);
        System.out.println("biggered = " + biggered);
        Cat biggered2 = AnimalMethod.bigger(new Cat("냐옹이2", 150), cat);
        System.out.println("biggered2 = " + biggered2);


    }
}
