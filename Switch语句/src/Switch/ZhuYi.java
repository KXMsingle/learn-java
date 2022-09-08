package Switch;
import java.util.Scanner;
public class ZhuYi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个值");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
                /*
                这里添加
                case 1:
                System.out.println("星期一");
                break;
                报错，原因：case的值重复
                 */
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
                /*
                这里改为
                int number=3(放在switch格式外)
                 case number:
                System.out.println("星期三");
                break;
                报错，原因：case后的值只能是常量
                 */
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            /*break可以省略，但是省略后就会导致走到此处并应该停止的的值继续向下运算
            PS：省掉上面的break，输入5，则结果为
            星期五
            星期六
            这个现象为：case穿透
             */
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
                //这个可以，不影响结果，但不建议
/*default可以省略，但是不正确的数据没有处理，即不给出提示
default可以出现在任意位置，但是建议在最后（逻辑上）
 */
      //遇到break结束，或者，执行到末尾
        }
    }
}
