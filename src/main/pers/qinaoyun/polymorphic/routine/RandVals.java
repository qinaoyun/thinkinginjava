package main.pers.qinaoyun.polymorphic.routine;

/**
 * Description:
 *
 * @author qinaoyun
 *         Date: 2017-10-30
 *         Time: 9:59
 */
public interface RandVals {
    int rint = (int) (Math.random() * 10);
    long rlong = (long) (Math.random() * 10);
    float rfloat = (float) (Math.random() * 10);
    double rdouble = Math.random() * 10;
}
