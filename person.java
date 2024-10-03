package SISWA;

class person {
    String name;
    int Age;

    public person() {
        String name = "";
        int Age = 0;

    }

    public person(String name, int Age) {
        this.name = name;
        this.Age = Age;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

}