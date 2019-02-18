package ua.nure.dudka.practice6.part7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    private Integer maxIterations;
    private Integer startIndex;
    private Integer endIndex;
    private boolean reverse;
    private Integer counter;

    Range(Integer startIndex, Integer endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.maxIterations = endIndex - startIndex;
        this.counter = 0;
    }

    Range(Integer startIndex, Integer endIndex, boolean reverse) {
        this(startIndex, endIndex);
        this.reverse = reverse;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return maxIterations >= counter;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("There is no elements to iterate through!");
                }

                if (reverse) {
                    counter++;
                    return endIndex--;
                } else {
                    counter++;
                    return startIndex++;
                }
            }
        };
    }
}
