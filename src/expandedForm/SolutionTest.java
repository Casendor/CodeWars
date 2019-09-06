package expandedForm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata.expandedForm(12)); 
        assertEquals("40 + 2", Kata.expandedForm(42)); 
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304)); 
     }
}