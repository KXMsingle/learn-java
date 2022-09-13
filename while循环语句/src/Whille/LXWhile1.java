package Whille;
/*
一张纸厚0.01m，折叠多少次的厚度可以不低于珠穆朗玛峰的高度（8848m)
 */
public class LXWhile1 {
    public static void main(String[] args) {
        int count=0;
        double y=8848;
        double x = 0.01;
        while(x<y){
            count++;
            x*=2;
        }
        System.out.println("要叠的次数"+count);

    }
}
