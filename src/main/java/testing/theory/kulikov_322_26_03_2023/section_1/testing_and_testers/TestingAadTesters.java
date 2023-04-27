package testing.theory.kulikov_322_26_03_2023.section_1.testing_and_testers;

import org.junit.jupiter.api.Test;

public class TestingAadTesters {
    WhatIsTestingAndWhereDidItComeFrom whatIsTestingAndWhereDidItComeFrom = new WhatIsTestingAndWhereDidItComeFrom();
    @Test
    public void softwareTesting(){ //Тестирование программного обеспечения
        System.out.println(whatIsTestingAndWhereDidItComeFrom.getSoftwareTesting());
        System.out.println(whatIsTestingAndWhereDidItComeFrom.getSoftwareTestingAnswer());
    }
}
