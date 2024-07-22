package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 3);
        //list.add(1);
        //list.set(1, 0);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "1",2,"2");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list.getClass() = " + list.getClass());
        System.out.println("set.getClass() = " + set.getClass());
        System.out.println("map.getClass() = " + map.getClass());


    }
}
