package sl5;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args){
        //char 转换为 int 测试
        char[] temploc = new char[]{'1','2'};
        int[] loc = new int[2];
        loc[0] = temploc[0] - 48;
        loc[1] = temploc[1] - 48;
        System.out.println(Arrays.toString(loc));
    }
}
