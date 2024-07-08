package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("printGenericV1");
        System.out.println("box.get() = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("printWildcardV1");
        System.out.println("box.get() = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("printGenericV2");
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getSize() = " + t.getSize());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal t = box.get();
        System.out.println("printWildcardV2");
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getSize() = " + t.getSize());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("printAndReturnGeneric");
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getSize() = " + t.getSize());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal t = box.get();
        System.out.println("printAndReturnWildcard");
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getSize() = " + t.getSize());
        return t;
    }
}
