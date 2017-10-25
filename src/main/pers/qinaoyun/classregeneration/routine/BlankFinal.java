package main.pers.qinaoyun.classregeneration.routine;

/**
 * Description:测试final必须初始化
 *
 * @author qinaoyun
 *         Date: 2017-10-25
 *         Time: 10:32
 */
class Poppet {
}

class BlankFinal {
    final int i = 0; // Initialized final
    final int j; // Blank final
    final Poppet p; // Blank final handle

    // Blank finals MUST be initialized
// in the constructor:
    BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet();
    }

    BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet();
    }

    public static void main(String[] args) {
        BlankFinal bf = new BlankFinal();
    }
} ///:~