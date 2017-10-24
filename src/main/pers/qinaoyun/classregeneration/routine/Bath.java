package main.pers.qinaoyun.classregeneration.routine;

/**
 * Description:测试编译器并不只是为每个句柄创建一个默认对象，因为那样会在许多情况下招致不必要的开销
 *
 * @author qinaoyun
 *         Date: 2017-10-24
 *         Time: 11:33
 */
class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String
            s1 = "Happy",
            s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    private Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        i = 47;
        toy = 3.14f;
        castille = new Soap();
    }

    private void print() {
        if (s4 == null) {
            s4 = "Joy";
        }
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("i = " + i);
        System.out.println("toy = " + toy);
        System.out.println("castille = " + castille);
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        b.print();
    }

}
