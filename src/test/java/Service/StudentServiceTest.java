package Service;

import Controller.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {


    @Test
    public void getStudentsTestUsing_AssertTrue(){
        StudentService studentService = new StudentService();
        List<Student> listOfStudent = studentService.getStudents();
        boolean actualResult = listOfStudent.isEmpty();


        assertTrue(actualResult);
        assertTrue(actualResult, "List of student is not empty");  //Message will  be printed if assertion fails

        assertTrue(()->actualResult);  //Boolean Supplier interface
        assertTrue(()->actualResult, "List of student is not empty");  //Message will  be printed if assertion fails
    }


    @Test
    public void getStudentsTestUsing_AssertFalse(){
        StudentService studentService = new StudentService();

        Student student = new Student(1,"Rajeev");
        List<Student> listOfStudent = studentService.getStudents();

        listOfStudent.add(student);

        boolean actualResult = listOfStudent.isEmpty();

        assertFalse(actualResult);
        assertFalse(actualResult, "Student List must not be empty !!! ");

        assertFalse(()->actualResult);
        assertFalse(()->actualResult,"Student List must not be empty !!! ");

        assertFalse(actualResult, () -> "Student List must not be empty !!! ");

    }







}