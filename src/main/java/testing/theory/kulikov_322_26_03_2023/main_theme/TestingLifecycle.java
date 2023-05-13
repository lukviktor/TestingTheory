package testing.theory.kulikov_322_26_03_2023.main_theme;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static testing.theory.kulikov_322_26_03_2023.main_theme.ConstantDataLifeCycle.*;

public class TestingLifecycle {
    /**
     * Жизненный цикл тестирования
     */
    HashMap<String, ArrayList<String>> testingLifecycle = new HashMap<>(); // Жизненный цикл тестирования
    ArrayList<String> stage = new ArrayList<>(); // Стадия
    ArrayList<String> stageDescription = new ArrayList<>(); // Названия стадии
    ArrayList<String> stageExplanation = new ArrayList<>(); // Описание стадии
    ArrayList<String> stageDescriptionStageExplanation = new ArrayList<>(); // Названия стадии и Описание стадии


    @Step("Создаем ArrayList стадии Жизненного цикла тестирования")
    public ArrayList<String> stage() { // Стадия
        for (int i = 0; i < 8; i++)
            stage.add("Стадия " + i);
        return stage;
    }

    @Step("Создаем ArrayList название стадии Жизненного цикла тестирования")
    public ArrayList<String> stageDescription() { // Название стадии
        stageDescription.add(STAGE_DESCRIPTION_1);
        stageDescription.add(STAGE_DESCRIPTION_2);
        stageDescription.add(STAGE_DESCRIPTION_3);
        stageDescription.add(STAGE_DESCRIPTION_4);
        stageDescription.add(STAGE_DESCRIPTION_5);
        stageDescription.add(STAGE_DESCRIPTION_6);
        stageDescription.add(STAGE_DESCRIPTION_7);
        stageDescription.add(STAGE_DESCRIPTION_8);
        return stageDescription;
    }

    @Step("Создаем ArrayList описание стадии Жизненного цикла тестирования")
    public ArrayList<String> stageExplanation() { //Описание стадии
        stageExplanation.add(STAGE_EXPLANATION_1);
        stageExplanation.add(STAGE_EXPLANATION_2);
        stageExplanation.add(STAGE_EXPLANATION_3);
        stageExplanation.add(STAGE_EXPLANATION_4);
        stageExplanation.add(STAGE_EXPLANATION_5);
        stageExplanation.add(STAGE_EXPLANATION_6);
        stageExplanation.add(STAGE_EXPLANATION_7);
        stageExplanation.add(STAGE_EXPLANATION_8);
        return stageExplanation;
    }

    @Step("HashMap Жизненный цикл тестирования")
    public HashMap<String, ArrayList<String>> testingLifecycle() {
        stage();
        stageDescription();
        stageExplanation();

        for (int i = 0; i < stage.size(); i++) {
            stageDescriptionStageExplanation.add(stageDescription.get(i));
            stageDescriptionStageExplanation.add(stageExplanation.get(i));
            testingLifecycle.put(stage.get(i), stageDescriptionStageExplanation);
        }

        return testingLifecycle;
    }
}