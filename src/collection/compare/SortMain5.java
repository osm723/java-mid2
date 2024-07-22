package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUserA = new MyUser("A", 30);
        MyUser myUserB = new MyUser("B", 20);
        MyUser myUserC = new MyUser("C", 10);
        MyUser myUserD = new MyUser("D", 5);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUserA);
        treeSet1.add(myUserB);
        treeSet1.add(myUserC);
        treeSet1.add(myUserD);
        System.out.println("treeSet1 = " + treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUserA);
        treeSet2.add(myUserB);
        treeSet2.add(myUserC);
        treeSet2.add(myUserD);
        System.out.println("treeSet2 = " + treeSet2);

        TreeSet<MyUser> treeSet3 = new TreeSet<>(new IdComparator().reversed());
        treeSet3.add(myUserA);
        treeSet3.add(myUserB);
        treeSet3.add(myUserC);
        treeSet3.add(myUserD);
        System.out.println("treeSet3 = " + treeSet3);
    }
}
