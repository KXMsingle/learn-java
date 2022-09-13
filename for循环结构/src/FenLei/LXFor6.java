package FenLei;
//统计水仙花有多少个
public class LXFor6 {
    public static void main(String[] args) {
        int count=0;
        for (int x=100;x<=999;x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==x){
                count++;
            }
        }
        System.out.println("水仙花的个数："+count);
    }
}
