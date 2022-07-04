package sl5;

public class Train2 {
    public static void main(String[] args){
        int[] nonused = new int[]{2,3,5,8,12,13,16,19,20};
        int num = 20;
        System.out.println("目前尚未使用的储物箱个数为：" + nonused.length);
        System.out.println("目前已经使用的储物箱个数为：" + (num - nonused.length));
    }
}
