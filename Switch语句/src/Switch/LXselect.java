package Switch;

//模拟单选题
 import java.util.Scanner;
public class LXselect {
    public static void main(String[] args) {
        //因为没法键盘录入得到"A","B"
        System.out.println("65 塞拉斯");
        System.out.println("66 琪亚娜");
        System.out.println("67 拉亚斯特");
        System.out.println("68 古拉加斯");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的选择:");
        int choicenumber=sc.nextInt();
        //强制转化为字符类型
        char choice=(char)choicenumber;
        switch(choice){
            case 'A':
                System.out.println("超模");
                break;
            case 'B':
                System.out.println("小超模");
                break;
            case 'C':
                System.out.println("巨超模");
                break;
            case 'D':
                System.out.println("欢乐啤酒人");
                break;
            default:
                System.out.println("你输入的选项错误");
                break;
        }
    }

}
