package com.apisero;

import java.util.stream.Stream;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        //builder creation
        Stream.Builder<Double> doubleBuilder = Stream.<Double>builder();
        //Stream creation
        Stream<Double> decimal = doubleBuilder.add(4.6).add(6.8).add(6.3).add(9.2).build();

        int sum = decimal
                .mapToInt(d -> (int) Math.round(d))
                .sum();

        out.println(sum);
    }
}
