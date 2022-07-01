package sl4;

public class FinalTrain5 {
    public static void main(String args[]){
        A : for(int a = 2;a <= 100;a++){
            for(int b = 2;b < a;b++){
                if(a % b == 0){
                    continue A;
                }
            }
            System.out.println(a);
        }
    }
}
