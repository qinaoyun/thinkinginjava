package main.pers.qinaoyun.objectaccommodation.routine;

import java.util.Hashtable;

/**
 * Description:覆盖hashCode 和equals 情况下，可以取出想要的数据
 *
 * @author qinaoyun
 *         Date: 2017-11-05
 *         Time: 15:41
 */
class Groundhog2 {
    int ghNumber;

    Groundhog2(int n) {
        ghNumber = n;
    }

    public int hashCode() {
        return ghNumber;
    }

    public boolean equals(Object o) {
        return (o instanceof Groundhog2)
                && (ghNumber == ((Groundhog2) o).ghNumber);
    }
}

public class SpringDetector2 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        for (int i = 0; i < 10; i++) {
            ht.put(new Groundhog2(i), new Prediction());
        }
        System.out.println("ht = " + ht + "\n");
        System.out.println(
                "Looking up prediction for groundhog #3:");
        Groundhog2 gh = new Groundhog2(3);
        if (ht.containsKey(gh)) {
            System.out.println((Prediction) ht.get(gh));
        }
    }
} ///:~
