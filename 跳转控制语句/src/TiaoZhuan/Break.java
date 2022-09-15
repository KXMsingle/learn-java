package TiaoZhuan;
/*
break使用场景：
A：switch语句中
B：循环语句中
（循环语句中加入了if语句的情况）
脱离以上两个场景的break无意义
 */
import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数据");
        int x=sc.nextInt();
        switch (x){
            case 1:
                System.out.println("1");
             break;
             case 2:
                 System.out.println("2");
                 break;
            default:
                System.out.println("你输入的数据错误");
                break;
        }
        for (int c=1;c<=10;c++){
            if (c==3){
                break;
            }
            System.out.println("hello");
        }
        for (int y=1;y<=5;y++){
            for(int z=1;z<=5;z++){
                if (y>=3){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_________________");
        //两行五列*
        for (int s=1;s<=5;s++){
            for(int z=1;z<=5;z++){
                if (z==3){
                    break;//五行两列*
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //五行两列*
        System.out.println("______________");
        wc:for (int q=1;q<=5;q++){
            nc:for(int w=1;w<=5;w++){
                if (w==3){
                    //break wc;一行两列*
                    //break nc;五行两列*
                  break ;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
