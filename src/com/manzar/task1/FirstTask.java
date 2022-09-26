package com.manzar.task1;

import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {

    private FirstTask(){}

    public static String joinOddIndexNames(List<String> input) {
         return input.stream().filter(str -> input.indexOf(str) % 2 != 0).
                 map(str -> input.indexOf(str) + ". " + str
        ).collect(Collectors.joining(", "));
    }
}
