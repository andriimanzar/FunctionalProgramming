package com.manzar.task4;

public class FourthTaskTest {
    public static final long SEED = 52;
    public static final long a = 25214903917L;
    public static final int c = 11;
    public static final long m = (long) Math.pow(2, 48);

    public static void main(String[] args) {
        FourthTask.linearCongruentialGenerator(SEED, a, c, m).forEach(System.out::println);
    }
}
