package com.epam.rd.autotasks;

/**
 * - The constructor of `CountDownTask` takes a single int value as a parameter.
 *     It is the initial value of the countdown.
 *     Input value must not be negative. If it is, set zero value.
 *   - Each time the `execute` method is called, this value decrements by one, until it reaches zero.
 *     Then the `execute` method no longer decrements the value and the task is considered finished.
 *   - If the task is initialized with zero value, consider it finished right upon creating.
 *   - Value of the task is accessible via getter.
 */

public class CountDownTask implements Task{

    public CountDownTask(int value) {
        //throw new UnsupportedOperationException();

    }

    public int getValue() {
        throw new UnsupportedOperationException();
    }


    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isFinished() {
        throw new UnsupportedOperationException();
    }
}
