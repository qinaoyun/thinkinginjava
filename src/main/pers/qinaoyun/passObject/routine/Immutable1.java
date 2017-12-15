package main.pers.qinaoyun.passObject.routine;

/**
 * Description:不可变类
 *
 * @author qinaoyun
 *         Date: 2017-12-15
 *         Time: 10:30
 */
public class Immutable1 {
    private int data;

    public Immutable1(int initVal) {
        data = initVal;
    }

    public int read() {
        return data;
    }

    public boolean nonzero() {
        return data != 0;
    }

    public Immutable1 quadruple() {
        return new Immutable1(data * 4);
    }

    static void f(Immutable1 i1) {
        Immutable1 quad = i1.quadruple();
        System.out.println("i1 = " + i1.read());
        System.out.println("quad = " + quad.read());
    }

    public static void main(String[] args) {
        Immutable1 x = new Immutable1(47);
        System.out.println("x = " + x.read());
        f(x);
        System.out.println("x = " + x.read());
    }
} ///:~
