package com.manzar.task3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdTask {

    private ThirdTask() {
    }

    public static String findNumbersAndSort(String[] input) {
        return Arrays.stream(input).map(str -> str.split(",")).
                flatMap(Stream::of).map(Integer::parseInt).sorted().map(Object::toString).
                collect(Collectors.joining(", "));
    }
}
