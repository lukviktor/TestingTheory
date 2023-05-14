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
        List<String> softwareTesting = new ArrayList<>(Arrays.asList(
                SOFTWARE_TESTING_1,
                SOFTWARE_TESTING_2,
                SOFTWARE_TESTING_3
        ));
        return softwareTesting;
    }

    @Step("Вывод на печать Тестирование программного обеспечения")
    public void softwareTestingOutput() {
        softwareTesting().forEach(System.out::println);
    }
}
