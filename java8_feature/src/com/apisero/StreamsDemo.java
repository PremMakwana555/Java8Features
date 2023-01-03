package com.apisero;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {

        List<String> dataSource = new ArrayList<String>();

        dataSource.add("this");
        dataSource.add("is");
        dataSource.add("a");
        dataSource.add("test");
        dataSource.add("it");
        dataSource.add("is");
        dataSource.add("a");
        dataSource.add("test");
        dataSource.add("copy");
        dataSource.add("YIPPEEE");

        long count = dataSource.stream()
                .distinct()
                .filter( (word) -> { return word.length() >= 4 ;})
                .count();

        System.out.printf("Collection has %d distinct words of 4 or more characters%n", count);

    }
}
