public class FormatTest {
    public static void main(String[] args) {
        String name = "亚瑟";
        int kill = 8;
        String title = "超神";
        String strFormat = "%s 在进行了连续 %d 杀后，获得 %s 称号！";
        int year = 2018;

        /*可以使用 + 进行字符串连接，但是不够规范*/
        /*格式化输出：%s 表示字符串，%d 表示数字， %n 表示换行也可以使用\n */

        System.out.printf(strFormat, name, kill, title);

        //直接打印数字
        System.out.format("%d%n", year);
        System.out.printf("%d%n", year);
        //设置数字长度，默认右对齐
        System.out.printf("%8d\n", year);
        //设置数字长度，设置左对齐
        System.out.printf("%-8d%n", year);
        //设置数字长度，不够的话补零
        System.out.printf("%08d\n", year);
        //千位分隔符
        System.out.printf("%,8d%n", year * 100);
        //限制小数位
        System.out.printf("%1.8f%n", Math.PI);

    }
}
