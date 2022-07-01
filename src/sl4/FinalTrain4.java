package sl4;

public class FinalTrain4 {
    public static void main(String args[]){
        A : for(int a = 4;a <= 7;a++){
            B : for(int b = 4;b <= 7;b++){
                C : for(int c = 4;c <= 7;c++){
                    if(a==b){
                        continue B;
                    }
                    if(a==c){
                        continue;
                    }
                    if(b==c){
                        continue;
                    }
                    System.out.println(String.valueOf(a) + String.valueOf(b) + String.valueOf(c));
                }
            }
        }
    }
}
