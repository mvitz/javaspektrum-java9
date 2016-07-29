package de.mvitz.javaspektrum.java9.process;

public class DestroyExample {

    public static void main(String[] args) {
        ProcessHandle.current().destroy();
        // throws java.lang.IllegalStateException: destroy of current process not allowed
        System.out.println("Hello, world!");
    }
}
