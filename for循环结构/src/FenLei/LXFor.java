package FenLei;
//在控制台输出数据1-10
public class LXFor {
    public static void main(String[] args) {
        //原始做法
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);


        //for做法
        for (int x=1;x<=10;x++) {
            System.out.println(x);
        }
            //重0开始
            for (int a=0;a<10;a++){
                System.out.println(a+1);
            }
            //输入数据10-1
        for(int b=10;b>=2;b--) {
            System.out.println(b - 1);
        }
        for (int c=9;c>-1;c--){
            System.out.println(c+1);
        }
        }

    }


