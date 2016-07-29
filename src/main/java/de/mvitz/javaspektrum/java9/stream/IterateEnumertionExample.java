package de.mvitz.javaspektrum.java9.stream;

import java.util.Enumeration;
import java.util.stream.Stream;

public class IterateEnumertionExample {

    public static void main(String[] args) {
        final Enumeration<Object> properties = System.getProperties().elements();
        if (properties.hasMoreElements()) {
            Stream.iterate(properties.nextElement(),
                    p -> properties.hasMoreElements(),
                    p -> properties.nextElement())
                .forEach(System.out::println);
        }
    }
}
