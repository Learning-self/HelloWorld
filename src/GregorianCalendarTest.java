import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year;
        /*
         *初始化 Gregorian 日历
         * 使用当前时间和日期
         * 默认是本地时间和时区
         * */
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.println(gcalendar.toString());
        /*显示当前时间和日期的信息*/
        System.out.print("Date：");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));

        System.out.print("Time：");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        /*测试当前年份是否为闰年*/
        if (gcalendar.isLeapYear(year)) {
//            System.out.println("当前年份：" + year + "是闰年");
            System.out.printf("当前年份：%d是闰年", year);
        } else {
            System.out.println("当前年份不是闰年！");
        }

        /*Calendar类的月份是从0开始计算，但日期和年份是从1开始计算*/
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 1, 1);
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
        c1.set(2017, 1, 0);
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));

        Calendar c2 = Calendar.getInstance();
        c2.set(2017, 2, 1);
        System.out.println(c2.get(Calendar.YEAR) + "-" + c2.get(Calendar.MONTH) + "-" + c2.get(Calendar.DATE));
        c2.set(2017, 2, 0);
        System.out.println(c2.get(Calendar.YEAR) + "-" + c2.get(Calendar.MONTH) + "-" + c2.get(Calendar.DATE));
        /*Calendar.MONTH为1的时候是2月，且日期和月份是可以为负数的，往前（前一个月、前一年）计算*/
    }
}
