import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*剪辑特定长度的音频，并将它们剪辑在一起*/
public class MusicCompound {
    /*
     * 1、使用FileInputStream输入两个音频
     * 2、使用FileInputStream的skip(long n)方法跳过特定字节长度的音频文件【eg: skip(1024*1024*3) 这样就能丢弃音频文件前面的3MB的内容】
     * 3、截取中间的特定的长度的音频文件：每次输入8kb内容，使用count记录输入次数，达到设置的次数就终止音频输入。
     * 4、往同一个输出流FileOutputStream中输出音频，并生成文件，实现音频混合
     * */

    public static void main(String[] args) {
        FileOutputStream fop = null;
        FileInputStream fip1 = null;
        FileInputStream fip2 = null;
        String fileNames[] = {"C:\\Users\\Rain\\IdeaProjects\\HelloWorld\\demomusic\\星月神话.mp3", "C:\\Users\\Rain\\IdeaProjects\\HelloWorld\\demomusic\\我只在乎你.mp3"};
        //设置byte数组，每次往输出流中传入8k的内容
        byte[] by1 = new byte[1024 * 64];
        byte[] by2 = new byte[1024 * 64];
        try {
            fop = new FileOutputStream("C:\\Users\\Rain\\IdeaProjects\\HelloWorld\\demomusic\\合并.mp3");
            fip1 = new FileInputStream(fileNames[1]);
            fip2 = new FileInputStream(fileNames[0]);
//                fip.skip(1024 * 1024 * 3);
            int count = 0;
            while (fip1.read(by1) != -1 && fip2.read(by2) != -1) {
                if (count % 2 == 0) {
                    fop.write(by1);
                } else {
                    fop.write(by2);
                }
                count++;
                System.out.println(count);
                //截取中间的2M【(1024*1024*2)/(1024*8)】
//                if (count == (1024 * 2 / 8)) {
//                    break;
//                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //输出完成后关闭输入和输出流
                fip1.close();
                fip2.close();
                fop.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
