import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {
    public static void main(String[] args) throws IOException {
        String str;
        //使用 System.in 创建 BufferedReader 对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text");
        System.out.println("Enter 'end' to quit");

        //从标准输入中读取一个字符串需要使用BufferedReader的readLine()方法
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
