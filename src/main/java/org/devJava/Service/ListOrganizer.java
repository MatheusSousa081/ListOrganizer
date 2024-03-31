package org.devJava.Service;

import java.util.List;

public class ListOrganizer {
    public void organizeAlphabetically(List<String> list) {
        try {

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).compareTo(list.get(j)) > 0) {
                        String temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void organizeNumerically(List<Integer> list) {
        try {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) > list.get(j)) {
                        int temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
