package ShiYong;
/*
键盘录入月份的值并输出对应的季节
春：3，4，5
夏：6，7，8
秋：9，10，11
冬：12，1，2
 */
import java.util.Scanner;
public class IfTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        int month= sc.nextInt();
        if(month<1||month>12){
            System.out.println("你输入的月份有误");
        }else if (month>=3&&month<=5){
            System.out.println("春季");
        }else if (month>=6&&month<=8){
            System.out.println("夏季");
        }else if (month>=9&&month<=11){
            System.out.println("秋季");
        }else{
            System.out.println("冬季");
        }

    }
}
