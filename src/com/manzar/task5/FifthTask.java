package com.manzar.task5;

import java.util.Iterator;
import java.util.stream.Stream;

public class FifthTask {

    private FifthTask(){}

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream<T> mixedStream = Stream.empty();
        Iterator<T> firstStreamIterator = first.iterator();
        Iterator<T> secondStreamIterator = second.iterator();
        while (firstStreamIterator.hasNext() && secondStreamIterator.hasNext()) {
            mixedStream = Stream.concat(mixedStream, Stream.of(firstStreamIterator.next(), secondStreamIterator.next()));
        }
        return mixedStream;
    }
}
