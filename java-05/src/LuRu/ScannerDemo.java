package LuRu;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {


        //练习：键盘录入两个数据并比较大小


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据");
        int y = sc.nextInt();
        int max = (x > y) ? x : y;
        System.out.println("max:"+max);



    }
}

