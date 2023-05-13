package testing.theory.kulikov_322_26_03_2023.main_theme;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestingLifecycle {
    /**
     * Жизненный цикл тестирования
     */
    HashMap<String, ArrayList<String>> testingLifecycle = new HashMap<>(); // Жизненный цикл тестирования
    ArrayList<String> stage = new ArrayList<>(); // Стадия
    ArrayList<String> stageDescription = new ArrayList<>(); // Названия стадии
    ArrayList<String> stageExplanation = new ArrayList<>(); // Описание стадии
    ArrayList<String> stageDescriptionStageExplanation = new ArrayList<>(); // Названия стадии и Описание стадии
    private final String stageDescription1 = "общее планирование и анализ требований";
    private final String stageDescription2 = "уточнение критериев приёмки";
    private final String stageDescription3 = "уточнение стратегии тестирования";
    private final String stageDescription4 = "разработка тест-кейсов";
    private final String stageDescription5 = "выполнение тест-кейсов";
    private final String stageDescription6 = "фиксация найденных дефектов";
    private final String stageDescription7 = "анализ результатов тестирования";
    private final String stageDescription8 = "отчётность";
    private final String stageExplanation1 = "объективно необходима как минимум для того, чтобы иметь ответ на такие вопросы, " +
            "как: что нам предстоит тестировать; как много будет работы; какие есть сложности; " +
            "всё ли необходимое у нас есть и т.п. " +
            "Как правило, получить ответы на эти вопросы невозможно без анализа требований, " +
            "т.к. именно требования являются первичным источником ответов.";
    private final String stageExplanation2 = "позволяет сформулировать или уточнить метрики и признаки возможности или " +
            "необходимости начала тестирования (entry criteria44), приостановки (suspension criteria45) и " +
            "возобновления (resumption criteria46) тестирования, " +
            "завершения или прекращения тестирования (exit criteria47).";
    private final String stageExplanation3 = "представляет собой ещё одно обращение к планированию, но уже на локальном уровне: " +
            "рассматриваются и уточняются те части стратегии тестирования (test strategy48), " +
            "которые актуальны для текущей итерации.";
    private final String stageExplanation4 = "посвящена разработке, пересмотру, уточнению, доработке, переработке и прочим " +
            "действиям с тест-кейсами, наборами тест-кейсов, тестовыми сценариями и иными артефактами, которые " +
            "будут использоваться при непосредственном выполнении тестирования.";
    private final String stageExplanation5 = "тесно связаны между собой и фактически выполняются параллельно: дефекты фиксируются " +
            "сразу по факту их обнаружения в процессе выполнения тест-кейсов. Однако зачастую после выполнения всех " +
            "тест-кейсов и написания всех отчётов о найденных дефектах проводится явно выделенная стадия уточнения, " +
            "на которой все отчёты о дефектах рассматриваются повторно с целью формирования единого понимания " +
            "проблемы и уточнения таких характеристик дефекта, как важность и срочность.";
    private final String stageExplanation6 = stageExplanation5;
    private final String stageExplanation7 = "также тесно связаны между собой и выполняются практически параллельно. Формулируемые " +
            "на стадии анализа результатов выводы напрямую зависят от плана тестирования, критериев приёмки и " +
            "уточнённой стратегии, полученных на стадиях 1, 2 и 3. Полученные выводы оформляются на стадии 8 и " +
            "служат основой для стадий 1, 2 и 3 следующей итерации тестирования. Таким образом, цикл замыкается.";
    private final String stageExplanation8 = stageExplanation7;


    @Step("Создаем ArrayList стадии Жизненного цикла тестирования")
    public ArrayList<String> stage() { // Стадия
        for (int i = 0; i < 8; i++)
            stage.add("Стадия " + i);
        return stage;
    }

    @Step("Создаем ArrayList название стадии Жизненного цикла тестирования")
    public ArrayList<String> stageDescription() { // Название стадии
        stageDescription.add(stageDescription1);
        stageDescription.add(stageDescription2);
        stageDescription.add(stageDescription3);
        stageDescription.add(stageDescription4);
        stageDescription.add(stageDescription5);
        stageDescription.add(stageDescription6);
        stageDescription.add(stageDescription7);
        stageDescription.add(stageDescription8);
        return stageDescription;
    }

    @Step("Создаем ArrayList описание стадии Жизненного цикла тестирования")
    public ArrayList<String> stageExplanation() { //Описание стадии


        stageExplanation.add(stageExplanation1);
        stageExplanation.add(stageExplanation2);
        stageExplanation.add(stageExplanation3);
        stageExplanation.add(stageExplanation4);
        stageExplanation.add(stageExplanation5);
        stageExplanation.add(stageExplanation6);
        stageExplanation.add(stageExplanation7);
        stageExplanation.add(stageExplanation8);
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

    @Test
    public void test() {
        System.out.println(testingLifecycle());
        //System.out.println(testingLifecycle());
    }

}