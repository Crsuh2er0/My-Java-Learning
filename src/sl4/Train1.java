package sl4;

public class Train1 {
    public static void main(String args[]){
        String level;
        int score = 70;
        if (score >= 90){
            level = "优秀";
        } else if(score >= 80){
            level = "良好";
        } else if(score >= 60){
            level = "合格";
        } else {
            level = "不合格";
        }
    }
}
