package main.pers.qinaoyun.polymorphic.routine;

/**
 * Description:测试继承和组合
 *
 * @author qinaoyun
 *         Date: 2017-11-03
 *         Time: 9:51
 */
interface Actor {
    void act();
}

class HappyActor implements Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor implements Actor {
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    Actor a = new HappyActor();

    void change() {
        a = new SadActor();
    }

    void go() {
        a.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage s = new Stage();
        s.go(); // Prints "HappyActor"
        s.change();
        s.go(); // Prints "SadActor"
    }
} ///: