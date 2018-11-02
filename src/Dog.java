public class Dog {
    //成员变量
    int age;
    String name;

    //构造方法
    public Dog(String name) {
        this.name = name;
        System.out.println("此狗名为：" + name);
    }

    //成员方法
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println("此狗年龄为：" + this.age);
        return this.age;
    }

    //主函数：测试用例
    public static void main(String[] args) {
        /*创建对象*/
        Dog dog = new Dog("大黄");
        /*通过方法来设置年龄*/
        dog.setAge(88);
        /*调用另一个方法来获取年龄成员变量*/
        dog.getAge();
        /*另一种获取成员变量的方法*/
        System.out.println("姓名成员变量为：" + dog.name);
    }
}
