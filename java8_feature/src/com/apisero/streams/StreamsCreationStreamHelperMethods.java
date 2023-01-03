package com.apisero.streams;

import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsCreationStreamHelperMethods {

    public static void main(String[] args) {

        //TODO:  Stream.of() method
        Stream<Integer> integerStream = Stream.of(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);

        integerStream
                .limit(5)
                .forEach(System.out::println);















        //TODO:  Stream.builder() method

        //builder creation
        Stream.Builder<Double> doubleBuilder = Stream.<Double>builder();
        //Stream creation
        Stream<Double> decimal = doubleBuilder.add(4.6).add(6.8).add(6.3).add(9.2).build();

        int sum = decimal
                .mapToInt(d -> (int) Math.round(d))
                .sum();














        //TODO: Stream.iterate() method
        //infinite stream
        Stream<Integer> newStreamofInteger = Stream.iterate(10, n -> n + 1);

        int count = newStreamofInteger
                .limit(5)
                .mapToInt(i -> i)
                .sum();















        //TODO: Stream.generate() method
        //infinite stream
        Stream<Integer> infiniteStream = Stream.generate(() -> new Random().nextInt());

        int getSum = infiniteStream
                .limit(10)
                .mapToInt(i -> i)
                .sum();












        //TODO: Stream.empty() method
        //empty stream
        Stream<String> getMyStream = Stream.empty();

    }
}
