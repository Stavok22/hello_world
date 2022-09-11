package Lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Homework11 {
    // Завдання 1
    public String getOddNames(List<String> input) {

        return IntStream.range(0, input.size())
                .filter(index -> index % 2 == 1)
                .mapToObj(index1 -> index1 + ". " + input.get(index1-1))
                .collect(Collectors.joining(", "));
    }

    //Завдання 2
    public  List<String> getSortedReverseUpperNames(List<String> input) {

        return input.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .toList();
    }
    //Завдання 3
    public String getClearInt(String[] input) {
        return Arrays.stream(input)
                .flatMap(s -> Stream.of(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
    //Завдання 4
    public  Stream<Long> task4(Long seed, Long a, Long c, Long m) {
        return Stream.iterate(new Long[]{seed, a, c, m},
                        n -> new Long[]{(n[1] * n[0] + n[2]) % n[3], n[1], n[2], n[3]})
                .map(n -> n[0]);
    }
    //Завдання 5
    public static  <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Stream<T> result = Stream.empty();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result = Stream.concat(result, Stream.of(firstIterator.next(), secondIterator.next()));
        }
        return result;
    }
}
