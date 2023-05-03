package testing.theory.kulikov_322_26_03_2023.section_1.testing_and_testers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class YouNeedToKnowTest {
    YouNeedToKnow youNeedToKnow = new YouNeedToKnow();
    @Test
    public void printOutput() {
        System.out.println(youNeedToKnow.skillLevelArrayList().size());
        System.out.println(youNeedToKnow.skillLevelArrayList());
    }

    @Test
    public void getSizeCyclePrintTest() {
        System.out.println("Печать списка через get() и size(): ");
        for (int i = 0; i < youNeedToKnow.skillLevelArrayList().size(); i++) { // i строго меньше размера списка
            System.out.println("Элемент " + i + ": " + youNeedToKnow.skillLevelArrayList().get(i));
        }
    }

    @Test
    public void forEachTest() {
        System.out.println("Печать через цикл for each: ");
        for (String element : youNeedToKnow.skillLevelArrayList()) {
            System.out.println("Представляю элемент: " + element);
        }
    }

    @Test
    public void removeСlearTest() {
        ArrayList<String> skillLevel = new ArrayList<>();
        skillLevel.add("Предметная область");
        skillLevel.add("Начальный уровень");
        skillLevel.add("Уровень младшего или среднего специалиста");
        System.out.println(skillLevel.size());

        skillLevel.remove(0); // удалили элемент с индексом 1
        System.out.println(skillLevel.size());
        System.out.println(skillLevel);

        skillLevel.remove("Начальный уровень"); // удалили элемент по значение элемента
        System.out.println(skillLevel.size());
        System.out.println(skillLevel);

        skillLevel.clear(); // Чтобы удалить все элементы, понадобится метод clear() (англ. «очистить»):
        System.out.println("Элементов в списке - " + skillLevel.size());
    }

    @Test
    public void isEmptyTest() {
        // Метод isEmpty() (англ. «пустой ли») помогает проверить, есть ли в списке элементы.
        // возвращает true, если список пустой, и false, если в нём есть хотя бы один элемент.
        System.out.println(youNeedToKnow.skillLevelArrayList().isEmpty());
    }

    @Test
    public void containsTest() {
        // Методом contains(E e) (англ. «содержит») можно проверить, есть ли элемент в списке.
        // Он возвращает true или false. В качестве аргумента передаётся элемент, который нужно найти.
        System.out.println(youNeedToKnow.skillLevelArrayList().contains("Пирог"));
        System.out.println(youNeedToKnow.skillLevelArrayList().contains("Начальный уровень"));
    }
}
