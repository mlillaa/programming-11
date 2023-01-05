import java.util.ArrayList;

public class School {
    //arraylists for teachers and students
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    //create 10 students
    public void createS() {
        for(int i =0; i<10; i++){
            students.add(new Student());
        }
    }
    //remove 2 students
    public void removeS(){
        students.remove(students.toArray().length-1);
        students.remove(students.toArray().length-1);
    }
    //show students
    public void listS(){
        System.out.println(students.toString());
    }

    //create 3 teachers
    public void createT(){
        for (int i=0; i<3; i++){
            teachers.add(new Teacher());
        }
    }
    //remove 1 teacher
    public void removeT(){
        teachers.remove(teachers.toArray().length-1);
    }
    //show teachers
    public void listT(){
        System.out.println(teachers.toString());
    }


    //setters + getters

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
