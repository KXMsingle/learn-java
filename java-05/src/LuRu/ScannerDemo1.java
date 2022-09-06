package LuRu;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        //键盘录入三个值并求出最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据");
        int y = sc.nextInt();
        System.out.println("请输入第三个数据");
        int z = sc.nextInt();
        int max1=(x>y)?x:y;
        int max=(max1>z)?max1:z;
        System.out.println("max:"+max);
    }
}
