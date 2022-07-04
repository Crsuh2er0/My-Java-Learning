package sl5;

public class Train4 {
    public static void main(String[] args){
        char[][] poetry = {{'春','眠','不','觉','晓'},{'处','处','闻','啼','鸟'},{'夜','来','风','雨','声'},{'花','落','知','多','少'}};
        for(int a = 0;a < poetry.length;a++){
            for(int b = 0;b < poetry[a].length;b++){
                System.out.println(poetry[a][b]);
            }
        }
        for(int a = 0;a < poetry.length;a++){
            for(int b = 0;b < poetry.length;b++){
                System.out.println(poetry[b][a]);
            }
        }
    }
}
