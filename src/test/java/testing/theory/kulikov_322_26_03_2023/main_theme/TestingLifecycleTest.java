package testing.theory.kulikov_322_26_03_2023.main_theme;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestingLifecycleTest {
    TestingLifecycle testingLifecycle = new TestingLifecycle();
    public TestingLifecycleTest() throws IOException {
    }

    @Test
    public void test() {
        System.out.println(testingLifecycle.testingLifecycle());
    }
}
