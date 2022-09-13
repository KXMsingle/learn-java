package Whille;
/*
练习：用while循环实现
左边：求出1-100之和
右边：统计水仙花数有多少个
 */

public class LXWhile {
    public static void main(String[] args) {
        int x=1;
        int sum=0;
        while(x<=100){
            sum+=x;
            x++;
        }
        System.out.println("sum:"+sum);
       int a=100;
       int count=0;
       while(a<=999){
          int ge=a%10;
          int shi=a/10%10;
          int bai=a/10/10%10;
          if (ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
              count++;
          }
          a++;
        }
        System.out.println("水仙花数有"+count+"个");



    }
}
