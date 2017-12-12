package main.pers.qinaoyun.exception.routine;

/**
 * Description:测试异常
 *
 * @author qinaoyun
 *         Date: 2017-12-11
 *         Time: 15:45
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println(
                "originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Throwable {
        try {
            f();
        } catch (Exception e) {
            System.out.println(
                    "Inside g(), e.printStackTrace()");
            e.printStackTrace();
            throw e; // 17
// throw e.fillInStackTrace(); // 18
        }
    }

    public static void main(String[] args) throws Throwable {
        try {
            g();
        } catch (Exception e) {
            System.out.println(
                    "Caught in main, e.printStackTrace()");
            e.printStackTrace();
        }
    }
} ///:~
