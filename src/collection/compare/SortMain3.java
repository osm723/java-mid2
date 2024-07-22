package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUserA = new MyUser("A", 30);
        MyUser myUserB = new MyUser("B", 20);
        MyUser myUserC = new MyUser("C", 10);
        MyUser myUserD = new MyUser("D", 5);

        MyUser[] array = {myUserA, myUserB, myUserC, myUserD};
        System.out.println("array = " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));

        Arrays.sort(array, new IdComparator());
        System.out.println("array = " + Arrays.toString(array));

        Arrays.sort(array, new IdComparator().reversed());
        System.out.println("array = " + Arrays.toString(array));
    }
}
