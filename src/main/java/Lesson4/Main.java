package Lesson4;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alex","Inna","Bob","Denis","Tom","Richard","Elizabet","David");
        String[] task3= {"1, 2, 0", "4, 5, 3"};
        List<Integer> test = List.of(10, 8, 9, 5, 4, 132);
        List<Integer> test2 = List.of(8, 9, 1, 7, 45, 7, 9, 6, 2);

        Homework11 homework11 = new Homework11();
        System.out.println("Task 1");
        System.out.println(homework11.getOddNames(names));
        System.out.println("------------------------------");
        System.out.println("Task 2");
        System.out.println(homework11.getSortedReverseUpperNames(names));
        System.out.println("------------------------------");
        System.out.println("Task 3");
        System.out.println(homework11.getClearInt(task3));
        System.out.println("------------------------------");
        System.out.println("Task 4");
        System.out.println(homework11.task4(2L, 25214903917L, 11L, 2 ^ 48L)
                .limit(10)
                .collect(Collectors.toList()));
        System.out.println("------------------------------");
        System.out.println("Task 5");
        System.out.println(Homework11.zip(test.stream(),test2.stream()).collect(Collectors.toList()));
    }
}
