package Lesson2;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("A","B");
        myHashMap.put("A","F");
        myHashMap.put("H","P");
        myHashMap.put("P","2");
        myHashMap.put("1","G");
        myHashMap.put("2","6");
        myHashMap.put("w","3");
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        myHashMap.clear();
        System.out.println(myHashMap);
        myHashMap.put("2","3");
        System.out.println(myHashMap);

    }
}