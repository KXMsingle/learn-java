package LuRu;
import java.util.Scanner;
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据");
        int y = sc.nextInt();
        boolean falg=(x==y);
        System.out.println(falg);
    }
}
