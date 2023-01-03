package com.apisero;

import java.io.PrintStream;
import java.util.Objects;
import java.util.stream.Stream;

public class MethodReference {

    public static void main(String[] args) {

        class Quote {
            private String quote;

            public Quote(String quote) {
                this.quote = quote;
            }

            public String getQuote() {
                return quote;
            }

            public void setQuote(String quote) {
                this.quote = quote;
            }
        }


        PrintStream log = System.out;

        String[][] quotes = new String[][]{

                {"The greatest glory in living lies not in never falling, but in rising every time we fall.", "-Nelson Mandela"},
                {"Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking.", "-Steve Jobs"},
                {"Life is what happens when you're busy making other plans.", "-John Lennon"}
        };

        Stream.of(quotes)
                .map(q -> q[0])
                .filter(Objects::nonNull)  // static methods
                .peek(log::println)        // Instance method of a particular object
                .map(String::toUpperCase)        // Instance method of a arbitrary object
                .map(q -> new Quote(q))            //constructor
                .forEach(q -> log.println(q.getQuote()));

    }
}
