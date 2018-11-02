import java.io.File;
import java.io.FilenameFilter;

public class FilterFile implements FilenameFilter {
    public static void main(String[] args) {
        new FilterFile().diffFile("C:/Users/Rain/IdeaProjects/HelloWorld/");
    }

    public void diffFile(String dirname) {
        File f = new File(dirname);
        String[] filenames1 = f.list();
        for (String filename : filenames1) {
            System.out.print(filename + "\t");
        }
        System.out.println();
        System.out.println("******************************");
        String[] filenames2 = f.list(this);
        for (String filename : filenames2) {
            System.out.print(filename + "\t");
        }
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}
