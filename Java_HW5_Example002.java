package Homework.JAVA_HW5;

import java.io.*;
import java.util.*;

/*
Задача 2. Ермилов Артём, группа 6|3044.
 *Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
 Написать программу, которая найдет и выведет повторяющиеся имена с
 количеством повторений. Отсортировать по убыванию популярности.
 */
public class Java_HW5_Example002 {
    private static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }

    public static String readFile(String addressFile, String nameFile) // Чтение файла
    {
        String str = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(addressFile + nameFile));
            str = br.readLine();
            br.close();
        } catch (Exception ex) {
            System.out.printf("Ошибка: " + ex);
        }
        return str;

    }

    public static void printArray(String[] arrayList) {
        System.out.print("[");
        for (int i = 0; i < arrayList.length - 1; i++) {
            System.out.print(arrayList[i] + ",");
        }
        System.out.println(arrayList[arrayList.length - 1] + "]");

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        clearConsole();
        String addressFile = "C:/Users/SBB2-Ермилов Артём/YandexDisk-artyomermiloff/GeegBrains/Programming/Java/Homework/JAVA_HW5/";
        String nameFile = "Java_HW5_Example002_Name.txt";
        String data = readFile(addressFile, nameFile);

        String[] arrayName = data.split(" ");

        Map<String, Integer> nameStudentMap = new HashMap<String, Integer>();

        

        for (int index = 0; index < arrayName.length; index++) {
            if (arrayName[index].length() > 1) {
                if (!nameStudentMap.containsKey(arrayName[index])) {
                    nameStudentMap.put(arrayName[index], 1);
                }
                else{
                   Integer temp =nameStudentMap.get(arrayName[index])+1;
                   nameStudentMap.put(arrayName[index], temp);
                }

            }
        }

        nameStudentMap.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);


        



    }
}
