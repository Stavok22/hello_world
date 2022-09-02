package Lesson3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework10 {

    private static final String RELATIVE_PATH = "src/main/resources/Task1.txt" ;
    private static final String RELATIVE_PATH_2 = "src/main/resources/Task2.txt";
    private static final String RELATIVE_PATH_3 = "src/main/resources/words.txt";

    public static void main(String[] args) throws IOException {
        readNumbers();
        createJson();
        countWords();
    }

    // Task1 метод readNumbers()
    public static void readNumbers() throws FileNotFoundException {
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(RELATIVE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\) \\d{3}-\\d{4}");
                if (pattern.matcher(line).find()) {
                    System.out.println(line);
                }
                line= bufferedReader.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Exception during reading file. " + ex);
        }
    }
    //Task2
    public static void createJson() throws IOException {
        try {
        FileReader fileReader2 = new FileReader(RELATIVE_PATH_2);
        BufferedReader bufferedReader = new BufferedReader(fileReader2);
        String line = bufferedReader.readLine();
//        String[] columns = line.split(" ");
        List<User> users = new ArrayList<>() {
            @Override
            public String toString() {
                String rez = "[\n";
                for (int i = 0; i < this.size(); i++) {
                    if (i != this.size() - 1) {
                        rez += this.get(i);
                    } else {
                        rez += this.get(i);
                    }
                }
                return (rez + "]");
            }
        };
        FileWriter fileWriter = new FileWriter("src/main/resources/Task2.json");
        line = bufferedReader.readLine();
        while (line != null) {
            String[] masLine = line.split(" ");
            User newUser = new User(masLine[0], Integer.parseInt(masLine[1]));
            users.add(newUser);
            line = bufferedReader.readLine();
        }
        fileWriter.write(users.toString());
        fileWriter.close();
        System.out.println(users);

    } catch (Exception e) {
        System.out.println("");
        e.printStackTrace();
    }
    }
    static class User {
        private String name;
        private int age;

        public User(String name,int age) {
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}'+"\n";
        }
    }

    //Task 3 метод countWords()
    public static void countWords() throws IOException {
        Map<String, Long> cntMap;
        try {
            cntMap = Files.lines(Paths.get("src/main/resources/words.txt"))
                    .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]")))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            cntMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        } catch (IOException e) {
        }

    }
}
