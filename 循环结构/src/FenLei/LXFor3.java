package FenLei;
//需求：求5的阶乘
public class LXFor3 {
    public static void main(String[] args) {
        int jc=1;
        for (int x=1;x<=5;x++){
            jc *=x;
            //可以直接从2开始
        }
        System.out.println("5的阶乘:"+jc);
    }
}
