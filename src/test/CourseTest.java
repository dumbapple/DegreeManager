package test;

import model.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CourseTest {
    Course testCourse;

    @Test
    public void testConstructor() {
        testCourse = new Course("CHEM 121", 4, false);
        assertEquals("CHEM 121", testCourse.getName());
        assertEquals(4, testCourse.getCredit());
        assertFalse(testCourse.isUpperYear());
    }
}
