import java.io.File;

/*
 *一个目录其实就是一个File对象，它包含其他文件和文件夹
 *如果创建一个File对象并且它是一个目录，那么调用isDirectory()方法会返回true.
 *可以通过调用该对象上的list()方法，来提取它包含的文件和文件夹的列表
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "./";

        listDir(dirname);
    }

    public static void listDir(String dirname) {
        File f = new File(dirname);
        if (f.isDirectory()) {
            System.out.println("目录" + dirname + " : ");
            String[] s = f.list();
            for (int i = 0; i < s.length; i++) {
                File temp = new File(dirname + "/" + s[i]);
                if (temp.isDirectory()) {
                    System.out.println("\t" + s[i] + " 是一个目录");
                    DirList.listDir(dirname + "/" + s[i]);
                } else {
                    System.out.println("\t" + s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
        }
    }

    public static void deleteDir(File dirname) {
        File[] files = listFiles(dirname);
        if (files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    DirList.deleteDir(file);
                } else {
                    file.delete();
                }
            }
        }
    }

    public static File[] listFiles(File dirname) {
        File[] arr = {};
        File f = dirname;
        if (f.isDirectory()) {
            String[] files = f.list();
            for (int i = 0; i < files.length; i++) {
                File temp = new File(dirname + "/" + files[i]);
                arr[i] = temp;
                temp = null;
            }
            return arr;
        } else {
            return arr;
        }
    }
}
