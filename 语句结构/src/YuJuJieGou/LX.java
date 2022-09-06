package YuJuJieGou;
/*
A:获取两个数据中较大的值
B:判断一个数据是奇数还是偶数
 */
import java.util.Scanner;
public class LX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //A:获取两个数据中较大的值
        System.out.println("请输入第一个数据");
        int x=sc.nextInt();
        System.out.println("请输入第二个数据");
        int y=sc.nextInt();
        int max;

        if (x>y){
           max=x;
        }else{
             max=y;
        }
        System.out.println("max:"+max);
        //B:判断一个数据是奇数还是偶数
        System.out.println("请输入你要判断的数据");
        int a=sc.nextInt();
       if(a%2==0){
           System.out.println(a+"这个数据是偶数");
       }else{
           System.out.println(a+"这个数据是奇数");
       }

    }
}
