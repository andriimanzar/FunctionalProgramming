package com.manzar.task5;

import java.util.stream.Stream;

public class FifthTaskTest {
    public static void main(String[] args) {
        FifthTask.zip(
                        Stream.of(1, 2, 3, 12, 251, 512, 51, 100, 50),
                        Stream.of(515, 551, 5, 512, 15, 512, 521, 51, 5)).
                forEach(System.out::println);
    }
}
