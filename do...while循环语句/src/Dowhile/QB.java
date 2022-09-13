package Dowhile;
/*
    循环语句的区别：
    do...while循环至少执行一次
    而for，while循环必须先判断条件是否成立，然后再决定是否执行循环语句体
 */
public class QB {
    public static void main(String[] args) {
        int x=3;
        do {
            System.out.println("hello");
            x++;
        }while(x<3);
        //会输入一次hello
        for (int y=3;y<3;y++){
            System.out.println("hello");
        }
        int z=3;
        while(z<3){
            System.out.println("hello");
            z++;
        }
        //不会输出hello
    }
}
