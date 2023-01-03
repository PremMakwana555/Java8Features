package com.apisero.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCreationCollections {

    public static void main(String[] args) {

        //using Collections
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(6);
        integerList.add(9);
        integerList.add(8);
        integerList.add(9);
        integerList.add(19);
        integerList.add(43);
        integerList.add(53);
        integerList.add(89);

        integerList.stream()
                .filter( x -> x < 9)
                .forEach( x -> System.out.println(x));
    }

}
