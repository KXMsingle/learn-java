package Way;
//需求：键盘录入一个数据n(1<n<9)，输出对应的nn乘法表
import java.util.Scanner;
public class LX6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一n的值(0-9)");
        int n=sc.nextInt();
        print(n);

    }
    public static void print(int n){
        for (int x=1;x<=n;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x+"*"+y+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
