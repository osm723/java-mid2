package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKetValueSum2 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> resultMap = new HashMap<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println("resultMap = " + resultMap);
    }
}
