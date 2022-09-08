package Switch;
//键盘录入字符串，判断是否有满足要求的，如果有，则输出，如果没有，则提示有误
import java.util.Scanner;
public class LXas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要判断的字符串");
        String s=sc.nextLine();
        switch (s){
            case"hello":
                System.out.println( "你输入的是hello");
                break;
            case"thanks":
                System.out.println( "你输入的是thanks");
                break;
            case"seven":
                System.out.println( "你输入的是seven");
                break;
            case"nose":
                System.out.println( "你输入的是nose");
                break;
            default:
                System.out.println("无相关字符串");
        }
    }
}
