package sl5;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTrain4 {
    static char[][] lines = new char[6][20];
    static char[] line1 = new char[]{'H', ' ', '&', ' ', ' ', ' ', 'H', ' ', ' ', ' '};
    static char[] line3 = new char[20];
    static char[] line4 = new char[20];
    static char[] line5 = new char[20];
    static char[] line2 = new char[20];
    static char[] line6 = new char[20];
    static boolean over = false;

    /**
     * Player's and box's x and y location in array.
     */
    static int locpx = 0;
    static int locpy = 2;
    static int locbx = 1;
    static int locby = 4;

    public static void main(String[] args) {
        FinalTrain4 finaltrain4 = new FinalTrain4();

        line1 = Arrays.copyOf(line1, 20);
        Arrays.fill(line1, 10, 20, ' ');
        line1[18] = 'H';

        Arrays.fill(line2, ' ');
        line2[0] = 'H';
        line2[18] = 'H';
        line2[6] = 'H';
        line2[10] = 'H';
        line2[4] = 'o';

        Arrays.fill(line3, ' ');
        line3[0] = 'H';
        line3[18] = 'H';
        line3[6] = 'H';
        line3[10] = 'H';
        line3[12] = 'H';
        line3[16] = 'H';

        Arrays.fill(line4, ' ');
        line4[0] = 'H';
        line4[18] = 'H';
        line4[16] = 'H';

        Arrays.fill(line5, ' ');
        line5[0] = 'H';
        line5[18] = 'H';
        line5[8] = 'H';
        line5[10] = 'H';
        line5[12] = 'H';

        Arrays.fill(line6, ' ');
        line6[0] = 'H';
        line6[18] = 'H';
        line6[8] = 'H';
        line6[10] = '*';

        lines[0] = line1;
        lines[1] = line2;
        lines[2] = line3;
        lines[3] = line4;
        lines[4] = line5;
        lines[5] = line6;

        do {
            System.out.println("--------------------");
            System.out.println("H H H H H H H H H H ");
            System.out.println(finaltrain4.deepToString(lines));
            System.out.println("H H H H H H H H H H ");
            System.out.println("--------------------");
            System.out.println("A左移，D右移，W上移，S下移，请输入你的指令：");
            finaltrain4.input();
        } while (!over);
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
        for (char[] list : charlist) {
            res.append(toString(list));
            if (list != charlist[charlist.length - 1]) {
                res.append("\n");
            }
        }
        return res.toString();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        try {
            switch (command) {
                case "A":
                    moveleft();
                    break;
                case "S":
                    movedown();
                    break;
                case "D":
                    moveright();
                    break;
                case "W":
                    moveup();
                    break;
                default:
                    System.out.println("请输入正确的指令！");
                    System.out.println("A左移，D右移，W上移，S下移，请输入你的指令：");
                    input();
                    break;
            }
        } catch (Exception e) {
            System.out.println("请输入正确的指令！");
            System.out.println("A左移，D右移，W上移，S下移，请输入你的指令：");
            input();
        }
    }

    public void moveup() {
        if (locbx == locpx - 1 && locby == locpy) {
            if (lines[locbx - 1][locpy] == '*') {
                lines[locbx][locby] = ' ';
                lines[locpx][locpy] = ' ';
                lines[locbx - 1][locby] = 'o';
                lines[locpx - 1][locpy] = '&';
                System.out.println("游戏结束");
                over = true;
            } else if (lines[locbx - 1][locpy] == 'H') {
                System.out.println("方向上是墙壁！请重新输入！u1");
            } else {
                lines[locbx - 1][locby] = 'o';
                lines[locbx][locby] = ' ';
                locbx--;

                lines[locpx - 1][locpy] = '&';
                lines[locpx][locpy] = ' ';
                locpx--;
            }
        } else if (lines[locpx - 1][locpy] == 'H') {
            System.out.println("方向上是墙壁！请重新输入！u2");
        } else {
            lines[locpx - 1][locpy] = '&';
            lines[locpx][locpy] = ' ';
            locpx--;
        }
    }

    public void movedown() {
        if (locbx == locpx + 1 && locby == locpy) {
            if (lines[locbx + 1][locpy] == '*') {
                lines[locbx + 1][locby] = 'o';
                lines[locpx + 1][locpy] = '&';
                lines[locbx][locby] = ' ';
                lines[locpx][locpy] = ' ';
                System.out.println("游戏结束");
                over = true;
            } else if (lines[locbx + 1][locpy] == 'H') {
                System.out.println("方向上是墙壁！请重新输入！d1");
            } else {
                lines[locbx + 1][locby] = 'o';
                lines[locbx][locby] = ' ';
                locbx++;

                lines[locpx + 1][locpy] = '&';
                lines[locpx][locpy] = ' ';
                locpx++;
            }
        } else if (lines[locpx + 1][locpy] == 'H') {
            System.out.println("方向上是墙壁！请重新输入！d2");
        } else {
            lines[locpx + 1][locpy] = '&';
            lines[locpx][locpy] = ' ';
            locpx++;
        }
    }

    public void moveleft() {
        if (locpx == locbx && locpy - 2 == locby) {
            if (lines[locbx][locby - 2] == '*') {
                lines[locbx][locby - 2] = 'o';
                lines[locpx][locpy - 2] = '&';
                lines[locbx][locby] = ' ';
                lines[locpx][locpy] = ' ';
                System.out.println("游戏结束");
                over = true;
            } else if (lines[locbx][locby - 2] == 'H') {
                System.out.println("方向上是墙壁！请重新输入！l1");
            } else {
                lines[locbx][locby - 2] = 'o';
                lines[locbx][locby] = ' ';
                locby -= 2;

                lines[locpx][locpy - 2] = '&';
                lines[locpx][locpy] = ' ';
                locpy -= 2;
            }
        } else if (lines[locpx][locpy - 2] == 'H') {
            System.out.println("方向上是墙壁！请重新输入！l2");
        } else {
            lines[locpx][locpy - 2] = '&';
            lines[locpx][locpy] = ' ';
            locpy -= 2;
        }
    }

    public void moveright() {
        if (locpx == locbx && locpy + 2 == locby) {
            if (lines[locbx][locby + 2] == '*') {
                lines[locbx][locby + 2] = 'o';
                lines[locpx][locpy + 2] = '&';
                lines[locbx][locby] = ' ';
                lines[locpx][locpy] = ' ';
                System.out.println("游戏结束");
                over = true;
            } else if (lines[locbx][locby + 2] == 'H') {
                System.out.println("方向上是墙壁！请重新输入！r1");
            } else {
                System.out.println("r3");
                lines[locbx][locby + 2] = 'o';
                lines[locbx][locby] = ' ';
                locby += 2;

                lines[locpx][locpy + 2] = '&';
                lines[locpx][locpy] = ' ';
                locpy += 2;
            }
        } else if (lines[locpx][locpy + 2] == 'H') {
            System.out.println("方向上是墙壁！请重新输入！r2");
        } else {
            lines[locpx][locpy + 2] = '&';
            lines[locpx][locpy] = ' ';
            locpy += 2;
        }
    }
}