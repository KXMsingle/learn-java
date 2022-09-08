package Switch;
/*
switch格式：
switch(表达式){
case值1;
语句体1;
break;
case值2;
语句体2;
break;
.....
default:
语句体n+1;
break;
}
格式解释：表示这是Switch语句
switch:
表达式:这个地方的取值是有限的
   byte,short,int,char
   JDK5以后是枚举
   JDK7以后可以是字符串(string)
   case:后面跟的是要和表达式进行比较的值
   break:表示中断，结束的意思
   default：当所有值都和表达式都不匹配的时候，就执行default的语句（相当于if语句中的else）
 */
//键盘录入一个值，对应输出星期几
import java.util.Scanner;
public class GeShi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数据(1-7）:");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
        }
        //几个固定的值建议适用switch
    }
}
