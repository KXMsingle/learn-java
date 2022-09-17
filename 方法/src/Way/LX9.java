package Way;
/*
需求：比较两个数是否相等，参数类型分别为：
两个byte类型，两个short类型，两个int类型，两个long类型
并在mian方法中测试
 */
public class LX9 {
    public static void main(String[] args) {
        //测试
        byte b1=2;
        byte b2=3;
        System.out.println("byte:"+compare(b1,b2));
        short b3=5;
        short b4=5;
        System.out.println("short:"+compare(b3,b4));



    }
    //byte类型
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    //short类型
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }
    //int类型
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    //long类型
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
}
