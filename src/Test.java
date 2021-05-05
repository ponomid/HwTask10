public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Ilia", 25, 'm', 100);
        System.out.println(employee.getSalary(new Month[]{MonthUtils.January}));

        Manager manager = new Manager("Sergey", 30, 'm', 200, 10);
        System.out.println(manager.getSalary(new Month[] {MonthUtils.January}));
    }
}
