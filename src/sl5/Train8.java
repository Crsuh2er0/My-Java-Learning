package sl5;

import java.util.Arrays;

public class Train8 {
    public static void main(String[] args) {
        int[] score = new int[]{71, 89, 67, 53, 78, 64, 92, 56, 74, 85};
        Train8 train8 = new Train8();
        train8.bubblesort(score);
    }

    public void bubblesort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        this.reversesort(array);
    }

    public void reversesort(int[] array) {
        int temp;
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
