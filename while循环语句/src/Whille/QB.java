package Whille;
/*
如果想要使用控制条件的那个变量，则可使用while循环，否则用for循环，因为for循环可以提高内存的效率
 */
public class QB {
    public static void main(String[] args) {
        for (int x=1;x<=10;x++){
            System.out.println("hello");
            System.out.println(x);
            /*
            x最后的值为10
            最后满足判断条件的时候，就不再执行控制条件了
             */
        }
        int y=1;
while(y<=10){
    System.out.println("hello");
    y++;
}
        System.out.println(y);
/*
y最后的值为11
最后足判断条件的时候，任然会再执行一次控制条件
 */
    }
}
