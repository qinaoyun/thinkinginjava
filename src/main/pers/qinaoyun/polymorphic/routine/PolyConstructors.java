package main.pers.qinaoyun.polymorphic.routine;

/**
 * Description: 测试在父类的构造方法中调用子类的方法
 *
 * @author qinaoyun
 *         Date: 2017-11-03
 *         Time: 8:52
 */
abstract class Glyph {
    abstract void draw();

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println(
                "RoundGlyph.RoundGlyph(), radius = "
                        + radius);
    }

    void draw() {
        System.out.println(
                "RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
} ///:~