package main.pers.qinaoyun.classregeneration.routine;

/**
 * Description:类的加载顺序
 * 1.父类静态成员和静态初始化块，按在代码中出现的顺序依次执行。
 * 2.子类静态成员和静态初始化块，按在代码中出现的顺序依次执行。
 * 3. 父类的实例成员和实例初始化块，按在代码中出现的顺序依次执行。
 * 4.执行父类的构造方法。
 * 5.子类实例成员和实例初始化块，按在代码中出现的顺序依次执行。
 * 6.执行子类的构造方法。
 *
 * @author qinaoyun
 *         Date: 2017-10-25
 *         Time: 11:08
 */
class Insect {
    int i = 9;
    int j;

    Insect() {
        prt("i = " + i + ", j = " + j);
        j = 39;
    }

    static int x1 =
            prt("static Insect.x1 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    int k = prt("Beetle.k initialized");

    Beetle() {
        prt("k = " + k);
        prt("j = " + j);
    }

    static int x2 =
            prt("static Beetle.x2 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 63;
    }

    public static void main(String[] args) {
        prt("Beetle constructor");
//        Beetle b = new Beetle();
    }
} ///:~
