package sl5;

import java.util.Arrays;

public class Test01 {
    //5.4.5
    public static void main(String[] args) {
        int[] arr = new int[]{4};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 8);
        System.out.println(index);
    }
}
