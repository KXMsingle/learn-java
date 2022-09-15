package TiaoZhuan;
/*
return：返回
它的作用不是用来结束循环的，而是用来结束方法的
 */
public class Return {
    public static void main(String[] args) {
        for (int x=1;x<=10;x++){
            if (x==3){
                System.out.println("退出");
                break;
            }
            System.out.println(x);
        }
        System.out.println("over");
        /*
1
2
退出
over
         */
        System.out.println("____________________");
        for (int x=1;x<=10;x++){
            if (x==3){
                System.out.println("退出");
                continue;
            }
            System.out.println(x);
        }
        System.out.println("over");
        /*
1
2
退出
4
5
6
7
8
9
10
over

         */
        System.out.println("____________________");
        for (int x=1;x<=10;x++){
            if (x==3){
                System.out.println("退出");
                return;
            }
            System.out.println(x);
        }
        System.out.println("over");
        /*
1
2
退出
         */
    }
}
