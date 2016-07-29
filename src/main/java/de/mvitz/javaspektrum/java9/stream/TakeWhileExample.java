package de.mvitz.javaspektrum.java9.stream;

import java.util.stream.Stream;

public class TakeWhileExample {

    public static void main(String[] args) {
        Stream.of("a", "b", "c", "", "e")
                .takeWhile(s -> s.trim().length() != 0)
                .forEach(System.out::print);
    }
}
