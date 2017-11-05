package main.pers.qinaoyun.objectaccommodation.routine;

import java.util.Vector;

/**
 * Description:测试toString方法
 *
 * @author qinaoyun
 *         Date: 2017-11-05
 *         Time: 9:04
 */
public class CrashJava {
    public String toString() {
        return "CrashJava address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(new CrashJava());
        }
        System.out.println(v);
    }
} ///:~
