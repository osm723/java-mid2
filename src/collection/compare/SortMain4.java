package collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUserA = new MyUser("A", 30);
        MyUser myUserB = new MyUser("B", 20);
        MyUser myUserC = new MyUser("C", 10);
        MyUser myUserD = new MyUser("D", 5);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUserA);
        list.add(myUserB);
        list.add(myUserC);
        list.add(myUserD);
        System.out.println("list = " + list);

        list.sort(null);
        System.out.println("list = " + list);

        list.sort(new IdComparator());
        System.out.println("list = " + list);

        list.sort(new IdComparator().reversed());
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.sort(list, new IdComparator());
        System.out.println("list = " + list);
    }
}
