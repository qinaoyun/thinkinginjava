package main.pers.qinaoyun.polymorphic.routine;

/**
 * Description:
 *
 * @author qinaoyun
 *         Date: 2017-11-02
 *         Time: 18:54
 */
class WithInner {
    class Inner {
    }
}

public class InheritInner
        extends WithInner.Inner {
    //! InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
