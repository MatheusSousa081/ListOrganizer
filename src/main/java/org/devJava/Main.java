package org.devJava;

import org.devJava.Service.ListOrganizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOrganizer listOrganizer = new ListOrganizer();
        List<String> list = Arrays.asList("Carlos", "Alberto", "Matheus", "Lucas", "Bruno");
        List<Integer> listOfNumbers = Arrays.asList(3, 1, 6, 8, 2 , 8, 5);

        for (String listOfWords : list) {
            System.out.println(listOfWords);
        }

        listOrganizer.organizeAlphabetically(list);
        System.out.println();
        for (String listOfWords : list) {
            System.out.println(listOfWords);
        }

        System.out.println();
        listOrganizer.organizeNumerically(listOfNumbers);
        for(Integer listNumbers : listOfNumbers) {
            System.out.println(listNumbers);
        }
    }
}