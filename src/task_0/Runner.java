package task_0;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Программа работает со int чисел, заданных случайно. В ней выполняются операции на удаление дубликатов,
 * выввод четных элементов в заданном диапазоне, умоножение каждого элемента на 2, сортировка, вывод элементов,
 * подсчет количества элементов, подсчет среднего арифметического всех чисел.
 */

public class Runner {

    public static void main(String[] args) {

        List<Integer> collectionInt = new ArrayList<>();

        int setCollectionLength = 20;
        for (int i = 0; i < setCollectionLength; i++) {
            int getRandomElement = (int) (Math.random() * 100);
            collectionInt.add(getRandomElement);
        }

        System.out.print("Элементы коллекции: ");
        System.out.print(collectionInt);

        System.out.println();
        Stream<Integer> streamDistinct = collectionInt.stream().distinct();
        System.out.print("Без дубликатов: " + streamDistinct.collect(Collectors.toList()));

        System.out.println();
        Stream<Integer> streamEvenFrom7To17 = collectionInt.stream()
                .distinct()
                .limit(17)
                .skip(7)
                .filter(e -> e % 2 == 0);
        System.out.print("Без дубликатов, только четные с 7 до 17 позиции: " + streamEvenFrom7To17.collect(Collectors.toList()));

        System.out.println();
        Stream<Integer> streamMultiplyOn2 = collectionInt.stream()
                .distinct()
                .limit(17)
                .skip(7)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2);
        System.out.print("Без дубликатов, только четные с 7 до 17 позиции, каждый элемент умножить на 2: " + streamMultiplyOn2.collect(Collectors.toList()));

        System.out.println();
        Stream<Integer> streamSortLimit = collectionInt.stream()
                .distinct()
                .sorted()
                .limit(4);
        System.out.print("Без дубликатов, отсортировать и показать первые 4 элемента: " + streamSortLimit.collect(Collectors.toList()));

        System.out.println();
        Stream<Integer> streamCountElements = collectionInt.stream()
                .distinct();
        long countStream = streamCountElements.count();
        System.out.print("Вывести кол-во элементов после удаления дубликатов: " + countStream);

        System.out.println();
        OptionalDouble resAver = collectionInt.stream()
                .mapToInt(e -> e.intValue())
                .average();
        System.out.print("Вывести среднее значение всех эелементов: " + resAver.getAsDouble());
    }
}
