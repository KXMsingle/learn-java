package YuJuJieGou;
import java.util.Scanner;
//选择结构演示
public class XuanZe {
    /*
        选择结构：
        格式一：if语句；语句体(比较表达式）
        格式二：else语句
        格式三：else...语句
         */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        //if语句体
        /*格式：if(比较表达式){
        语句体;}
         */
        System.out.println("请输入第一个数据");
        int x=sc.nextInt();
        System.out.println("请输入第二个数据");
        int y=sc.nextInt();
        if (x == 10) {
            System.out.println("x等于10");
        }
        System.out.println("over");
        if (y == 10) {
            System.out.println("x等于10");
        }
        System.out.println("over");
        /*else
        格式：if(表达式）{
        语句体一;
        }else{语句体2；}
         */
        System.out.println("请输入第三个数据");
        int q=sc.nextInt();
        System.out.println("请输入第四个数据");
        int w=sc.nextInt();

        if (q == w) {
            System.out.println("q=w");
        } else {
            System.out.println("q！=w");
        }
        System.out.println("over");
        /*
        else...语句格式:
        if(关系表达式1){
        语句体1；
        }else if(关系表达式2{
        语句体2；
        }
        ...
        else{
        语句体n+1;
        }
         */
        /*
        0~20差
        20~40较差
        40~60一般
        60~80较优
        80~100优秀
         */
        /*System.out.println("请输入你的考试成级");
        int r=sc.nextInt();
        if(r<=20){
            System.out.println("差");
        }else if (r<=40){
            System.out.println("较差");
        }else if(r<=60){
            System.out.println("一般");
        }else if(r<=80){
            System.out.println("较优");
        }else{
            System.out.println("优秀");
        }
        错误数据有问题,边界数据也有问题，所以要改进
        */
        System.out.println("请输入你的考试成级");
        int r=sc.nextInt();
        if(r>=0&r<=20){
            System.out.println("差");
        }else if (r>20&r<=40){
            System.out.println("较差");
        }else if(r>40&r<=60){
            System.out.println("一般");
        }else if(r>60&r<=80){
            System.out.println("较优");
        }else if(r<80&r<=100){
            System.out.println("优秀");
        }else{
            System.out.println("输入的成绩有误");
        }
//注意：要考虑，正确数据，边界数据，错误数据这三个数据的结果是否正确
/*
或者
以if(r<0||r>100){
            System.out.println("输入的成绩有误");
        }
 */
    }
}

