package Service;

import Controller.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        students.add(student);
    }


//    public static void main(String[] args){
//        Student s1 = new Student(1,"Raj");
//        StudentService studentService = new StudentService();
//        studentService.addStudent(s1);
//    }


}
