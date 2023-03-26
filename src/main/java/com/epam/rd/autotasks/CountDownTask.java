package com.epam.rd.autotasks;



public class CountDownTask implements Task{
    public int value;


    /**
     * constructor of `CountDownTask` takes a single int value as a parameter.
     * It is the initial value of the countdown.
     * Input value must not be negative. If it is, set zero value.
     * @param value
     */

    public CountDownTask(int value) {
        //throw new UnsupportedOperationException();
        if(value>0){
            this.value = value;
        }else{
            this.value = 0;
        }
    }

    public int getValue() {

        return this.value;
    }

    /**
     * Each time the `execute` method is called, this value decrements by one, until it reaches zero.
     * Then the `execute` method no longer decrements the value and the task is considered finished.
     */
    @Override
    public void execute() {

        if(value-1 >= 0){
            value --;
        }



    }

    @Override
    public boolean isFinished() {
        //throw new UnsupportedOperationException();
        return value == 0;
    }


}
