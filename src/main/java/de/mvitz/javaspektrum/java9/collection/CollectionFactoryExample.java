package de.mvitz.javaspektrum.java9.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryExample {

    public static void main(String[] args) {
        List.of(1, 2, 3);
        Set.of(1, 2, 1);
        Map.of("foo", "bar");
        Map.ofEntries(Map.entry("foo", "bar"));
    }
}
