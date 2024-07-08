package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("arr = " + Arrays.toString(arr));
    
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println("arr = " + Arrays.toString(arr));


        int index = 2;
        int atValue = 4;
        addAtIndex(arr, index, atValue);
        System.out.println("arr = " + Arrays.toString(arr));

        addLast(arr, newValue);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length-1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int atValue) {
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = atValue;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }
}