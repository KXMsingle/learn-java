package 运算;

public class YunSuan {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=20;
        b=++a;
        System.out.println("b:"+b);//11
        System.out.println("a:"+a);//11
        c=a++;
        System.out.println("c:"+c);//11
        System.out.println("a:"+a);//12

        /*三目运算符格式：
        (比较表达式)?表达式1:表达式2;
        ture输出表达式1，false输出表达式2
         */
        /*
        键盘录入格式：
        import java.util.Scanner;(导包)
        class.....
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)(创建键盘录入对象)
        System.out.println(请输入一个数据)；
        int x=sc.nextInt();(通过对象获取数据)
        }
         */
        //if格式
        int x=20;
        int y=10;
        int z=30;
        int max;
        if (x>y){
            if(x>z){
                max=x;
            }else{
                max=z;
            }
        }else{
            if(y>z){
                max=y;
            }else{
                max=z;
            }
        }
        System.out.println("max:"+max);

    }
}
