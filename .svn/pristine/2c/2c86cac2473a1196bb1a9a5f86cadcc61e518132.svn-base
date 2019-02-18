package ua.nure.dudka.practice6.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WordContainer {
    private static final String ENCODING = "Cp1251";
    private List<Word> words = new ArrayList<>();

    public boolean add(Word word) {
        boolean flag = true;

        for (Word wordFromCollection : words) {
            if (wordFromCollection.getContent().equals(word.getContent())) {
                int wordFrequency = wordFromCollection.getFrequency();
                wordFromCollection.setFrequency(++wordFrequency);
                flag = false;
            }
        }

        if (flag) {
            words.add(word);
        }

        return flag;
    }

    public void sort(Comparator<Word> comparator) {
        words.sort(comparator);
    }

    public void print() {
        for (Word word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        WordContainer wordContainer = new WordContainer();
        Scanner scanner = new Scanner(System.in, ENCODING);
        String text;

        while (true) {
            text = scanner.next();
            if ("stop".equals(text)) {
                break;
            }

            wordContainer.add(new Word(text));
        }

        scanner.close();

        Comparator<Word> comparator = Word::compareTo;
        wordContainer.sort(comparator);
        wordContainer.print();
    }
}
