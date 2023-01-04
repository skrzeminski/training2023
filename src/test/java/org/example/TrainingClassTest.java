package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class TrainingClassTest {

    TrainingClass trainingClass;

    @BeforeEach
    void init() {
        trainingClass = new TrainingClass();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void checkIfNumberIsEven(int number) {
        boolean isEven = trainingClass.isEven(number);
        assertThat(isEven).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 11, 21, 31})
    public void checkIfNumberIsOdd(int number) {
        boolean isOdd = trainingClass.isOdd(number);
        assertThat(isOdd).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 17, 19})
    public void checkIfNumberIsPrime(int number) {
        boolean isPrime = trainingClass.isPrime(number);
        assertThat(isPrime).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 10, 12, 14, 16})
    public void checkIfNumberIsNotPrime(int number) {
        boolean isPrime = trainingClass.isPrime(number);
        assertThat(isPrime).isEqualTo(false);
    }

}