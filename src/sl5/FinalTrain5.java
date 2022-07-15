package sl5;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTrain5 {
    static char[] line1 = new char[21];
    static char[] line2 = new char[]{' ',' ','0',' ','1',' ','2',' ','3',' ','4',' ','5',' ','6',' ','7',' ','8',' ','9'};
    static char[] line3 = new char[]{'0',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line4 = new char[]{'1',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line5 = new char[]{'2',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line6 = new char[]{'3',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line7 = new char[]{'4',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line8 = new char[]{'5',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line9 = new char[]{'6',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line10 = new char[]{'7',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line11 = new char[]{'8',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line12 = new char[]{'9',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-'};
    static char[] line13;
    static boolean over = false;
    static char[][] lines = new char[13][];

    public static void main(String[] args) {
        FinalTrain5 finalTrain5 = new FinalTrain5();
        Arrays.fill(line1,'-');
        line13 = line1;

        lines[0] = line1;
        lines[1] = line2;
        lines[2] = line3;
        lines[3] = line4;
        lines[4] = line5;
        lines[5] = line6;
        lines[6] = line7;
        lines[7] = line8;
        lines[8] = line9;
        lines[9] = line10;
        lines[10] = line11;
        lines[11] = line12;
        lines[12] = line13;

        do {
        System.out.println(finalTrain5.deepToString(lines));
        System.out.println("请*输入棋子坐标：");
        finalTrain5.input('*');
        System.out.println(finalTrain5.deepToString(lines));
        System.out.println("请o输入棋子坐标：");
        finalTrain5.input('o');
        } while (!over);

        System.out.println(finalTrain5.deepToString(lines));
        System.out.println("游戏结束！");
    }

    public String toString(char[] charlist) {
        StringBuilder res = new StringBuilder();
        for (char letter : charlist) {
            res.append(letter);
        }
        return res.toString();
    }

    public String deepToString(char[][] charlist) {
        StringBuilder res = new StringBuilder();
            for(int t = 0;t < charlist.length;t++) {
                char[] list = charlist[t];
                res.append(toString(list));
                if (t != charlist.length - 1) {
                    res.append("\n");
                }
            }
        return res.toString();
    }

    public void input(char player){
        try {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if (command.length() > 2) {
                System.out.println("输入错误，请重新输入！");
                input(player);
                return;
            }

            //String to ArrayList
            //Tested in Test03
            char[] temploc = command.toCharArray();
            int[] loc = new int[2];
            loc[0] = temploc[0] - 48;
            loc[1] = temploc[1] - 48;

            //To loc in arraylist
            loc[0] += 2;
            loc[1] = loc[1] * 2 + 2;

            if(lines[loc[0]][loc[1]] == '-'){
                lines[loc[0]][loc[1]] = player;
            } else {
                System.out.println("输入错误，请重新输入！");
                input(player);
                return;
            }
        } catch (Exception e){
            System.out.println("输入错误，请重新输入！");
            input(player);
            return;
        }
        judger();
    }

    public void judger(){
        //Vertical judger
        for(int x = 2;x <= 20;x += 2){
            for(int y = 2;y <= 7;y++){
                if(
                        lines[y][x] == lines[y + 1][x] &&
                        lines[y + 1][x] == lines[y + 2][x] &&
                        lines[y + 2][x] == lines[y + 3][x] &&
                        lines[y + 3][x] == lines[y + 4][x] &&
                                lines[y][x] != '-'
                ){
                    over = true;
                    return;
                }
            }
        }

        //Transverse judger
        for(int x = 2;x <= 12;x += 2){
            for(int y = 2;y <= 11;y += 1){
                if(
                        lines[y][x] == lines[y][x + 2] &&
                                lines[y][x + 2] == lines[y][x + 4] &&
                                lines[y][x + 4] == lines[y][x + 6] &&
                                lines[y][x + 6] == lines[y][x + 8] &&
                                lines[y][x] != '-'
                ){
                    over = true;
                    return;
                }
            }
        }

        //Oblique judger
        //Left Down
        for(int x = 10;x <= 20;x += 2){
            for(int y = 2;y <= 7;y++){
                if(
                        lines[y][x] == lines[y + 1][x - 2] &&
                                lines[y + 1][x - 2] == lines[y + 2][x - 4] &&
                                lines[y + 2][x - 4] == lines[y + 3][x - 6] &&
                                lines[y + 3][x - 6] == lines[y + 4][x - 8] &&
                                lines[y][x] != '-'
                ){
                    over = true;
                    return;
                }
            }
        }
        //Right Down
        for(int x = 2;x <= 12;x += 2){
            for(int y = 2;y <= 7;y++){
                if(
                        lines[y][x] == lines[y + 1][x + 2] &&
                                lines[y + 1][x + 2] == lines[y + 2][x + 4] &&
                                lines[y + 2][x + 4] == lines[y + 3][x + 6] &&
                                lines[y + 3][x + 6] == lines[y + 4][x + 8] &&
                                lines[y][x] != '-'
                ){
                    over = true;
                    return;
                }
            }
        }
    }
}