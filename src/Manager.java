public class Manager extends Employee {

    private int workerCount;

    public Manager(String name, int age, char sex, int salary, int workerCount) {
        super(name, age, sex, salary);
        this.workerCount = workerCount;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int result = super.getSalary(monthArray);

        result += result * (getWorkerCount() / 100.0);
        return result;
    }
}
    //    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день
//    и количество подчиненных. Все поля сделать приватными и для каждого поля
//    обавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

//  public double getSalary(Month[] monthArray) {
//      double sum = 0;
//      for (int i = 0; i < monthArray.length; i++) {
//          sum += salaryPerDay * monthArray[i].workingDays * (workers / 100);
//      } return sum;
//  }