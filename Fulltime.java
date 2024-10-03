package SISWA;


public class Fulltime extends Teacher {
    int anualSalary;
    String unit;
   
    public Fulltime(){
        super();
        int anualSalary = 0;
        String unit  = "";
    }

    public Fulltime(int anualSalary, String unit){
        this.anualSalary = anualSalary;
        this.unit = unit;

    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



}