package testing.theory.kulikov_322_26_03_2023.section_1.testing_and_testers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// Что нужно знать и уметь и чему можно научиться
public class YouNeedToKnow {
    @Test
    public ArrayList<String> skillLevel() {
        ArrayList<String> skillLevel = new ArrayList<>();
        skillLevel.add("Предметная об-ласть");
        skillLevel.add("Начальный уро-вень");
        skillLevel.add("Уровень младшего или среднего специалиста");
        /*
        System.out.println("Сейчас в списке: ");
        for (int i = 0; i < skillLevel.size(); i++) { // i строго меньше размера списка
            System.out.println("Заголовок в таблице " + i + ": " + skillLevel.get(i));
            // напечатали зоголовки и их индексы в списке
        }
        */
        return skillLevel;
    }


@Test
    public void dfgh(){
    System.out.println(skillLevel());
}
}
