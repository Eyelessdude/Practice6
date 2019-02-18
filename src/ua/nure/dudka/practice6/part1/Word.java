package ua.nure.dudka.practice6.part1;

public class Word {
    private String content;
    private int frequency;

    public Word(String content) {
        this.content = content;
        this.frequency = 1;
    }


    public int compareTo(Word word) {
        if (this.frequency != word.frequency) {
            return -Integer.compare(this.frequency, word.frequency);
        } else {
            return this.content.compareTo(word.content);
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return content + " : " + frequency;
    }
}
