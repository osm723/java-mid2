package collection.generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Integer integer = (Integer) GenericMethod.objMethod(i);

        Integer integer1 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("integer1 = " + integer1);

        Integer integer2 = GenericMethod.<Integer>numberMethod(i);
        System.out.println("integer2 = " + integer2);

        Double aDouble = GenericMethod.<Double>numberMethod(10.5);
        System.out.println("aDouble = " + aDouble);


        Integer integer11 = GenericMethod.genericMethod(i);
        System.out.println("integer11 = " + integer11);

        Integer integer22 = GenericMethod.numberMethod(i);
        System.out.println("integer22 = " + integer22);

        Double aDouble1 = GenericMethod.numberMethod(10.5);
        System.out.println("aDouble1 = " + aDouble1);

    }
}
