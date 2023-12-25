package task2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String string1 = "1 5 8 9 12 15";
        String string2 = "8 4 5 11 100 0";

        String [] array1 = string1.split(" ");

        System.out.print("Array 1: ");
        for (String i: array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        String [] array2 = string2.split(" ");
        System.out.print("Array 2: ");
        for (String i: array2) {
            System.out.print(i + " ");
        }

        System.out.println();

        HashSet<String> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(array1));
        numbers.addAll(Arrays.asList(array2));

        System.out.println("Numbers in HashSet: ");
        for (String num: numbers) {
            System.out.print(num + " ");
        }







    }
}
