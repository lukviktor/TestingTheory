package testing.theory.kulikov_322_26_03_2023.basic_principles_testing;

import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static testing.theory.kulikov_322_26_03_2023.basic_principles_testing.ConstantDatsPrinciplesTesting.*;

public class PrinciplesTestingBasic {
    /**
     * Основные принципы тестирования
     */
    HashMap<String, String> basicPrinciplesTesting = new HashMap<>(); // HashMap Основные принципы тестирования
    ArrayList<String> principlesNumber = new ArrayList<>(); // ArrayList Основные принципы тестирования номер
    ArrayList<String> principlesTesting = new ArrayList<>(); // ArrayList Названия принципов тестирования
    ArrayList<String> principlesTestingDescription = new ArrayList<>(); // ArrayList Описание принципов тестирования

    @Step("Создаем ArrayList Основные принципы тестирования номер")
    public ArrayList<String> principlesNumber() {
        for (int i = 1; i <= 7; i++)
            principlesNumber.add("Принцип тестирования " + i);
        return principlesNumber;
    }

    @Step("Создаем ArrayList Названия принципов тестирования")
    public ArrayList<String> principlesTesting() {
        principlesTesting.add(PRINCIPLES_TESTING_1);
        principlesTesting.add(PRINCIPLES_TESTING_2);
        principlesTesting.add(PRINCIPLES_TESTING_3);
        principlesTesting.add(PRINCIPLES_TESTING_4);
        principlesTesting.add(PRINCIPLES_TESTING_5);
        principlesTesting.add(PRINCIPLES_TESTING_6);
        principlesTesting.add(PRINCIPLES_TESTING_7);
        return principlesTesting;
    }

    @Step("Создаем ArrayList Описание принципов тестирования")
    public ArrayList<String> principlesTestingDescription() {
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_1);
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_2);
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_3);
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_4);
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_5);
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_6);
        principlesTestingDescription.add(PRINCIPLES_TESTING_DESCRIPTION_7);
        return principlesTestingDescription;
    }

    @Step("HashMap Основные принципы тестирования")
    public HashMap<String, String> basicPrinciplesTesting() {
        principlesNumber();
        principlesTesting();
        principlesTestingDescription();
        for (int i = 0; i < principlesNumber.size(); i++) {
            basicPrinciplesTesting.put(principlesNumber.get(i), principlesTesting.get(i) + ": " + principlesTestingDescription.get(i));
        }
        return basicPrinciplesTesting;
    }


    public List<String> principle = new ArrayList<>(Arrays.asList(
            principle1,
            principle2,
            principle3,
            principle4,
            principle5,
            principle6,
            principle7
    ));
    public List<String> explanation = new ArrayList<>(Arrays.asList(
            explanation1,
            explanation2,
            explanation3,
            explanation4,
            explanation5,
            explanation6,
            explanation7
    ));
    @Step("шпаргалка начинающего тестировщика")
    public HashMap<String, String> beginnerTesterCheatSheet() {
        HashMap<String, String> testingPrinciples = new HashMap<>();
        for (int i = 0; i < 7; i++) {

            testingPrinciples.put(principle.get(i), explanation.get(i));
        }
        return testingPrinciples;
    }
}
