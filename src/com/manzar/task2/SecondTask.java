package com.manzar.task2;

import java.util.Comparator;
import java.util.List;

public class SecondTask {

    private SecondTask() {
    }

    public static List<String> toUpperCaseAndSortedDesc(List<String> input) {
        return input.stream().map(String::toUpperCase).
                sorted(Comparator.reverseOrder()).
                toList();
    }
}
