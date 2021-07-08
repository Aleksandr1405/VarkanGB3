package HW1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"Apple", "Orange", "Box", "Fruit"};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapTwoElements(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        List<String> list = convertToList(arr);
        System.out.println("Task 2\n" + list.getClass() + " : " + list);

        System.out.println("Task 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());


        for (int i = 0; i < 7; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 3; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Вес первой коробки с апельсинами: " + orange1Weight);
        System.out.println("Вес второй коробки  с апельсинами: " + orange2Weight);
        System.out.println("Вес коробки с яблоками: " + appleWeight);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapTwoElements(T[] array, int index1, int index2) {
        T cur = array[index1];
        array[index1] = array[index2];
        array[index2] = cur;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
