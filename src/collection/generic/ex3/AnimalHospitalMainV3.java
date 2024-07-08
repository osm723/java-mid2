
package collection.generic.ex3;

import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> intHospital = new AnimalHospitalV3<Integer>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1
        //dogHospital.set(cat);

        // 문제2
        dogHospital.set(dog);
        Dog biggered = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggered = " + biggered);
    }
}
