package Way;
//需求：键盘录入三个数据，返回三个数中的最大值
import java.util.Scanner;
public class LX3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个值");
        int x= sc.nextInt();
        System.out.println("请输入第二个值");
        int y= sc.nextInt();
        System.out.println("请输入第三个值");
        int z= sc.nextInt();
        int result=max(x,y,z);
        System.out.println(result);
    }
    public static int max(int a,int b,int c){
        /*if(a>b){
            if (a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if (b>c){
                return b;
            }else{
                return c;
            }
        }


         */
       // 三元改进
        if(a>b){
            return (a>c)?a:c;
        }else{
            return (b>c)?b:c;
        }



      /*
       int temp=(a>b)?a:b;
        int e=(temp>c)?temp:c;
        return e;

       */

/*
        int e=(((a>b)?a:b)>c)?((a>b)?a:b):c;
        return e;
        或者
        return (((a>b)?a:b)>c)?((a>b)?a:b):c;
        不建议
        */
    }
}
