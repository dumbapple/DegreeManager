package test;

import model.Course;
import model.Student;
import model.Transcript;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TranscriptTest {
    Transcript testTranscript;
    Student testStudent;

    @BeforeEach
    public void setup() {
        testStudent = new Student();
        testTranscript = new Transcript(testStudent);
    }

    @Test
    public void testConstructor() {
        assertEquals(testStudent, testTranscript.getAssociatedStudent());
        assertTrue(testTranscript.getCoursesListed().isEmpty());
    }

    @Test
    public void testCalculateAverage() {
        Course cpsc110 = new Course("CPSC 110", 4, false);
        Course cpsc121 = new Course("CPSC 121", 4, false);
        Course cpsc210 = new Course("CPSC 110", 4, false);
    }
}
