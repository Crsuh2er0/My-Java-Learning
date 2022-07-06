package sl5;

import java.util.Arrays;

public class Train7 {
    public static void main(String[] args){
        int[] score = new int[]{71,89,67,53,78,64,92,56,74,85};
        Train7 train7 = new Train7();
        train7.sort(score);
    }
    public void sort(int[] array){
        for(int i =1;i < array.length;i++){
            for(int j = 0;j < array.length - i;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
