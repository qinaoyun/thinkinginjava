package main.pers.qinaoyun.classregeneration.routine;

/**
 * Description:用来说明组合和继承
 *
 * @author qinaoyun
 *         Date: 2017-10-24
 *         Time: 16:43
 */
class Engine {
    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }
}

class Wheel {
    public void inflate(int psi) {
    }
}

class Window {
    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left,
            right = new Door();

    Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
} ///:~