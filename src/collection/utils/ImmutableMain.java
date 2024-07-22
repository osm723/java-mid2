package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        List<Integer> immutableList = Collections.unmodifiableList(mutableList);
        System.out.println("immutableList = " + immutableList);
        System.out.println("immutableList.getClass() = " + immutableList.getClass());
        //immutableList.add(5);
    }
}
