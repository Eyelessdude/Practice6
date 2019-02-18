package ua.nure.dudka.practice6.part6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;

public class Part6 {
    private static final String SPLITERATOR = "[\\s,]+";
    public static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            return sb.toString().trim();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }

    private static SortedSet<Map.Entry<Integer, Integer>> sortSetByValue(Map<Integer, Integer> map) {

        SortedSet<Map.Entry<Integer, Integer>> sortedSet = new TreeSet<>(
                (Map.Entry<Integer, Integer>e1, Map.Entry<Integer, Integer> e2) -> {
                    int value = e2.getValue().compareTo(e1.getValue());
                    if (value != 0) {
                        return value;
                    }

                    return e1.getKey().compareTo(e2.getKey());
                });

        sortedSet.addAll(map.entrySet());
        return sortedSet;
    }

    public static void frequency(String input) {

        String[] strings = input.split(SPLITERATOR);
        Map<Integer, Integer> map = new HashMap<>();
        List<String> sList = new ArrayList<>();
        int freq;
        for (int i = 0; i < strings.length; i++) {
            if (sList.contains(strings[i])) {
                continue;
            }
            sList.add(strings[i]);
            freq = 0;
            int j = input.indexOf(strings[i]);
            while (j != -1) {
                freq++;
                j = input.indexOf(strings[i], j + 1);
            }
            map.put(i, freq);
        }
        SortedSet<Map.Entry<Integer, Integer>> sortedSet = sortSetByValue(map);

        Map<String, Integer> treeMap = new TreeMap<>(
                Comparator.reverseOrder());

        int i = 0;
        for (Map.Entry<Integer, Integer> ent : sortedSet) {
            treeMap.put(strings[ent.getKey()], ent.getValue());
            if (i++ == 2) {
                break;
            }
        }
        for (Map.Entry<String, Integer> ent : treeMap.entrySet()) {
            System.out.println(ent.getKey() + " ==> " + ent.getValue());
        }
    }

    public static void length(String input) {

        String[] strings = input.split(SPLITERATOR);
        Map<Integer, Integer> map = new TreeMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (list.contains(strings[i])) {
                continue;
            }
            list.add(strings[i]);
            map.put(i, strings[i].length());
        }

        SortedSet<Map.Entry<Integer, Integer>> sortedSet = sortSetByValue(map);

        int i = 0;
        for (Map.Entry<Integer, Integer> ent : sortedSet) {
            System.out.println(strings[ent.getKey()] + " ==> " + ent.getValue());
            if (i == 2) {
                break;
            }
            i++;
        }
    }

    public static void duplicates(String input) {

        String[] strings = input.split(SPLITERATOR);
        List<String> sList = new ArrayList<>();
        for (String s : strings) {
            if (!sList.contains(s)) {
                int i = input.indexOf(s);
                i = input.indexOf(s, i + 1);
                if (i != -1) {
                    sList.add(s);
                }
                if (sList.size() == 3) {
                    break;
                }
            }
        }

        for (String s : sList) {
            String reverse = new StringBuffer(s.toUpperCase()).reverse().toString();
            System.out.println(reverse);
        }
    }

    public static void main(String[] args) {
        String s = args[1];
        String method = args[3];
        String input = Part6.getInput(s);

        if ("frequency".equals(method)) {
            Part6.frequency(input);
            System.out.println();
        } else if ("length".equals(method)) {
            Part6.length(input);
            System.out.println();
        } else {
            Part6.duplicates(input);
        }
    }
}
