package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int addQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
    }

    public void printAll() {
        System.out.println("==상품출력==");
        Set<Map.Entry<Product, Integer>> entrySet = cartMap.entrySet();
        for (Map.Entry<Product, Integer> entry : entrySet) {
            System.out.println("상품 = " + entry.getKey() + ", " + entry.getValue() + "개");
        }
    }

    public void minus(Product product, int minusQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }


}
