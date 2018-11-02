public class StringBufferTest {
    /* String类是不可改变的，所以一旦创建了String对象，它的值就无法改变了。
     * 当需要对字符串进行修改时，应该使用StringBuffer和StringBuilder类
     * 和String类不同，StringBuffer和StringBuilder类的对象能够被对此修改，并且不产生新的未使用对象
     * StringBuffer类和StringBuilder类的区别在于StringBuilder的方法有速度优势，但是不是线程安全的，
     * 因此大多数情况下建议使用StringBuilder类，除非在应用程序要求线程安全的情况下才必须使用StringBuffer类
     * */
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("脚踏实地！");
        strBuffer.append("第一段\n");
        strBuffer.append("第二段\t");
        strBuffer.append("第三段");
        strBuffer.insert(2, "ss");
        System.out.println(strBuffer.reverse());
    }
}
