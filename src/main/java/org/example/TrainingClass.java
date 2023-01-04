package org.example;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class TrainingClass {

    public boolean isPrime(int number) {
        if (number < 2) return false;
        return IntStream.range(2, number).noneMatch(index -> number % index == 0);
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
