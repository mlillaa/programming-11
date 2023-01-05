import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    static int studentId = 0;
    private int studentNum;

    //student constructor, randomizes each students' grade
    Student(){
        firstName = "first";
        lastName = "last";
        studentNum = studentId;
        studentId++;
        int rand = (int)(Math.random()*12);
        grade = rand;
    }

    //override to be able to print out student descriptions
    public String toString(){
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNum + "\n";
    }


    //setters + getters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
