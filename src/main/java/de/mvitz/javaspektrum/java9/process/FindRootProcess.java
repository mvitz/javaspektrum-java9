package de.mvitz.javaspektrum.java9.process;

public class FindRootProcess {

    public static void main(String[] args) {
        ProcessHandle.allProcesses()
                .filter(p -> !p. parent().isPresent())
                .map(p -> p.info())
                .forEach(System.out::println);
    }
}
