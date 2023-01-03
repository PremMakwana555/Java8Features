package com.apisero;

@FunctionalInterface
public interface Decider {
    Boolean decide(int value);
}
