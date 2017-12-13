package main.pers.qinaoyun.iostream.routine;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Description:
 *
 * @author qinaoyun
 *         Date: 2017-12-12
 *         Time: 15:57
 */
public class DirList {
    public static void main(String[] args) {
        try {
            File path = new File(".");
            String[] list;
            if (args.length == 0) {
                list = path.list();
            } else {
                list = path.list(new DirFilter(args[0]));
            }
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DirFilter implements FilenameFilter {
    String afn;

    DirFilter(String afn) {
        this.afn = afn;
    }

    public boolean accept(File dir, String name) {
// Strip path information:
        String f = new File(name).getName();
        return f.indexOf(afn) != -1;
    }
} ///:~