
package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1
        dogHospital.set(cat);

        // 문제2
        dogHospital.set(dog);
        Dog biggered = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggered = " + biggered);
    }
}
