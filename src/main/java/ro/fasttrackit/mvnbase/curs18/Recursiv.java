package ro.fasttrackit.mvnbase.curs18;

public class Recursiv {
    public int length(String word) {
        if (word == null) throw new IllegalArgumentException("word cannot be null");
        return 0;
    }
}