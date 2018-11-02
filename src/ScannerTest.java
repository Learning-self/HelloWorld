import java.util.Scanner;

/*输入多个数字，并求其总和与平均数
 * 每次输入一个数字需要用回车确认，通过输入非数字来结束输入并输出执行结果*/
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
            count++;
        }

        System.out.printf("总共输入%d个数字，和为：%.2f,平均数为：%.2f", count, sum, (sum / count));
        sc.close();
    }
}
