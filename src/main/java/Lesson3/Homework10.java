package Lesson3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

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
        createJson();
        readNumbers();
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
            BufferedReader br = new BufferedReader(fileReader2);
            String abc = br.readLine();
            String line = br.readLine();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter("src/main/resources/Task2.json");
            ArrayList<User> users = new ArrayList<>();
            while (line != null) {
                String[] masLine = line.split(" ");
                User newUser = new User(masLine[0], Integer.parseInt(masLine[1]), masLine[2]);
                line = br.readLine();
                users.add(newUser);
            }
            gson.toJson(users,writer);
            writer.close();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
    static class User {
        private String name;
        private int age;
        private String city;

        public User(String name,int age,String city) {
            this.name=name;
            this.age=age;
            this.city=city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
//        @Override
//        public String toString() {
//            return "{" +
//                    "name='" + name +
//                    ", age=" + age +
//                    ", city=" + city +
//                    "},"+"\n";
//        }
    }

    //Task 3 метод countWords()
    public static void countWords() throws IOException {
        Map<String, Long> cntMap;
        try {
            cntMap = Files.lines(Paths.get(RELATIVE_PATH_3))
                    .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]")))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            cntMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(System.out::println);
        } catch (IOException e) {
        }

    }
}
