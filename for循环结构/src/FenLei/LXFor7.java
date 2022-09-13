package FenLei;
/*
统计1-1000之间同时满足如下条件的数据有多少个：
对3整除余2
对5整除余3
对7整除余2
 */
public class LXFor7 {
    public static void main(String[] args) {
        int count=0;
        for (int x=1;x<=1000;x++){
            if (x%3==2 && x%5==3 && x%7==2){
                count++;
                System.out.println(x);
            }
        }
        System.out.println("满足以上条件的数据有"+count+"个");
    }
}
