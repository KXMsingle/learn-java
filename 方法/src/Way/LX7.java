package Way;
//需求：求两个数的和
//方法相同，但参数列表不同的情况下，为了见名知义，java允许他们起一样的名字
import java.util.Scanner;
public class LX7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个值");
        int x= sc.nextInt();
        System.out.println("请输入第二个值");
        int y= sc.nextInt();
        int result=sum(x,y);
        System.out.println(result);

    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
