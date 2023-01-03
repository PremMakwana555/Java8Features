package com.apisero.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCreationArrays {

    public static void main(String[] args) {

        String[] array = new String[]{"a", "b", "c", "d"};

        List<String> upper =
                Arrays.stream(array)
                        .map(w -> w.toUpperCase())
                        .collect(Collectors.toList());

        upper.forEach(w -> System.out.println(w));


    }

}
