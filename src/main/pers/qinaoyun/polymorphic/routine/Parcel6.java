package main.pers.qinaoyun.polymorphic.routine;

/**
 * Description:测试内部类的向上转型
 *
 * @author qinaoyun
 *         Date: 2017-10-30
 *         Time: 16:52
 */
public class Parcel6 {
    public Contents cont() {
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        }; // Semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
    }
} ///: