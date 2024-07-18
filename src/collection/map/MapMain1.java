package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);

        System.out.println("studentMap = " + studentMap);

        Integer mapValue = studentMap.get("studentD");
        System.out.println("mapValue = " + mapValue);

        Set<String> keySet = studentMap.keySet();
        System.out.println("keySet = " + keySet);
        for (String key : keySet) {
            System.out.println("key = " + key);
            Integer keyValue = studentMap.get(key);
            System.out.println("value = " + keyValue);
        }

        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("entry = " + entry);
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
    }
}
