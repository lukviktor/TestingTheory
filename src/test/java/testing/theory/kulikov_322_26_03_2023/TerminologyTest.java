package testing.theory.kulikov_322_26_03_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.theory.kulikov_322_26_03_2023.terminology.Terminology;

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
    }
}