public class PrimitiveType {
    public static void main(String[] args) {
        //byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类型 java.lang.Byte");
        System.out.println("Byte最大值：" + Byte.MAX_VALUE);
        System.out.println("Byte最小值：" + Byte.MIN_VALUE);

        System.out.println();
        //short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类型 java.lang.Short");
        System.out.println("Short最大值：" + Short.MAX_VALUE);
        System.out.println("Short最小值：" + Short.MIN_VALUE);

        System.out.println();
        //int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类型 java.lang.Integer");
        System.out.println("Integer最大值：" + Integer.MAX_VALUE);
        System.out.println("Integer最小值：" + Integer.MIN_VALUE);

        System.out.println();
        //long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类型 java.lang.Long");
        System.out.println("Long最大值：" + Long.MAX_VALUE);
        System.out.println("Long最小值：" + Long.MIN_VALUE);

        System.out.println();
        //float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类型 java.lang.Float");
        System.out.println("Float最大值：" + Float.MAX_VALUE);
        System.out.println("Float最小值：" + Float.MIN_VALUE);

        System.out.println();
        //double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类型 java.lang.Double");
        System.out.println("Double最大值：" + Double.MAX_VALUE);
        System.out.println("Double最小值：" + Double.MIN_VALUE);

        System.out.println();
        //char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类型 java.lang.Character");
        /*以数值形式而不是字符形式将Character的最大值和最小值输出到控制台*/
        System.out.println("Character最大值：" + (int) Character.MAX_VALUE);
        System.out.println("Character最小值：" + (int) Character.MIN_VALUE);
    }
}
