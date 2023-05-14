package testing.theory.kulikov_322_26_03_2023;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import testing.theory.kulikov_322_26_03_2023.testing_Life_cycle.TestingLifecycle;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static testing.theory.kulikov_322_26_03_2023.testing_Life_cycle.ConstantDataLifeCycle.*;

public class TestingLifecycleTest {
    TestingLifecycle testingLifecycle = new TestingLifecycle();

    @DisplayName("ArrayList стадии Жизненного цикла тестирования")
    @Test
    public void stageTest() {
        System.out.println(testingLifecycle.stage());
        int min = 1;
        int max = 8;
        int diff = max - min;
        Random random = new Random();
        int stageNum = random.nextInt(diff + 1) + min;
        Assert.assertTrue(testingLifecycle.stage().contains("Стадия " + stageNum));
    }

    @DisplayName("ArrayList описание стадии Жизненного цикла тестирования")
    @ParameterizedTest
    @MethodSource("isStageExplanationData") //указали, откуда взять данные
    public void isContainsStageExplanation(String stageExplanation, boolean result) { //тестовый метод
        assertEquals(result, testingLifecycle.stageExplanation().contains(stageExplanation)); //тело метода
    }

    static Stream<Arguments> isStageExplanationData() {
        return Stream.of(
                arguments(STAGE_EXPLANATION_1, true),
                arguments(STAGE_EXPLANATION_2, true),
                arguments(STAGE_EXPLANATION_3, true),
                arguments(STAGE_EXPLANATION_4, true),
                arguments(STAGE_EXPLANATION_5, true),
                arguments(STAGE_EXPLANATION_6, true),
                arguments(STAGE_EXPLANATION_7, true),
                arguments(STAGE_EXPLANATION_8, true)
        );
    }

    @DisplayName("ArrayList название стадии Жизненного цикла тестирования")
    @ParameterizedTest
    @MethodSource("isStageDescriptionData") //указали, откуда взять данные
    public void isContainsStageDescription(String stageDescription, boolean result) { //тестовый метод
        assertEquals(result, testingLifecycle.stageDescription().contains(stageDescription)); //тело метода
    }

    static Stream<Arguments> isStageDescriptionData() {
        return Stream.of(
                arguments(STAGE_DESCRIPTION_1, true),
                arguments(STAGE_DESCRIPTION_2, true),
                arguments(STAGE_DESCRIPTION_3, true),
                arguments(STAGE_DESCRIPTION_4, true),
                arguments(STAGE_DESCRIPTION_5, true),
                arguments(STAGE_DESCRIPTION_6, true),
                arguments(STAGE_DESCRIPTION_7, true),
                arguments(STAGE_DESCRIPTION_8, true)
        );
    }

    @DisplayName("HashMap Жизненный цикл тестирования")
    @ParameterizedTest
    @MethodSource("KeyTestingLifecycleData") //указали, откуда взять данные
    public void isContainsKeyTestingLifecycle(String keyTestingLifecycle, boolean result) { //тестовый метод
        assertEquals(result, testingLifecycle.testingLifecycle().containsKey(keyTestingLifecycle)); //тело метода
    }

    static Stream<Arguments> KeyTestingLifecycleData() {
        return Stream.of(
                arguments("Стадия 1", true),
                arguments("Стадия 2", true),
                arguments("Стадия 3", true),
                arguments("Стадия 4", true),
                arguments("Стадия 5", true),
                arguments("Стадия 6", true),
                arguments("Стадия 7", true),
                arguments("Стадия 8", true)
        );
    }

    @Test
    public void testingLifecycleTest() {
        System.out.println(testingLifecycle.testingLifecycle());
//        System.out.println(testingLifecycle.testingLifecycle().containsKey(""));
//        System.out.println(testingLifecycle.testingLifecycle().containsValue(""));
    }
}
