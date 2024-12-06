package Service;

import Controller.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {


    @Test
    public void getStudentsTest_whenListEmpty(){
        StudentService studentService = new StudentService();
        List<Student> listOfStudent = studentService.getStudents();
        boolean actualResult = listOfStudent.isEmpty();


        assertTrue(actualResult);
        assertTrue(actualResult, "List of student is empty");  //Message will  be printed if assertion fails

        assertTrue(()->actualResult);  //Boolean Supplier interface
        assertTrue(()->actualResult, "List of student is empty");  //Message will  be printed if assertion fails


    }






}