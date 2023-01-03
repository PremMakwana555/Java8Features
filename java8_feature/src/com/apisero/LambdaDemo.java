package com.apisero;

public class LambdaDemo {

    @FunctionalInterface
    interface Converter<T,R>{
        R apply(T source);
    }
    public static void main(String[] args) {

        Converter<String, Boolean> str2BooleanConverter = s -> {return  Boolean.parseBoolean(s);};

        System.out.println(str2BooleanConverter.apply("True"));
        System.out.println(str2BooleanConverter.apply("tRue"));
        System.out.println(str2BooleanConverter.apply("FaLSE"));
        System.out.println(str2BooleanConverter.apply("fALSE"));
        System.out.println(str2BooleanConverter.apply("TrUe"));












        Converter<Boolean, Integer> bool2Int = b -> b ? 1 : 0;
        System.out.println(bool2Int.apply(true));
    }
}
