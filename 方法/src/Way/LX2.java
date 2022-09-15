package Way;
//键盘录入两个数值比较两个数是否相等
import java.util.Scanner;
public class LX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int x = sc.nextInt();
        System.out.println("请输入第二个值");
        int y = sc.nextInt();
        boolean flag = compare(x, y);
        System.out.println(flag);

    }

    public static boolean compare(int a, int b) {
        /*
        if (a==b){
            return true;
        }else{
            return false;
        }
    注意返回值类型，这里是比较的话，就要用boolean类型
         */
        /*三元改进
        boolean compare = ((a == b) ? true : false);
        return compare;

         */

       // 最终版（不建议）：
        return ((a==b)?true:false);



    }
}