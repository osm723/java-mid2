package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(4);
        list.add(5);
        System.out.println("list = " + list);


        //Integer intValue = (Integer) list.get(0);
        Integer intValue = (Integer) list.get(4);
        System.out.println("intValue = " + intValue);
    }
}
