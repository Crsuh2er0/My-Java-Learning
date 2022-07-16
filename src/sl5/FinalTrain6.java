package sl5;

import java.util.Scanner;

public class FinalTrain6 {
    int[] stucodes;
    int[] ChineseScores;
    int[] MathsScores;
    int[] EnglishScores;
    double[] avgtemp;
    double[] avgscores;
    int[] sumscores;
    int numstu;

    public static void main(String[] args){
        FinalTrain6 finalTrain6 = new FinalTrain6();
        finalTrain6.input();
    }

    public void input(){
        System.out.println("请输入学生数：");

        Scanner scanner = new Scanner(System.in);
        numstu = Integer.parseInt(scanner.nextLine());
        ChineseScores = new int[numstu];
        MathsScores = new int[numstu];
        EnglishScores = new int[numstu];
        avgtemp = new double[numstu];
        avgscores = new double[numstu];
        sumscores = new int[numstu];
        stucodes = new int[numstu];
        for(int student = 0;student < numstu;student++){
            System.out.println("请输入第 " + (student + 1) + " 个学生的编号：");
            stucodes[student] = Integer.parseInt(scanner.nextLine());
            System.out.println("请输入语文成绩：");
            ChineseScores[student] = Integer.parseInt(scanner.nextLine());
            System.out.println("请输入数学成绩：");
            MathsScores[student] = Integer.parseInt(scanner.nextLine());
            System.out.println("请输入英语成绩：");
            EnglishScores[student] = Integer.parseInt(scanner.nextLine());
            sumscores[student] = ChineseScores[student] + MathsScores[student] + EnglishScores[student];
            avgtemp[student] = (double) sumscores[student] / 3;
            avgscores[student] = (double) ((int) ((avgtemp[student] + 0.005) * 100)) / 100;
        }
        output();
    }

    public void output(){
        System.out.println("学生成绩结果如下");
        System.out.println("-------------------------------------------------------");
        System.out.println("学生编号   语文成绩   数学成绩   英语成绩   平均成绩   总成绩");
        for(int a = 0;a < numstu;a++){
            System.out.println(stucodes[a] + "        " + ChineseScores[a] + "        " + MathsScores[a] + "        " + EnglishScores[a] + "       " + avgscores[a] + "     " + sumscores[a]);
        }
    }
}
