package ShiYong;
//获取三个数中的最大值
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个值");
        int x= sc.nextInt();
        System.out.println("请输入二个值");
        int y= sc.nextInt();
        System.out.println("请输入三个值");
        int z= sc.nextInt();
        int max;
        if(x>y){
            if(x>z) {
                max = x;
            }else if(x==z){
                System.out.println("无最大值");
            } else {
                max=z;
            }
        }else if (z<y&&x!=y){
            if (y > z) {
                max = y;
            }else if (y==z){
                System.out.println("无最大值");
        }
    }else{
            System.out.println("无最大值");
        }
   //这里有点混，找找问题 ，水平不行，以后回来看，好像是分类有问题
        }

    }

