package Lesson2;


public class MyArrayList<Type> {

    private Type[] array;
    private  int size;
    private final int DEFAULT_CAPACITY = 10;

    public  MyArrayList(int capacity) {
        if (capacity <=0) {
            throw new IllegalArgumentException("Розмір масиву неможе бути менше 0");
        } else {
            array = (Type[]) new Object[capacity];
        }
    }
    public MyArrayList() {
        array =(Type[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(Type item) {

        if(size == array.length) {
            Type[] newArray = (Type[]) new Object[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i]= array[i];
            }
            array = newArray;
        }
        array[size++]=item;
    }

    public Object remove(int index) {
        Object[] newArray = new Object[array.length - 1];
        Object deleted = null;
        int del = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) {
                deleted = array[i];
                del++;
            }
            newArray[i] = array[i + del];
        }
        array = (Type[]) newArray;
        size--;
        return (deleted);
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return array[index];
    }

    public void clear() {
        for (int i = 0; i < array.length ; i++) {
            array[i]=null;
        }
        size=0;
    }
    public void display() {
        for(Type elem: array) {
            System.out.print(elem + " ");
        }
        System.out.println("");
    }
}



