package com.epam.rd.autotasks;

/**
 * - Constructor of the `CompleteByRequestTask` takes no parameters.
 * - Calling `execute` method on the task does not make it finished until the `complete` method is called.
 * - Once the `complete` method is called, the next call to `execute` makes the task finished.
 * Note that the task is not finished right after calling the `complete` method.
 * The task finishes **only** when subsequent call to `execute` occurs.
 */

public class CompleteByRequestTask implements Task {

    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isFinished() {
        throw new UnsupportedOperationException();
    }

    public void complete() {
        throw new UnsupportedOperationException();
    }
}
