import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
    private static final String regex = "\\bcat\\b";
    private static final String input = "cat cat d cat cat d cat b cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(regex); //创建Pattern对象
        Matcher m = p.matcher(input); //创建Matcher对象
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match Number : " + count);
            System.out.println("start() : " + m.start());
            System.out.println("end() : " + m.end());
        }
    }
}
