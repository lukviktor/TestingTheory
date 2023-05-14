package testing.theory.kulikov_322_26_03_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import testing.theory.kulikov_322_26_03_2023.basic_principles_testing.PrinciplesTestingBasic;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static testing.theory.kulikov_322_26_03_2023.basic_principles_testing.ConstantDatsPrinciplesTesting.*;

public class PrinciplesTestingBasicTest {
    PrinciplesTestingBasic principlesTestingBasic = new PrinciplesTestingBasic();

    @DisplayName("ArrayList Основные принципы тестирования номер")
    @Test
    public void stageTest() {
        System.out.println(principlesTestingBasic.principlesNumber());
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int stageNum = random.nextInt(diff + 1) + min;
        System.out.println(stageNum);
        Assertions.assertTrue(principlesTestingBasic.principlesNumber().contains("Принцип тестирования " + stageNum));
    }

    @DisplayName("ArrayList Названия принципов тестирования")
    @ParameterizedTest
    @MethodSource("isPrinciplesTestingData") //указали, откуда взять данные
    public void isContainsStageExplanation(String principlesTesting, boolean result) { //тестовый метод
        assertEquals(result, principlesTestingBasic.principlesTesting().contains(principlesTesting)); //тело метода
    }

    static Stream<Arguments> isPrinciplesTestingData() {
        return Stream.of(
                arguments(PRINCIPLES_TESTING_1, true),
                arguments(PRINCIPLES_TESTING_2, true),
                arguments(PRINCIPLES_TESTING_3, true),
                arguments(PRINCIPLES_TESTING_4, true),
                arguments(PRINCIPLES_TESTING_5, true),
                arguments(PRINCIPLES_TESTING_6, true),
                arguments(PRINCIPLES_TESTING_7, true)
        );
    }

    @DisplayName("ArrayList Описание принципов тестирования")
    @ParameterizedTest
    @MethodSource("isPrinciplesTestingDescriptionData") //указали, откуда взять данные
    public void isContainsStageDescription(String principlesTestingDescription, boolean result) { //тестовый метод
        assertEquals(result, principlesTestingBasic.principlesTestingDescription().contains(principlesTestingDescription)); //тело метода
    }
    static Stream<Arguments> isPrinciplesTestingDescriptionData() {
        return Stream.of(
                arguments(PRINCIPLES_TESTING_DESCRIPTION_1, true),
                arguments(PRINCIPLES_TESTING_DESCRIPTION_2, true),
                arguments(PRINCIPLES_TESTING_DESCRIPTION_3, true),
                arguments(PRINCIPLES_TESTING_DESCRIPTION_4, true),
                arguments(PRINCIPLES_TESTING_DESCRIPTION_5, true),
                arguments(PRINCIPLES_TESTING_DESCRIPTION_6, true),
                arguments(PRINCIPLES_TESTING_DESCRIPTION_7, true)
        );
    }

    @DisplayName("HashMap Основные принципы тестирования")
    @ParameterizedTest
    @MethodSource("KeyTestingLifecycleData") //указали, откуда взять данные
    public void isContainsKeyTestingLifecycle(String keyBasicPrinciplesTesting, boolean result) { //тестовый метод
        assertEquals(result, principlesTestingBasic.basicPrinciplesTesting().containsKey(keyBasicPrinciplesTesting)); //тело метода
    }
    static Stream<Arguments> KeyTestingLifecycleData() {
        return Stream.of(
                arguments("Принцип тестирования 1", true),
                arguments("Принцип тестирования 2", true),
                arguments("Принцип тестирования 3", true),
                arguments("Принцип тестирования 4", true),
                arguments("Принцип тестирования 5", true),
                arguments("Принцип тестирования 6", true),
                arguments("Принцип тестирования 7", true),
                arguments("Принцип тестирования 8", false)
        );
    }
}
