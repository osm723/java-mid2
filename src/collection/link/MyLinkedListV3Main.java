package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> strList = new MyLinkedListV3<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
//        list.add(1);
        System.out.println(strList.get(0));
        System.out.println(strList);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
//        intList.add("a");
        System.out.println(intList.get(0));
        System.out.println(intList);


    }
}
