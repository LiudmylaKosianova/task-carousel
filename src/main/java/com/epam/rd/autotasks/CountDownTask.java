package com.epam.rd.autotasks;



public class CountDownTask implements Task{
    public int countdown, executeWasCalled;

    /**
     * constructor of `CountDownTask` takes a single int value as a parameter.
     * It is the initial value of the countdown.
     * Input value must not be negative. If it is, set zero value.
     * @param value
     */

    public CountDownTask(int value) {
        //throw new UnsupportedOperationException();
        if(value>0){
            this.countdown = value;
        }else{
            this.countdown = 0;
        }
    }

    public int getValue() {
        //throw new UnsupportedOperationException();
        return this.countdown;
    }

    /**
     * Each time the `execute` method is called, this value decrements by one, until it reaches zero.
     * Then the `execute` method no longer decrements the value and the task is considered finished.
     */
    @Override
    public void execute() {
        //throw new UnsupportedOperationException();
        while(countdown!=0){
            executeWasCalled++;
            countdown = countdown-executeWasCalled;
        }
    }

    @Override
    public boolean isFinished() {
        //throw new UnsupportedOperationException();
        return countdown==0;
    }
}
