package de.mvitz.javaspektrum.java9.stream;

import java.util.stream.Stream;

public class TakeAndDropWhileExample {

    public static void main(String[] args) {
        Stream.of("<html>",
                    "<head>",
                      "<title>Foo</title>",
                    "</head>",
                    "<body>",
                      "<h1>Foo</h1>",
                      "<p>Some text</p>",
                    "</body>",
                  "</html>")
                .dropWhile(s -> !"<body>".equals(s))
                .skip(1)
                .takeWhile(s -> !"</body>".equals(s))
                .forEach(System.out::println);
    }
}
