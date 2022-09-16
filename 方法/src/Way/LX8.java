package Way;
//求数的和
//方法相同，但参数列表不同的情况下，为了见名知义，java允许他们起一样的名字
public class LX8 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=50;
        float f=10.2f;
        float r=10f;
        System.out.println(sum(a,b));
        System.out.println(sum(a,f));
        System.out.println(sum(a,r));
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));
        System.out.println(sum(a,b,c,d,e));

    }
    public static int sum(int a,int b){
        int sum=a+b;
        System.out.println("int");
        return sum;
    }
    public static int sum(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static int sum(int a,int b,int c,int d){
        int sum=a+b+c+d;
        return sum;
    }
    public static int sum(int a,int b,int c,int d,int e){
        int sum=a+b+c+d+e;
        return sum;
    }
    public static float sum(float a,float b){
        System.out.println("float");
        return a+b;
    }
}
