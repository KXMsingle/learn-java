package Dowhile;
/*
注意死循环：
A：一定不能弄丢控制条件语句的变量问题
 */

public class IL {
    public static void main(String[] args) {
        int x=0;
        while(x<=10){
            System.out.println("死循环");
            x++;//若没有则会陷入死循环
        }
        while(true){
            System.out.println("死循环");
        }
/*for (;;){
    System.out.println("死循环");
}
以上两种都是死循环
 */
    }
}
