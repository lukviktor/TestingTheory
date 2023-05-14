package testing.theory.kulikov_322_26_03_2023;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.theory.kulikov_322_26_03_2023.terminology.Terminology;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing.theory.kulikov_322_26_03_2023.terminology.ConstantDataTerminology.*;

class TerminologyTest {
    Terminology terminology = new Terminology();

    @Test
    void softwareTestingTest() {
        for (String s : terminology.softwareTesting()) {
            System.out.println(s);
        }

        Assertions.assertTrue(terminology.softwareTesting().get(0).contains("Тестирование"));
        Assertions.assertTrue(terminology.softwareTesting().get(1).contains("дефектов"));
        Assertions.assertTrue(terminology.softwareTesting().get(2).contains("поведения"));
    }

    @Test
    public void softwareTestingOutputTest() {
        terminology.softwareTestingOutput();
        // перенаправляем вывод на ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // вызываем метод, который выводит результат на консоль
        terminology.softwareTestingOutput();

        // читаем сохраненный в outputStream вывод
        String expectedOutput = String.join("\n",
                SOFTWARE_TESTING_1,
                SOFTWARE_TESTING_2,
                SOFTWARE_TESTING_3,
                ""
        );
        String actualOutput = outputStream.toString().replaceAll("\\r\\n", "\n");
        assertEquals(expectedOutput, actualOutput);
    }

}



