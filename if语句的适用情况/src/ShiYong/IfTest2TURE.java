package ShiYong;
//获取三个数中的最大值
import java.util.Scanner;
public class IfTest2TURE {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个值");
        int x = sc.nextInt();
        System.out.println("请输入二个值");
        int y = sc.nextInt();
        System.out.println("请输入三个值");
        int z = sc.nextInt();
        int max;
        if (x==y||y==z||x==z) {
            System.out.println("无最大值");
        }else if(x>y){
            if (x>z){
                max=x;
            }else{
                max=z;
        }
            }else{
            if(y>z){
                max=y;
            }else{
                max=z;
            }
        }
        System.out.println("max"+max);*/
        //为什么上面这个不行，max缺乏初始量值
        int x=10;
        int y=20;
        int z=30;
        int max;
        if(x>y){
            if (x>z){
                max=x;
            }else{
                max=z;
            }
        }else{
            if(y>z){
                max=y;
            }else{
                max=z;
            }
        }
        System.out.println(max);
        }
    }
