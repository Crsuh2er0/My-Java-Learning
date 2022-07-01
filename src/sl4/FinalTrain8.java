package sl4;

public class FinalTrain8 {
    public static void main(String[] args){
        int f,m,s;
        int money = 100;
        for(f = 0;f <= money / 5;f++){
            for(m = 0;m <= money / 3;m++){
                for(s = 0;s <= money * 3;s++){
                    if(f+m+s != 100){
                        continue;
                    }
                    if(5 * f + 3 * m + s / 3 != money){
                        continue;
                    }
                    System.out.println("公鸡有： " + f + " 只，母鸡有： " + m + " 只，雏鸡有： " + s + " 只。");
                }
            }
        }
    }
}
