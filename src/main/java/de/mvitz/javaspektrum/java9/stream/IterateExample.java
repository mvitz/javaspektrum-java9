package de.mvitz.javaspektrum.java9.stream;

import java.util.stream.Stream;

public class IterateExample {

    public static void main(String[] args) {
        // infinite stream with limit
        Stream.iterate(1, i -> i + 1).limit(5).forEach(System.out::print);
        System.out.println();

        // finite stream
        Stream.iterate(1, i -> i < 6, i -> i + 1).forEach(System.out::print);
    }
}
