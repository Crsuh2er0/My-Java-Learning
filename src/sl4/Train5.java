package sl4;

public class Train5 {
    public static void main(String args[]){
        int d = 10;
        int h = 0;
        int day = 0;
        while (true){
            day += 1;
            h += 2;
            if(h>=d){
                break;
            }
            h -= 1;
        }
        System.out.println(day + " 天可以爬到井口。");
    }
}
