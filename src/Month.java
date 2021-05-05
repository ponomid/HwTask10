public class Month {

    private String name;
    private int days;
    private int workingDays;

    public Month(String name, int days, int workingDays) {
        this.name = name;
        this.days = days;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
}
