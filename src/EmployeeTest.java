public class EmployeeTest {
    public static void main(String[] args) {
        /*使用构造函数创建两个对象*/
        Employee a = new Employee("小强");
        Employee b = new Employee("大黄");

        /*调用这两个对象的成员方法*/
        a.setAge(22);
        a.setDestination("广东湛江");
        a.setSalary(12000);
        a.printInfo();

        b.setAge(33);
        b.setDestination("福建泉州");
        b.setSalary(10000);
        b.printInfo();
        
    }
}
