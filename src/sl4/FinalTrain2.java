package sl4;

public class FinalTrain2 {
    public static void main(String[] args) {
        int space = 16;
        for (int num = 1; num <= 17; num += 2, space -= 2) {
            for (int s = 1; s <= space; s++) {
                System.out.println(" ");
            }
            for (int t = 1; t <= num; t++) {
                System.out.println("* ");
            }
        }
        for (int num = 17; num >= 1; num -= 2, space += 2) {
            for (int s = 1; s <= space; s++) {
                System.out.println(" ");
            }
            for (int t = 1; t <= num; t++) {
                System.out.println("* ");
            }
        }
    }
}
