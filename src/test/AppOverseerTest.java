//package test;
//
//import model.AppOverseer;
//import model.Specialization;
//import model.Student;
//import model.StudentManager;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class ApplicationOverseerTest {
//    AppOverseer testState;
//    StudentManager testManager;
//    Student testStudent;
//    Specialization biology;
//
//    @BeforeEach
//    public void setup() {
//        biology = new Specialization("BIOL");
//        testStudent = new Student("Jack Sparrow", 25912163, 2, biology);
//        testManager = new StudentManager(testStudent);
//        testState = new AppOverseer();
//        testState.setStudentManager(testManager);
//    }
//
//    @Test
//    public void testConstructor() {
//        assertTrue(testState.isRunning());
//        assertTrue(testState.getStudentManager().equals(testManager));
//    }
//
//    @Test
//    public void testSetOver() {
//        testState.setOver();
//        assertFalse(testState.isRunning());
//    }
//}
