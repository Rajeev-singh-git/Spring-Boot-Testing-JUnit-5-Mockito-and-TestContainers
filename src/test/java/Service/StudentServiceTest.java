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



    @Test
    public void getStudentById_WhenNull(){
        StudentService studentService = new StudentService();

        Student student = new Student(1,"Rajeev");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(2);
        assertNull(actualObject);
        assertNull(actualObject, " Object is not null"); //If test fails message will be printed
    }


    @Test
    public void getStudentById_WhenNotNull(){
        StudentService studentService = new StudentService();

        Student student = new Student(1,"Rajeev");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertNotNull(actualObject);
        assertNotNull(actualObject, "Student is null !!!");
        assertNotNull(actualObject, ()-> "Student is null !!! ");
    }

    @Test
    public void getStudentByIdTestUsingAssertEquals(){
        StudentService studentService = new StudentService();

        Student student = new Student(1, "Rajeev");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertEquals(1,actualObject.getId());
        assertEquals("Rajeev",actualObject.getName());

        assertEquals(student,actualObject);

        assertEquals(1,actualObject.getId(),"Student Id did not match"); //If test fails message will be printed

        assertEquals(student,actualObject,"Object did not match"); //If test fails message will be printed

    }

    @Test
    public void getStudentByIdTestUsing_AssertNotEqual(){
        StudentService studentService = new StudentService();

        Student student = new Student(1, "Rajeev");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertNotEquals(2,actualObject.getId());
        assertNotEquals("Rajeev Singh",actualObject.getName());

        assertNotEquals(11,actualObject.getId(),"Student Id is equal"); //If test fails message will be printed

    }











}