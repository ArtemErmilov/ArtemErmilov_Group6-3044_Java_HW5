package Homework.JAVA_HW5;

import java.io.IOException;
import java.util.*;

/*
Задача 1. Ермилов Артём, группа 6|3044.
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что
1 человек может иметь несколько телефонов.
*/

public class Java_HW5_Example001 {

    private static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        clearConsole();
        Map<String, LinkedList<Integer>> telephoneBook = new HashMap<>();

        LinkedList<Integer> telephoneAE = new LinkedList<>();
        telephoneAE.add(111);
        telephoneAE.add(112);
        telephoneAE.add(113);
        telephoneBook.put("Артём Ермилов",telephoneAE);
        LinkedList<Integer> telephonePP = new LinkedList<>();
        telephoneBook.put("Пётр Петров",telephonePP);
        telephonePP.add(120);
        telephonePP.add(121);
        telephonePP.add(122);
        LinkedList<Integer> telephoneII = new LinkedList<>();
        telephoneBook.put("Иван Иванов",telephoneII);
        telephoneII.add(130);
        telephoneII.add(131);
        telephoneII.add(132);

        System.out.println(telephoneBook);
    }
}
