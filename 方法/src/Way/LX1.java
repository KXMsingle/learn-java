package Way;
//键盘录入两个数据，并返回最大的值
import java.util.Scanner;
public class LX1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个值");
        int x= sc.nextInt();
        System.out.println("请输入第二个值");
        int y=sc.nextInt();
        int result=max(x,y);
        System.out.println("较大值是"+result);
    }

   public static int max(int a,int b) {
         /*
   if语句实现
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
    */
//三元改进
       int c=a>b?a:b;
       return c;
       /*
       return ((a>b)?a:b；);
       不建议
        */
   }

}
