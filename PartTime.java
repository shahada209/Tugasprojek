package SISWA;

public class PartTime extends Teacher {
    int hoursWorked;
    int setSalary;

    public PartTime() {
        super();
        int hoursWorked = 0;
        int setSalary = 0;
    }

    public PartTime(int hoursWorked, int setSalary) {
        this.hoursWorked = hoursWorked;
        this.setSalary = setSalary;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSetSalary() {
        return this.setSalary;
    }

    public void setSetSalary(int setSalary) {
        this.setSalary = setSalary;
    }

}