package collection.generic.ex4;

import collection.generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    
    public <T> T printAndReturn(T t) {
        System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
        System.out.println("t.getClass().getName() = " + t.getClass().getName());
        return t;
    }

    public <Z> Z printAndReturn2(Z z) {
        System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
        System.out.println("z.getClass().getName() = " + z.getClass().getName());
        return z;
    }
}
