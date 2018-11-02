/*
 *子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。
 *如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
 *如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
 **/

class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("我是父类无参数构造器");
    }

    SuperClass(int n) {
        System.out.println("我是父类有参数构造器");
        this.n = n;
    }
}

class SubClass extends SuperClass {
    private int n;

    SubClass() {
        super(300);
        System.out.println("我是子类无参数构造器");
    }

    public SubClass(int n) {
        System.out.println("我是子类有参数构造器");
        this.n = n;
    }
}

public class SuperSubTest {
    public static void main(String args[]) {
        SubClass sc = new SubClass();
        System.out.println("*************************************");
        SubClass sc2 = new SubClass(200);
    }
}
