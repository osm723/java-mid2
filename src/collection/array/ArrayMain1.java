package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("arr = " + Arrays.toString(arr));
        arr[2] = 10;
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr[2] = " + arr[2]);
        int value = 10;
        for (int i : arr) {
            System.out.println("i = " + i);
            if (arr[i] == value) {
                break;
            }
        }
    }
}