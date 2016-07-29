package de.mvitz.javaspektrum.java9.optional;

import java.util.Optional;

public class IfPresentOrElseExample {

    interface Spoon {}

    public static void main(String[] args) {
        Optional.<Spoon>empty().ifPresentOrElse(
                (s) -> System.out.println("Found spoon:" + s),
                () -> System.out.println("There is no spoon!"));
    }
}
