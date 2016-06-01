import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Dummy class to test travis ci mvn test runner.
 */
public class TestClass {

    @Test
    public void testPass() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void testFail() {
        assertTrue(false);
    }

}

