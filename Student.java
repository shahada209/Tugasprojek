package SISWA;

class Student extends person {
    int studentNumber;
    int score;
    String major;

    public Student() {
    
        int studentNumber = 0;
        int score = 0;
        String major = "";
    }

    public Student(int studentNumber, int score, String major) {
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}