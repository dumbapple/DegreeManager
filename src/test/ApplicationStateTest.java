package test;

import model.ApplicationState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationStateTest {

    private ApplicationState testState;

    @Test
    public void testConstructor() {
        testState = new ApplicationState();
        assertTrue(testState.isRunning());
        assertNotNull(testState.getStudent());
        assertNotNull(testState.getInput());
        assertEquals("Science", testState.getFaculty().getName());
        }
    }