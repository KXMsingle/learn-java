package LianXi;
/*
键盘录入两个数据并对这两个数据求和

 */
import java.util.Scanner;
public class Lian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据");
        int y = sc.nextInt();
        int sum=x+y;
        System.out.println(sum);
    }
}
