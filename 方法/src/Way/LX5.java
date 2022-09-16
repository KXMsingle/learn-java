package Way;
//需求：键盘录入行和列，输出星形图案
import java.util.Scanner;
public class LX5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入行数");
        int hang= sc.nextInt();
        System.out.println("请输入列数");
        int lie=sc.nextInt();
        print(hang,lie);
    }
    public static void print(int a,int b){
        for (int x=1;x<=a;x++){
            for (int y=1;y<=b;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
