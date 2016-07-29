package de.mvitz.javaspektrum.java9.version;

public class VersionExample {

    public static void main(String[] args) {
        final Runtime.Version version = Runtime.version();
        System.out.println(version.toString());
        System.out.println(version.major() + "." + version.minor() + "." + version.security());

        final Runtime.Version newVersion = Runtime.Version.parse("9.1");
        System.out.println(newVersion.compareTo(version));
    }
}
