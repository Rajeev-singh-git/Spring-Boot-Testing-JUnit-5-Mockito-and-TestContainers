package Service;

import Controller.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {


    @Test
    public void getStudentsTestUsing_AssertTrue(){
        StudentService studentService = new StudentService();
        List<Student> listOfStudent = studentService.getStudents();
        boolean actualResult = listOfStudent.isEmpty();


        assertTrue(actualResult);

        //Message always evaluated, even when the assertion passes, though won't be printed if test pass
        assertTrue(actualResult, "List of student is not empty");

        /* Message only evaluated when the assertion fails, Lazy Load */
        assertTrue(actualResult, ()->"List of student is not empty");

        assertTrue(()->actualResult);  //Boolean Supplier interface
        assertTrue(()->actualResult, "List of student is not empty");
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

        //Message always evaluated, even when the assertion passes, though won't be printed if test pass
        assertEquals(1,actualObject.getId(),"Student Id did not match");

        /* Message only evaluated when the assertion fails, Lazy Load */
        assertEquals(student,actualObject,"Object did not match");

    }

    @Test
    public void getStudentByIdTestUsing_AssertNotEqual(){
        StudentService studentService = new StudentService();

        Student student = new Student(1, "Rajeev");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertNotEquals(2,actualObject.getId());
        assertNotEquals("Rajeev Singh",actualObject.getName());

        assertNotEquals(11,actualObject.getId(),"Student Id is equal"); //Message always evaluated, even when the assertion passes

        assertNotEquals(11,actualObject.getId(),()->"Student Id is equal");
    }


    @Test
    public void getStudentNamesByDepartmentTestUsing_AssertArrayEqual(){

        StudentService studentService = new StudentService();

        Student student = new Student(1,"Rajeev","Science");
        Student student1 = new Student(2,"Ravi","Science");
        Student student2 = new Student(3,"Kavi","Arts");

        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        String[] actualArray = studentService.getStudentNamesByDepartment("Science");
        String[] expectedArray = {"Rajeev","Ravi"};

        assertArrayEquals(expectedArray,actualArray);

        // Message always evaluated, even when the assertion passes
        assertArrayEquals(expectedArray,actualArray, "Student names are not equal");
        /* Message only evaluated when the assertion fails, Lazy Load */
        assertArrayEquals(expectedArray,actualArray, () -> "Student names are not equal");

        Integer[] actualStudentId = studentService.getStudentIdByDepartment("Science");
        Integer[] expectedStudentIds = {1,2};

        assertArrayEquals(expectedStudentIds,actualStudentId);

    }






}