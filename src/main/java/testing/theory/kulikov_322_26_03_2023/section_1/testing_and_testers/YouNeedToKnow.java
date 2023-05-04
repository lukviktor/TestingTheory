package testing.theory.kulikov_322_26_03_2023.section_1.testing_and_testers;

import java.util.ArrayList;
import java.util.HashMap;

// Что нужно знать и уметь и чему можно научиться
public class YouNeedToKnow {


    private String JuniorOrIntermediateSpecialistLevel = "Уровень младшего или среднего специалиста ";

    public ArrayList<String> skillLevelArrayList() {
        ArrayList<String> skillLevel = new ArrayList<>();
        skillLevel.add("Предметная область");
        skillLevel.add("Начальный уровень");
        skillLevel.add(JuniorOrIntermediateSpecialistLevel);

        return skillLevel;
    }

    public ArrayList<String> softwareTestingProcess() {
        ArrayList<String> softwareTestingProcess = new ArrayList<>();
        softwareTestingProcess.add(JuniorOrIntermediateSpecialistLevel);
        softwareTestingProcess.add("Глубокое понимание стадий процесса тестирования, их взаимосвязи и взаимовлияния, " +
                "умение планировать собственную работу в рамках полученного задания в зависимости от стадии тестирования");
        return softwareTestingProcess;
    }

    public ArrayList<String> workingWithDocumentation() {
        ArrayList<String> workingWithDocumentation = new ArrayList<>();
        workingWithDocumentation.add("Анализ требований");
        workingWithDocumentation.add("Умение определять взаимосвязи и взаимозависимость между различными уровнями и " +
                "формами представления требований, умение формулировать вопросы с целью уточнения неясных моментов");
        return workingWithDocumentation;
    }

    public HashMap<String, ArrayList<String>> skillLevelHashMap() {
        String softwareTestingProcess = "Процесс тестирования ПО ";
        String requirementsAnalysis = "Анализ требований  ";

        HashMap<String, ArrayList<String>> skillLevelHashMap = new HashMap<>();

        //skillLevelHashMap.put();
        skillLevelHashMap.put(softwareTestingProcess, softwareTestingProcess());


        return skillLevelHashMap;
    }

    /*
    Вспомни, какие методы есть у хеш-таблиц:
put(K key, V value) — добавить элемент;
get(Object key) — получить значение по ключу;
values() — получить все значения;
keySet() — получить все ключи;
remove(Object key) — удалить элемент;
clear() — очистить хеш-таблицу;
containsKey(Object key) — узнать, содержит ли таблица ключ;
containsValue(Object value) — узнать, содержит ли таблица значение.
size() — получить количество элементов таблицы;
isEmpty() — узнать, пустая ли таблица.
     */
    private final String softwareTestingAndDevelopmentProcesses = "Процессы тестирования и разработки программного обеспечения ";
    private final String workingWithDocumentation = "Работа с документацией ";
    private final String evaluationAndPlanning = "Оценка и планирование ";
    private final String workingWithTestCases = "Работа с тест-кейсами ";

    private final String testingMethodologies = "Методологии тестирования ";
    private final String workingWithDefectReports = "Работа с отчётами о дефектах ";
    private final String workingWithTestResultsReports = "Работа с отчётами о результатах тестирования ";


    private final String softwareTestingProcess = "Процесс тестирования ПО";
    private final String softwareDevelopmentProcess = "Процесс разработки ПО";
    private final String requirementsAnalysis = "Анализ требований";
    private final String requirementsTesting = "Тестирование требований";
    private final String requirementsManagement = "Управление требованиями";
    private final String businessAnalysis = "Бизнес-анализ";
    private final String creatingTestPlan = "Создание плана тестирования";
    private final String creatingTestingStrategy = "Создание страте-гии тестирования";
    private final String assessmentOfLaborCosts = "Оценка трудозатрат";
    private final String creatingChecklists = "Создание чек-листов";
    private final String creatingTestCases = "Создание тест-кейсов";
    private final String testCaseManagement = "Управление тест-кейсами";
    private final String functionalAndDomainTesting = "Функциональное и доменное тестирование";
    private final String testingTheUserInterface = "Тестирование ин-терфейса пользователя";
    private final String researchTesting = "Исследовательское тестирование";
    private final String integrationTesting = "Интеграционное тестирование";
    private final String localizationTesting = "Локализационное тестирование";
    private final String installationTesting = "Инсталляционное тестирование";
    private final String regressionTesting = "Регрессионное тестирование";
    private final String creatingDefectReports = "Создание отчётов о дефектах";
    private final String analysisOfTheCausesOfTheError = "Анализ причин возникновения ошибки";
    private final String usingBugTrackingSystems = "Использование баг-трекинговых систем";
    private final String creatingReportsOnTestResults = "Создание отчётов о результатах тестирования";

    private final String softwareTestingProcessLevel = " Глубокое понимание стадий процесса тестирова-ния, " +
            "их взаимосвязи и взаимовлияния, умение планировать собственную работу в рамках полу-ченного задания " +
            "в зависимости от стадии тестирования  ";
    private final String softwareDevelopmentProcessLevel = " Общее понимание моделей разработки ПО, их связи с " +
            "тестированием, умение расставлять приоритеты в собственной работе в зависимости от стадии развития проекта  ";
    private final String requirementsAnalysisLevel = " Умение определять взаимосвязи и взаимозависимость между различными " +
            "уровнями и формами представления требований, умение формулировать вопросы с целью уточнения неясных моментов  ";
    private final String requirementsTestingLevel = " Знание свойств хороших требований и наборов требований, умение " +
            "анализировать требования с целью выявления их недостатков, умение устранять недостатки в требованиях, " +
            "умение применять техники повышения качества требований  ";
    private final String requirementsManagementLevel = " Общее понимание процессов выявления, документирования, " +
            "анализа и модификации требований  ";
    private final String businessAnalysisLevel = " Общее понимание процессов выявления и документирования различных " +
            "уровней и форм представления требований  ";
    private final String creatingTestPlanLevel = " Общее понимание принципов планирования в контексте тестирования, " +
            "умение использовать гото-вый тест-план для планирования собственной работы  ";
    private final String creatingTestingStrategyLevel = " Общее понимание принципов построения стратегии тестирования, " +
            "умение использовать готовую стратегию для планирования собственной работы  ";
    private final String assessmentOfLaborCostsLevel = " Общее понимание принципов оценки трудозатрат, умение оценивать " +
            "собственные трудозатраты при планировании собственной работы  ";
    private final String creatingChecklistsLevel = " Твёрдое умение использовать техники и подходы к проектированию " +
            "тестовых испытаний, умение декомпозировать тестируемые объекты и поставленные задачи, умение создавать чек-листы  ";
    private final String creatingTestCasesLevel = " Твёрдое умение оформлять тест-кейсы согласно принятым шаблонам, " +
            "умение анализировать гото-вые тест-кейсы, обнаруживать и устранять имеющиеся в них недостатки  ";
    private final String testCaseManagementLevel = " Общее понимание процессов создания, модификации и повышения " +
            "качества тест-кейсов  ";
    private final String functionalAndDomainTestingLevel = " Знание видов тестирования, твёрдое умение использовать " +
            "техники и подходы к проектированию тестовых испытаний, умение создавать чек-листы и тест-кейсы, умение " +
            "создавать отчёты о дефектах  ";
    private final String testingTheUserInterfaceLevel = " Умение проводить тестирование интерфейса пользователя на " +
            "основе готовых тестовых сцена-риев или в рамках исследовательского тестирования  ";
    private final String researchTestingLevel = " Общее умение использовать матрицы для быстрого определения сценариев " +
            "тестирования, об-щее умение проводить новые тесты на основе результатов только что выполненных  ";
    private final String integrationTestingLevel = " Умение проводить интеграционное тестирование на основе готовых " +
            "тестовых сценариев  ";
    private final String localizationTestingLevel = " Умение проводить локализационное тестирование на основе готовых " +
            "тестовых сценариев  ";
    private final String installationTestingLevel = " Умение проводить инсталляционное тестирование на основе готовых " +
            "тестовых сценариев  ";
    private final String regressionTestingLevel = " Общее понимание принципов организации регрессионного тестирования, " +
            "умение проводить регрессионное тестирование по готовым планам  ";
    private final String creatingDefectReportsLevel = " Твёрдое знание жизненного цикла отчёта об ошибке, твёрдое " +
            "умение создавать отчёты о де-фектах согласно принятым шаблонам, умение анализировать готовые отчёты, " +
            "обнаруживать и устранять имеющиеся в них недостатки  ";
    private final String analysisOfTheCausesOfTheErrorLevel = " Базовое умение исследовать приложение с целью " +
            "выявления источника (причины) ошибки, элементарное умение формировать рекомендации по устранению ошибки  ";
    private final String usingBugTrackingSystemsLevel = " Умение использовать баг-трекинговые системы на всех " +
            "стадиях жизненного цикла отчётов о дефектах ";
    private final String creatingReportsOnTestResultsLevel = " Умение предоставлять необходимую информацию для " +
            "формирования отчёта о результатах тестирования, умение анализировать готовые отчёты о результатах " +
            "тестирования с целью уточнения планирования собственной работы  ";


}

