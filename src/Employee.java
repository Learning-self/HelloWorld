public class Employee {
    String name;
    int age;
    String destination;
    double salary;

    //构造器
    public Employee(String name) {
        this.name = name;
    }

    //设置age的值
    public void setAge(int age) {
        this.age = age;
    }

    //设置destination的值
    public void setDestination(String destination) {
        this.destination = destination;
    }

    //设置salary的值
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //打印员工信息
    public void printInfo() {
        System.out.println("员工信息：");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("地址：" + destination);
        System.out.println("薪水：" + salary);
    }
}
