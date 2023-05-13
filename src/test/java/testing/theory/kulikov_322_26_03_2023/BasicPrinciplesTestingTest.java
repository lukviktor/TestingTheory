package testing.theory.kulikov_322_26_03_2023;

import org.junit.jupiter.api.Test;
import testing.theory.kulikov_322_26_03_2023.basic_principles_testing.BasicPrinciplesTesting;

public class BasicPrinciplesTestingTest {
    BasicPrinciplesTesting basicPrinciplesTesting = new BasicPrinciplesTesting();

    @Test
    public void principlesNumberTest(){
        System.out.println(basicPrinciplesTesting.principlesNumber());
    }
    @Test
    public void principlesTestingTest(){
        System.out.println(basicPrinciplesTesting.principlesTesting());
    }
    @Test
    public void principlesTestingDescriptionTest(){
        System.out.println(basicPrinciplesTesting.principlesTestingDescription());
    }
    @Test
    public void basicPrinciplesTestingTest(){
        System.out.println(basicPrinciplesTesting.basicPrinciplesTesting());
    }
}
