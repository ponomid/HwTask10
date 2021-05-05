public class Employee {

   private String name;
   private int age;
   private char sex;
   private int salary;

    public Employee(String name, int age, char sex, int salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    //   public double getSalary(Month[] monthArray) {
//       double sum = 0.0;
//       for (int i = 0; i < monthArray.length; i++) {
//           sum += monthArray[i].workingDays * salaryPerDay;
//       } return sum;
//   }

//    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//    Все поля сделать приватными и для каждого поля добавить методы set и get.
//    Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(Month[] monthArray) {
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
         result += monthArray[i].getWorkingDays() * getSalary();
        }
        return result;
    }


}
