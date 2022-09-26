package com.manzar.task4;

import java.util.stream.Stream;

public class FourthTask {

    private FourthTask(){}

    public static Stream<Long> linearCongruentialGenerator(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> ((a * x + c) % m));
    }
}
