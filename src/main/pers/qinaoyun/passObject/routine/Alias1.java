package main.pers.qinaoyun.passObject.routine;

/**
 * Description:测试对象的引用
 *
 * @author qinaoyun
 *         Date: 2017-12-14
 *         Time: 14:49
 */
public class Alias1 {
    int i;

    Alias1(int ii) {
        i = ii;
    }

    public static void main(String[] args) {
        Alias1 x = new Alias1(7);
        Alias1 y = x; // Assign the handle
        System.out.println("x: " + x.i);
        System.out.println("y: " + y.i);
        System.out.println("Incrementing x");
        x.i++;
        System.out.println("x: " + x.i);
        System.out.println("y: " + y.i);
    }
} ///:
