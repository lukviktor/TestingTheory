package testing.theory.kulikov_322_26_03_2023.testing_Life_cycle;

public class ConstantDataLifeCycle {

    public static final String STAGE_DESCRIPTION_1 = "общее планирование и анализ требований";
    public static final String STAGE_DESCRIPTION_2 = "уточнение критериев приёмки";
    public static final String STAGE_DESCRIPTION_3 = "уточнение стратегии тестирования";
    public static final String STAGE_DESCRIPTION_4 = "разработка тест-кейсов";
    public static final String STAGE_DESCRIPTION_5 = "выполнение тест-кейсов";
    public static final String STAGE_DESCRIPTION_6 = "фиксация найденных дефектов";
    public static final String STAGE_DESCRIPTION_7 = "анализ результатов тестирования";
    public static final String STAGE_DESCRIPTION_8 = "отчётность";
    public static final String STAGE_EXPLANATION_1 = "объективно необходима как минимум для того, чтобы иметь ответ на такие вопросы, " +
            "как: что нам предстоит тестировать; как много будет работы; какие есть сложности; " +
            "всё ли необходимое у нас есть и т.п. " +
            "Как правило, получить ответы на эти вопросы невозможно без анализа требований, " +
            "т.к. именно требования являются первичным источником ответов.\n";
    public static final String STAGE_EXPLANATION_2 = "позволяет сформулировать или уточнить метрики и признаки возможности или " +
            "необходимости начала тестирования (entry criteria44), приостановки (suspension criteria45) и " +
            "возобновления (resumption criteria46) тестирования, " +
            "завершения или прекращения тестирования (exit criteria47).\n";
    public static final String STAGE_EXPLANATION_3 = "представляет собой ещё одно обращение к планированию, но уже на локальном уровне: " +
            "рассматриваются и уточняются те части стратегии тестирования (test strategy48), " +
            "которые актуальны для текущей итерации.\n";
    public static final String STAGE_EXPLANATION_4 = "посвящена разработке, пересмотру, уточнению, доработке, переработке и прочим " +
            "действиям с тест-кейсами, наборами тест-кейсов, тестовыми сценариями и иными артефактами, которые " +
            "будут использоваться при непосредственном выполнении тестирования.\n";
    public static final String STAGE_EXPLANATION_5 = "тесно связаны между собой и фактически выполняются параллельно: дефекты фиксируются " +
            "сразу по факту их обнаружения в процессе выполнения тест-кейсов. Однако зачастую после выполнения всех " +
            "тест-кейсов и написания всех отчётов о найденных дефектах проводится явно выделенная стадия уточнения, " +
            "на которой все отчёты о дефектах рассматриваются повторно с целью формирования единого понимания " +
            "проблемы и уточнения таких характеристик дефекта, как важность и срочность.\n";
    public static final String STAGE_EXPLANATION_6 = STAGE_EXPLANATION_5;
    public static final String STAGE_EXPLANATION_7 = "также тесно связаны между собой и выполняются практически параллельно. Формулируемые " +
            "на стадии анализа результатов выводы напрямую зависят от плана тестирования, критериев приёмки и " +
            "уточнённой стратегии, полученных на стадиях 1, 2 и 3. Полученные выводы оформляются на стадии 8 и " +
            "служат основой для стадий 1, 2 и 3 следующей итерации тестирования. Таким образом, цикл замыкается.\n";
    public static final String STAGE_EXPLANATION_8 = STAGE_EXPLANATION_7;
}
