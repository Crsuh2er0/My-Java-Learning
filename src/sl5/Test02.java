package sl5;

import java.util.Arrays;

public class Test02 {
    /**
     * Arrays.binarySearch()不能用来搜索数组中某元素位置
     */
    static char[] a = new char[]{'H', ' ', '&', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public static void main(String[] args) {
        System.out.println(Arrays.binarySearch(a, '&'));
    }
}
