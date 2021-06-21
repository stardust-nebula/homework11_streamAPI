package task_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Программа работает со список имен студентов. В ней подсчитывается количество студентов,
 * у которых имя совпадает с заданным. Находятся имена, начинающиеся на заданную букву.
 * Сортируется список имен и выводиться первый элемент.
 */

public class Runner {
    public static void main(String[] args) {

        String myName = "Lera";
        String startWithLetterInName = "l";

        List<String> listOfStudents = new ArrayList<>();

        listOfStudents.add("Lera");
        listOfStudents.add("Vitalij");
        listOfStudents.add("Aina");
        listOfStudents.add("Julia");
        listOfStudents.add("Egor");
        listOfStudents.add("Olga");
        listOfStudents.add("Aleksandr");
        listOfStudents.add("Svietlana");
        listOfStudents.add("Maria");
        listOfStudents.add("Vitalij");
        listOfStudents.add("Evgenii");
        listOfStudents.add("Katharina");
        listOfStudents.add("Mary");
        listOfStudents.add("Anton");
        listOfStudents.add("Tasja");
        listOfStudents.add("Anatolii");

        System.out.println("Список всех студентов:");
        System.out.println(listOfStudents);

        System.out.print("Количество людей с моим именем: ");
        long sameNameAsMine = listOfStudents.stream().filter((e) -> e.equalsIgnoreCase(myName)).count();
        System.out.println(sameNameAsMine);

        System.out.print("Все имена, начинающиеся на \"" + startWithLetterInName + "\" (игнорировать регистр): ");
        List<String> listOfMatchNames = listOfStudents.stream().filter((e) -> e.toLowerCase().startsWith(startWithLetterInName)).toList();
        if ((listOfMatchNames.isEmpty())) {
            System.out.println("No such name.");
        } else {
            System.out.println(listOfMatchNames);
        }

        System.out.print("Отсортировать и вернуть первый элемент коллекции или \"Empty\", если коллекция пуста: ");
        List<String> sortListOfStudents = listOfStudents.stream().sorted().toList();
        if (sortListOfStudents.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(sortListOfStudents.get(0));
        }
    }
}
