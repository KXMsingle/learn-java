package ShiYong;
/*
if语句分别适合做什么事情呢
格式一：适合做单个判断
格式二：适合做两个判断
格式三：适合做多个判断
需求：
键盘录入x的值，计算出y的值并输出
x>=3    y=2x+1;(这里的2x用2*x表示)
-1<=x<3 y=2x;
x<=-1   y=2x-1;
 */
import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入x的值");
        int x=sc.nextInt();
        int y;
        if (x>=3){
            y =2*x + 1;
        }else if (x>=-1&x<3){
            y=2*x;
        }else{
            y=2*x-1;
        }
        System.out.println("y:"+y);
    }

}
