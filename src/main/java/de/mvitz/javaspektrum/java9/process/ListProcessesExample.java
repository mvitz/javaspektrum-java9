package de.mvitz.javaspektrum.java9.process;

public class ListProcessesExample {

    public static void main(String[] args) {
        ProcessHandle.allProcesses()
                .map(ProcessHandle::getPid)
                .forEach(System.out::println);
    }
}
