import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*从控制台读取多字符输入*/
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        char c;
        //使用 System.in 创建 BufferedReader对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'键退出");

        //读取字符
        do {
            //每次调用read()方法，它从输入流读取一个字符并把该字符作为整数值返回；当流结束的时候返回-1。
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
