package Dowhile;
/*
需求：输出一个4行5列的*图案
 */
public class LX {
    public static void main(String[] args) {
        //原始做法
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("_______________");
       //输出语句的另一种格式 System.out.print();这个是不换行
        //循环嵌套
        for (int y=0;y<=4;y++) {
            for (int x = 1; x <= 5; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //我们可以通过空的输出语句实现换行：System.out.println();
    }
}
