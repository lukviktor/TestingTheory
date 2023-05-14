package testing.theory.kulikov_322_26_03_2023.terminology;

import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static testing.theory.kulikov_322_26_03_2023.terminology.ConstantDataTerminology.*;

public class Terminology {
    //Тестирование программного обеспечения
    @Step("Тестирование программного обеспечения")
    public List<String> softwareTesting() {
        return new ArrayList<>(Arrays.asList(
                SOFTWARE_TESTING_1,
                SOFTWARE_TESTING_2,
                SOFTWARE_TESTING_3
        ));
    }

    @Step("Вывод на печать Тестирование программного обеспечения")
    public void softwareTestingOutput() {
        softwareTesting().forEach(System.out::println);
    }

    @Step("Test Driven Development - Разработка через тестирование")
    public List<String> TDD() {
        return new ArrayList<>(Arrays.asList(
                "TDD",
                "Test Driven Development",
                "Разработка через тестирование",
                "это метод разработки программного обеспечения, в котором тесты создаются перед написанием самого кода. Основная идея заключается в том, чтобы написать тесты на конкретное поведение программы, и затем написать реализацию этого поведения, чтобы тесты пройдены."
        ));
    }

    @Step("Behavior Driven Development - разработка через поведение")
    public List<String> BDD() {
        return new ArrayList<>(Arrays.asList(
                "BDD",
                "Behavior Driven Development",
                "разработка через поведение",
                "это методология разработки программного обеспечения, которая сосредоточена на поведении системы, а не на отдельных функциях и объектах. Основная идея заключается в том, чтобы создавать тесты на конкретные сценарии использования программы, а не на индивидуальные функциональные требования."
        ));
    }

    @Step("Data Driven Testing - Тестирование, основанное на данных")
    public List<String> DDT() {
        return new ArrayList<>(Arrays.asList(
                "DDT",
                "Data Driven Testing",
                "Тестирование, основанное на данных",
                "это метод тестирования программного обеспечения, при котором данные вводятся в программу из внешних источников данных, а не напрямую вводятся тестерами. Основная идея заключается в том, чтобы тестировать программу на различных комбинациях входных данных и верифицировать правильность результатов."

        ));
    }

    @Step("Keyword Driven Testing - Тестирование по ключевым словам")
    public List<String> KDT() {
        return new ArrayList<>(Arrays.asList(
                "KDT",
                "Keyword Driven Testing",
                "Тестирование по ключевым словам",
                "это метод тестирования программного обеспечения, при котором тестер использует ключевые слова или фразы, которые автоматически запускают предопределенную последовательность действий. Основная идея заключается в том, чтобы упростить процесс тестирования и повысить уровень повторяемости тестовых сценариев."

        ));
    }

}
