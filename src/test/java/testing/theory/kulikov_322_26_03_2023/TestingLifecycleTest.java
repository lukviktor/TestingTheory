package testing.theory.kulikov_322_26_03_2023;

import org.junit.jupiter.api.Test;
import testing.theory.kulikov_322_26_03_2023.testing_Life_cycle.TestingLifecycle;

public class TestingLifecycleTest {
    TestingLifecycle testingLifecycle = new TestingLifecycle();

    @Test
    public void test() {
        System.out.println(testingLifecycle.stage());
        System.out.println(testingLifecycle.stageExplanation());
        System.out.println(testingLifecycle.stageDescription());
        System.out.println();
        System.out.println(testingLifecycle.testingLifecycle());
    }
}
