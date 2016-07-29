package de.mvitz.javaspektrum.java9.process;

public class PidExample {

    public static void main(String[] args) {
        System.out.println(ProcessHandle.current().getPid());
    }
}
