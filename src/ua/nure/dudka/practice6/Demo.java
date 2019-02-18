package ua.nure.dudka.practice6;

import ua.nure.dudka.practice6.part1.Part1;
import ua.nure.dudka.practice6.part2.Part2;
import ua.nure.dudka.practice6.part5.Part5;
import ua.nure.dudka.practice6.part6.Part6;
import ua.nure.dudka.practice6.part7.Part7;

public class Demo {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~Part1");
        Part1.main(new String[]{});
        System.out.println("~~~~~~~~~~~~Part2");
        Part2.main(new String[]{});
        System.out.println("~~~~~~~~~~~~Part5");
        Part5.main(new String[]{});
        System.out.println("~~~~~~~~~~~~Part6");
        Part6.main(new String[] {"--input", "part6.txt", "--task", "length"});
        Part6.main(new String[] {"--input", "part6.txt", "--task", "frequency"});
        Part6.main(new String[] {"--input", "part6.txt", "--task", "duplicates"});
        System.out.println("~~~~~~~~~~~~Part7");
        Part7.main(new String[]{});
    }
}
