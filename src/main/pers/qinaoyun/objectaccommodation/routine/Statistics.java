package main.pers.qinaoyun.objectaccommodation.routine;

import java.util.Hashtable;

/**
 * Description:查看散列的分布
 *
 * @author qinaoyun
 *         Date: 2017-11-05
 *         Time: 14:28
 */
class Counter {
    int i = 1;

    public String toString() {
        return Integer.toString(i);
    }
}

class Statistics {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        for (int i = 0; i < 10000; i++) {
// Produce a number between 0 and 20:
            Integer r =
                    new Integer((int) (Math.random() * 20));
            if (ht.containsKey(r)) {
                ((Counter) ht.get(r)).i++;
            } else {
                ht.put(r, new Counter());
            }
        }
        System.out.println(ht);
    }
} ///:~
