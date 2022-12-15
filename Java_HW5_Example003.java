package Homework.JAVA_HW5;

/*
Задача 3. Ермилов Артём, группа 6|3044.
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

import java.io.*;
import java.util.*;

public class Java_HW5_Example003 {
    private static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }

    public static void heapSortNumbers(Integer arr[]) {
        Integer n = arr.length;

        for (Integer i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (Integer i = n - 1; i >= 0; i--) {

            Integer temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(Integer arr[], Integer n, Integer i) {
        Integer largest = i;
        Integer l = 2 * i + 1;
        Integer r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            Integer swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void printArray(Integer[] arrayList) {
        System.out.print("[");
        for (int i = 0; i < arrayList.length - 1; i++) {
            System.out.print(arrayList[i] + ",");
        }
        System.out.println(arrayList[arrayList.length - 1] + "]");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        clearConsole();
        Random rand = new Random();
        Integer[] numberArray = new Integer[10];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i]= rand.nextInt(100);
            
        }
        printArray(numberArray);
        heapSortNumbers(numberArray);
        printArray(numberArray);





    }
}
