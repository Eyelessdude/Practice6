package ua.nure.dudka.practice6.part1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Part1 {
    private static final InputStream STD_IN = System.in;

    public static void main(String[] args) {
        String input = "asd asdf asd asdf asd^" +
                "43 asdsf 43 43^" +
                "434 stop";

        System.setIn(new ByteArrayInputStream(
                input.replace("^", System.lineSeparator()).getBytes(StandardCharsets.ISO_8859_1)
        ));
        WordContainer.main(args);
        System.setIn(STD_IN);
    }
}
