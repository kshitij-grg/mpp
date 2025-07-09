package part4;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream().filter(word -> word.length() == len)
                .filter(word -> word.indexOf(c) >= 0)
                .filter(word -> word.indexOf(d) == -1)
                .count();
    }
}
