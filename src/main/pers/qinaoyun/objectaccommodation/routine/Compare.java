package main.pers.qinaoyun.objectaccommodation.routine;

/**
 * Description:compare接口
 *
 * @author qinaoyun
 *         Date: 2017-12-09
 *         Time: 16:55
 */
public interface Compare {
    boolean lessThan(Object lhs, Object rhs);

    boolean lessThanOrEqual(Object lhs, Object rhs);
}
